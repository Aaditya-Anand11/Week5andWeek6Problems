import java.util.Scanner;

/**
 * LargestSecondLargestDigit.java - Stores the digits of a number in an
 * array and finds the largest and second largest digit.
 * Dynamically resizes the array if the number has more digits than
 * the initial capacity.
 *
 * @author Aaditya Anand
 * @version 1.0
 * @since Level 2
 */
public class LargestSecondLargestDigit {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Define initial digit storage capacity
        int maxDigit = 10;

        // Take user input for the number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Validate input
        if (number < 0) {
            System.err.println("Invalid input. Please enter a non-negative integer.");
            System.exit(0);
        }

        // Handle the case where number is 0 (single digit)
        if (number == 0) {
            System.out.println("The number has only one digit: 0");
            System.out.println("Largest digit: 0, Second Largest: N/A");
            input.close();
            return;
        }

        // Create an array to store the digits
        int[] digits = new int[maxDigit];
        int index = 0;

        // Use a loop to extract digits and store them in the array
        int temp = number;
        while (temp != 0) {
            // Dynamically resize array if index reaches maxDigit
            if (index == maxDigit) {
                maxDigit = maxDigit * 2;
                int[] tempArray = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    tempArray[i] = digits[i];
                }
                digits = tempArray;
            }

            // Remove last digit from number and store in array
            digits[index] = temp % 10;
            temp /= 10;
            index++;
        }

        // Check if there's only one digit
        if (index < 2) {
            System.out.println("Largest digit: " + digits[0]);
            System.out.println("Second Largest digit: N/A (only one digit)");
            input.close();
            return;
        }

        // Initialize largest and second largest to zero
        int largest = 0;
        int secondLargest = 0;

        // Loop through the digits array to find largest and second largest
        for (int i = 0; i < index; i++) {
            int digit = digits[i];

            if (digit > largest) {
                // Current digit is larger than largest — shift down
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                // Current digit is between largest and second largest
                secondLargest = digit;
            }
        }

        // Display results
        System.out.println("\nNumber: " + number);
        System.out.println("Largest Digit:        " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);

        // Close the Scanner object
        input.close();
    }
}
