import java.util.Scanner;

/**
 * NumberSumAccumulator.java - Stores multiple values in an array up to a
 * maximum of 10 or until the user enters 0 or a negative number.
 * Displays all stored numbers and their sum.
 *
 * @author Aaditya Anand
 * @version 1.0
 * @since Level 1
 */
public class NumberSumAccumulator {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Define constants
        final int MAX_SIZE = 10;

        // Define array to store up to 10 double values
        double[] numbers = new double[MAX_SIZE];

        // Initialize total and index variables
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to " + MAX_SIZE + " numbers (enter 0 or negative to stop):");

        // Use infinite while loop to collect input
        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double userEntry = input.nextDouble();

            // Break if user entered 0 or a negative number
            if (userEntry <= 0) {
                break;
            }

            // Break if the array has reached maximum capacity
            if (index == MAX_SIZE) {
                System.out.println("Maximum of " + MAX_SIZE + " numbers reached.");
                break;
            }

            // Store the valid number in the array and increment index
            numbers[index] = userEntry;
            index++;
        }

        // Check if any numbers were entered
        if (index == 0) {
            System.out.println("No numbers were entered.");
        } else {
            // Calculate the total by looping through stored values
            System.out.println("\n--- Numbers Entered ---");
            for (int i = 0; i < index; i++) {
                total += numbers[i];
                System.out.println("Number " + (i + 1) + ": " + numbers[i]);
            }

            // Display the total
            System.out.println("\nTotal Sum: " + total);
        }

        // Close the Scanner object
        input.close();
    }
}
