import java.util.Scanner;

// Convert Celsius to Fahrenheit
// F = 9/5 * C + 32

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Temperatur in °Celsius: ");
        double c = sc.nextDouble();

        double f = 9.0/5 * c + 32;
        System.out.printf( c + " °C sind: " + f + " F");

        sc.close();

    }
}
