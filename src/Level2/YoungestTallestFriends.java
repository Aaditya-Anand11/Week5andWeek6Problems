import java.util.Scanner;

/**
 * YoungestTallestFriends.java - Finds the youngest friend and the tallest
 * friend among 3 friends: Amar, Akbar, and Anthony, based on their ages
 * and heights.
 *
 * @author Aaditya Anand
 * @version 1.0
 * @since Level 2
 */
public class YoungestTallestFriends {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Define constants
        final int TOTAL_FRIENDS = 3;

        // Define friend names array
        String[] friendNames = {"Amar", "Akbar", "Anthony"};

        // Arrays to store age and height of the 3 friends
        int[] ages = new int[TOTAL_FRIENDS];
        double[] heights = new double[TOTAL_FRIENDS];

        // Take user input for age and height of each friend
        System.out.println("Enter the age and height for each friend:");
        for (int i = 0; i < TOTAL_FRIENDS; i++) {
            System.out.println("\n" + friendNames[i] + ":");

            // Validate age input
            System.out.print("  Age: ");
            ages[i] = input.nextInt();
            if (ages[i] <= 0) {
                System.err.println("Invalid age for " + friendNames[i] + ".");
                System.exit(0);
            }

            // Validate height input (in cm)
            System.out.print("  Height (cm): ");
            heights[i] = input.nextDouble();
            if (heights[i] <= 0) {
                System.err.println("Invalid height for " + friendNames[i] + ".");
                System.exit(0);
            }
        }

        // Find the youngest friend and the tallest friend
        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < TOTAL_FRIENDS; i++) {
            // Check if current friend is younger
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            // Check if current friend is taller
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("\n--- Results ---");
        System.out.println("Youngest Friend: " + friendNames[youngestIndex]
                + " (Age: " + ages[youngestIndex] + " years)");
        System.out.println("Tallest Friend:  " + friendNames[tallestIndex]
                + " (Height: " + heights[tallestIndex] + " cm)");

        // Close the Scanner object
        input.close();
    }
}
