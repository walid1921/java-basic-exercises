import java.util.Scanner;


public class AverageMonth {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Rainfall in April: ");
        double april = sc.nextDouble();

        System.out.println("Rainfall in Mai: ");
        double mai = sc.nextDouble();


        System.out.println("Rainfall in Juni: ");
        double juni = sc.nextDouble();

        double average = (april + mai + juni) / 3;

        System.out.println("Average rainfall in April, Mai and Juni: " + average);

        sc.close();

    }
}
