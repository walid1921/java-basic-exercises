import java.util.Scanner;

// Calculate the netto and brutto price of gas and calculate the VAT rate

public class GasStation {
    public static void main(String[] args) {

        double vat = 0.19; // 19%

        Scanner sc = new Scanner(System.in);

        System.out.print("Getankte Liter: ");
        double liter = sc.nextDouble();

        System.out.print("Nettopreis je Liter in EUR: ");
        double nettoPreis = sc.nextDouble();

        double nettoBetrag = liter * nettoPreis;
        double umsatzsteuer = nettoBetrag * vat;
        double bruttoBetrag = nettoBetrag + umsatzsteuer;

        System.out.printf("\nNettobetrag: " + nettoBetrag + "\nUmsatzsteuer: " + umsatzsteuer + "\nBruttobetrag: " + bruttoBetrag);
        sc.close();

    }
}
