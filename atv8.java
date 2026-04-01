public class Main {

    static int inverter(int num){
        int inv = 0;

        while(num > 0){
            inv = inv * 10 + num % 10;
            num = num / 10;
        }

        return inv;
    }

    public static void main(String[] args){
        System.out.println(inverter(123));
    }
}   