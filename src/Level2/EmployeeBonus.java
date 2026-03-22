import java.util.Scanner;

/**
 * EmployeeBonus.java - Calculates the bonus for 10 employees of Zara
 * based on their years of service and computes the total bonus payout,
 * along with old and new salaries.
 *
 * Bonus Rules:
 *   - More than 5 years of service: 5% bonus
 *   - Less than or equal to 5 years: 2% bonus
 *
 * @author Aaditya Anand
 * @version 1.0
 * @since Level 2
 */
public class EmployeeBonus {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Define constants
        final int TOTAL_EMPLOYEES = 10;
        final double SENIOR_BONUS_PERCENT = 5.0;
        final double JUNIOR_BONUS_PERCENT = 2.0;
        final double SENIOR_THRESHOLD_YEARS = 5.0;
        final double PERCENT_DIVISOR = 100.0;

        // Arrays to store salary and years of service for each employee
        double[] salaries = new double[TOTAL_EMPLOYEES];
        double[] yearsOfService = new double[TOTAL_EMPLOYEES];

        // Arrays to store new salary and bonus amount
        double[] newSalaries = new double[TOTAL_EMPLOYEES];
        double[] bonusAmounts = new double[TOTAL_EMPLOYEES];

        // Variables to store totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Take input for all 10 employees
        System.out.println("Enter salary and years of service for each employee:");
        for (int i = 0; i < TOTAL_EMPLOYEES; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");

            // Validate salary input — must be positive
            while (true) {
                System.out.print("  Salary: ");
                salaries[i] = input.nextDouble();
                if (salaries[i] > 0) {
                    break;
                }
                System.out.println("  Invalid salary. Please enter a positive value.");
            }

            // Validate years of service — must be non-negative
            while (true) {
                System.out.print("  Years of Service: ");
                yearsOfService[i] = input.nextDouble();
                if (yearsOfService[i] >= 0) {
                    break;
                }
                System.out.println("  Invalid years of service. Please enter a non-negative value.");
            }
        }

        // Calculate bonus, new salary and totals for each employee
        for (int i = 0; i < TOTAL_EMPLOYEES; i++) {
            double bonusPercent;

            // Determine bonus percentage based on years of service
            if (yearsOfService[i] > SENIOR_THRESHOLD_YEARS) {
                bonusPercent = SENIOR_BONUS_PERCENT;
            } else {
                bonusPercent = JUNIOR_BONUS_PERCENT;
            }

            // Calculate and store bonus and new salary
            bonusAmounts[i] = salaries[i] * bonusPercent / PERCENT_DIVISOR;
            newSalaries[i] = salaries[i] + bonusAmounts[i];

            // Accumulate totals
            totalBonus += bonusAmounts[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Display results for each employee
        System.out.println("\n--- Employee Bonus Report ---");
        System.out.printf("%-6s %-12s %-12s %-10s %-12s%n",
                "Emp#", "Old Salary", "Years", "Bonus", "New Salary");
        System.out.println("--------------------------------------------------------------");
        for (int i = 0; i < TOTAL_EMPLOYEES; i++) {
            System.out.printf("%-6d %-12.2f %-12.1f %-10.2f %-12.2f%n",
                    (i + 1), salaries[i], yearsOfService[i], bonusAmounts[i], newSalaries[i]);
        }

        // Display totals
        System.out.println("--------------------------------------------------------------");
        System.out.printf("Total Bonus Payout:    %.2f%n", totalBonus);
        System.out.printf("Total Old Salary:      %.2f%n", totalOldSalary);
        System.out.printf("Total New Salary:      %.2f%n", totalNewSalary);

        // Close the Scanner object
        input.close();
    }
}
