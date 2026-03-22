import java.util.Scanner;

/**
 * DigitFrequency.java - Takes a number as input, finds the frequency of
 * each digit (0–9) in the number using arrays, and displays the result.
 *
 * Steps:
 *   a. Take input for a number
 *   b. Find the count of digits in the number
 *   c. Find the digits and save them in an array
 *   d. Find the frequency of each digit using a frequency array of size 10
 *   e. Display the frequency of each digit
 *
 * @author Aaditya Anand
 * @version 1.0
 * @since Level 3
 */
public class DigitFrequency {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Define frequency array size (digits 0–9)
        final int DIGIT_RANGE = 10;

        // Take input for the number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Validate input — must be non-negative
        if (number < 0) {
            System.err.println("Invalid input. Please enter a non-negative integer.");
            System.exit(0);
        }

        // Handle the case where number is 0
        if (number == 0) {
            System.out.println("\nDigit Frequency:");
            System.out.println("Digit 0: 1 time(s)");
            input.close();
            return;
        }

        // Find the count of digits in the number
        int count = 0;
        int temp = number;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Find the digits in the number and save them in an array
        int[] digits = new int[count];
        int extractTemp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = extractTemp % 10;
            extractTemp /= 10;
        }

        // Define a frequency array of size 10 (one slot for each digit 0–9)
        int[] frequency = new int[DIGIT_RANGE];

        // Loop through the digits array and increase frequency of each digit
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // Display the frequency of each digit that appears at least once
        System.out.println("\nNumber: " + number);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("  Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }

        // Close the Scanner object
        input.close();
    }
}
