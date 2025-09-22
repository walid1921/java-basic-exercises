import java.util.Scanner;

// Calculate the circumference and area of a circle

public class CircleCalculations {
    public static void main(String[] args) {

        final double PI = 3.14159;
        // final means the value cannot be changed like a constant in javaScript

        Scanner sc = new Scanner(System.in);

        System.out.print("Radius: ");
        double radius = sc.nextDouble();

        double circumference = 2 * PI * radius;
        double area = PI * Math.pow(radius, 2); // radius * radius

        System.out.printf("Circumference: " + circumference + "\nArea: " + area);

        sc.close();
    }
}
