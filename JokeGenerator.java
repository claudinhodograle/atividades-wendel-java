import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class JokeGenerator {
    private static final String API_URL = "https://official-joke-api.appspot.com/random_joke";

    public static void main(String[] args) {
        try {
            String joke = fetchRandomJoke();
            System.out.println("=== Random Joke ===" );
            System.out.println(joke);
        } catch (Exception e) {
            System.err.println("Error fetching joke: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static String fetchRandomJoke() throws Exception {
        URL url = new URL(API_URL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);
        int responseCode = connection.getResponseCode();
        if (responseCode != 200) {
            throw new Exception("API Error: HTTP " + responseCode);
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();
        connection.disconnect();

        JSONObject jsonResponse = new JSONObject(response.toString());
        String setup = jsonResponse.getString("setup");
        String punchline = jsonResponse.getString("punchline");
        return setup + "\n" + punchline;
    }
}