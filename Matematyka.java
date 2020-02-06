import java.util.Scanner;

public class Matematyka {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj liczbe czalkowita");
        int number = scan.nextInt();

        float pi = (float) Math.PI;
        pi *= 100;
        pi = Math.round(pi);
        pi /= 100;

        System.out.println(pi);


        int factorial = 1;
        int n = number;
        while(number > 1){
            factorial = factorial * number;
            number--;
        }

        System.out.println(n + "! = " + factorial);

    }
}
