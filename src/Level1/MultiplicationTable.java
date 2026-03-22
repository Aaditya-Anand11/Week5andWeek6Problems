import java.util.Scanner;

/**
 * MultiplicationTable.java - Creates a multiplication table for a number
 * entered by the user from 1 to 10, stores results in an array, and
 * displays the table.
 *
 * @author Aaditya Anand
 * @version 1.0
 * @since Level 1
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Define constants
        final int TABLE_LIMIT = 10;
        final int TABLE_START = 1;

        // Take user input for the number
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = input.nextInt();

        // Validate the input number
        if (number <= 0) {
            System.err.println("Invalid input. Please enter a positive integer.");
            System.exit(0);
        }

        // Define an integer array to store the multiplication results
        int[] multiplicationResult = new int[TABLE_LIMIT];

        // Run a loop from 1 to 10 and store the results in the array
        for (int i = TABLE_START; i <= TABLE_LIMIT; i++) {
            multiplicationResult[i - 1] = number * i;
        }

        // Display the multiplication table from the array
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 0; i < multiplicationResult.length; i++) {
            int multiplier = i + TABLE_START;
            System.out.println(number + " * " + multiplier + " = " + multiplicationResult[i]);
        }

        // Close the Scanner object
        input.close();
    }
}
