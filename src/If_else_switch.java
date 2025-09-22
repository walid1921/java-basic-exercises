import java.util.Scanner;


public class If_else_switch {
    public static void main(String[] args) {


         Scanner sc = new Scanner(System.in);

         System.out.print("Enter your name: ");
         String username = sc.nextLine(); // nextLine() it will wait from the user a string



         if (username.isEmpty()) {

            System.out.println("Name is required!");

        }
         else {

             System.out.print("How old are you: ");
             int age = sc.nextInt();

             System.out.print("Are you student (true/false): ");
             boolean isStudent = sc.nextBoolean();

             if (isStudent && age < 30 ) {
                 System.out.println("Hi! " + username + " you are " + age + "yo " + "and a student");
             }
             else if (!isStudent && age > 30) {
                 System.out.println("Hi! " + username + "you are " + age + "yo " + "and an employed");
             }
             else {
                 System.out.println("You still baby");
             }
        }

        sc.close();

    }
}
