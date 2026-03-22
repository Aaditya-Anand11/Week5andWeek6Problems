import java.util.Scanner;

/**
 * NumberAnalysis.java - Takes user input for 5 numbers and checks whether
 * each number is positive, negative, or zero. For positive numbers, also
 * checks if the number is even or odd. Finally compares the first and last
 * elements of the array.
 *
 * @author Aaditya Anand
 * @version 1.0
 * @since Level 1
 */
public class NumberAnalysis {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Define constant for array size
        final int ARRAY_SIZE = 5;

        // Define an integer array of 5 elements
        int[] numbers = new int[ARRAY_SIZE];

        // Take user input for the 5 numbers
        System.out.println("Enter " + ARRAY_SIZE + " integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.println("\n--- Number Analysis ---");

        // Loop through the array and analyse each number
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];

            if (number > 0) {
                // Number is positive — check even or odd
                if (number % 2 == 0) {
                    System.out.println(number + " is Positive and Even.");
                } else {
                    System.out.println(number + " is Positive and Odd.");
                }
            } else if (number < 0) {
                // Number is negative
                System.out.println(number + " is Negative.");
            } else {
                // Number is zero
                System.out.println(number + " is Zero.");
            }
        }

        // Compare first and last elements of the array
        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1];

        System.out.println("\n--- First vs Last Element ---");
        if (firstElement == lastElement) {
            System.out.println("First element (" + firstElement + ") equals Last element (" + lastElement + ").");
        } else if (firstElement > lastElement) {
            System.out.println("First element (" + firstElement + ") is greater than Last element (" + lastElement + ").");
        } else {
            System.out.println("First element (" + firstElement + ") is less than Last element (" + lastElement + ").");
        }

        // Close the Scanner object
        input.close();
    }
}
