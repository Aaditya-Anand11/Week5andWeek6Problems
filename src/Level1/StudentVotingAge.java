import java.util.Scanner;

/**
 * StudentVotingAge.java - Takes user input for the age of 10 students
 * and checks whether each student is eligible to vote based on their age.
 *
 * A student is eligible to vote if their age is 18 or above.
 *
 * @author Aaditya Anand
 * @version 1.0
 * @since Level 1
 */
public class StudentVotingAge {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Define constants
        final int TOTAL_STUDENTS = 10;
        final int VOTING_AGE = 18;

        // Define an array to store the ages of all students
        int[] studentAges = new int[TOTAL_STUDENTS];

        // Take user input for the age of each student
        System.out.println("Enter the ages of " + TOTAL_STUDENTS + " students:");
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Student " + (i + 1) + " age: ");
            studentAges[i] = input.nextInt();
        }

        System.out.println("\n--- Voting Eligibility Results ---");

        // Loop through the array and check voting eligibility
        for (int i = 0; i < studentAges.length; i++) {
            int age = studentAges[i];

            // Check if age is negative (invalid)
            if (age < 0) {
                System.out.println("Student " + (i + 1) + ": Invalid age (" + age + ")");
            } else if (age >= VOTING_AGE) {
                // Student is eligible to vote
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                // Student is not eligible to vote
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }

        // Close the Scanner object
        input.close();
    }
}
