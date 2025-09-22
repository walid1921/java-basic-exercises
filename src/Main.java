//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Add number 1: ");
        double num1 = sc.nextDouble();

        System.out.println("Add number 2: ");
        double num2 = sc.nextDouble();



        double sum = num1 + num2;
        double diff = num1 - num2;

        System.out.println("Summe: " + sum);
        System.out.println("Differenz: " + diff);

        sc.close();


    }
}

