import java.util.Scanner;

// Create a Java program that tracks a user’s budget by handling income and expenses.

// Create a Java program that:
// - Takes input from the user for their monthly income.
// - Tracks multiple expenses entered by the user and calculates the total expenses.
// - Displays the remaining balance after deducting total expenses from income.
// - Gives a financial warning if the total expenses exceed the income.

// The program should:
// - Prompt the user for their monthly income using the Scanner class.
// - Allow the user to input multiple expenses and sum them up.
// - Calculate and display the remaining balance by subtracting total expenses from income.
// - Display a warning message if total expenses exceed income.

public class BudgetTracker {
    public static void main(String[] args) {

        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their monthly income
        System.out.print("Enter your monthly income: ");
        double income = scanner.nextDouble();

        // Initialize variables for expenses
        double expensesSum = 0;
        double balance;

        // Prompt the user to enter the number of expenses they want to track
        // Remember to consume the newline left-over
        System.out.print("Enter the number of expenses: ");
        int expensesNum = scanner.nextInt();
        scanner.nextLine();

        // Loop to track each expense
        for (int i = 0; i < expensesNum; i++) {
            System.out.print("Enter expense " + (i+1) + ": ");
            double expense = scanner.nextDouble();
            expensesSum += expense;
        }

        // Calculate the remaining balance
        balance = income - expensesSum;

        // Display the total income, total expenses, and remaining balance
        System.out.println("Total Income: $" + income);
        System.out.println("Total Expenses: $" + expensesSum);
        System.out.println("Remaining Balance: $" + balance);

        // Provide a financial warning if expenses exceed income
        if (balance == 0) {
            System.out.println("Warning ⚠️: you have spent all your money for this month, wait until next month ");
        }
    }
}
