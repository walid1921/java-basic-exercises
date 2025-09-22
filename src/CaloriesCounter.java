import java.util.Scanner;

// Calculate the total calories of 3 foods

public class CaloriesCounter {
    public static void main(String[] args) {

        String food1, food2, food3;
        int food1Cal, food2Cal, food3Cal;
        int totalCalories = 0;

         Scanner sc = new Scanner(System.in);

         System.out.println("Enter food 1: ");
         food1 = sc.nextLine();
         System.out.println("Enter calories of " + food1 + ": ");
         food1Cal = sc.nextInt();
         sc.nextLine(); // Consume newline

        System.out.println("Enter food 2: ");
        food2 = sc.nextLine();
        System.out.println("Enter calories of " + food2 + ": ");
        food2Cal = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.println("Enter food 3: ");
        food3 = sc.nextLine();
        System.out.println("Enter calories of " + food3 + ": ");
        food3Cal = sc.nextInt();
        sc.nextLine(); // Consume newline

        totalCalories = food1Cal + food2Cal + food3Cal;
        System.out.println("Total calories: " + totalCalories);


        sc.close();

    }
}
