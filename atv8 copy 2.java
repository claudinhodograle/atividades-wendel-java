import java.time.LocalTime;

public class Main {

    static void saudacao(String nome){
        int hora = LocalTime.now().getHour();

        if(hora < 12){
            System.out.println("Bom dia " + nome);
        }else{
            System.out.println("Boa tarde " + nome);
        }
    }

    public static void main(String[] args){
        saudacao("Gabriel");
    }
}