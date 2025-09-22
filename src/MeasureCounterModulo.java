import java.util.Scanner;


// Count the number of measures of a given number using modulo

public class MeasureCounterModulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int gros= number/144;
        int rest = number%144;

        int schock = rest/60;
        rest = rest%60;

        int dutzend = rest/12;
        rest = rest%12;

        int stueck = rest;

        System.out.println("\n" +gros + " Gros\n" +schock + " Schock\n" + dutzend + " Dutzend\n" + stueck + " Stueck");
        sc.close();
    }
}
