import java.util.Scanner;

// Calculate the liters per 100 km

public class KmCalculator {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Kilometer: ");
        double kilometer = sc.nextDouble();

        System.out.print("Benzin Liter: ");
        double benzinLiter = sc.nextDouble();

        double literPro100Km = (benzinLiter / kilometer) * 100;

        System.out.print("LiterPro100Km: " + literPro100Km);

        sc.close();
    }
}
