package chapter4a;

import java.util.Scanner;

public class PayCalculator {

    public static final int RATE = 15;
    public static final int MAXIMUM_HOURS = 40;
    public static final int MIN_HOURS = 1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for unknown variable
        System.out.print("How many hours did you work this week: ");
        double hoursWorked = scanner.nextDouble();

        // Validate input
        while (hoursWorked > MAXIMUM_HOURS || hoursWorked < MIN_HOURS) {
            System.out.print("Invalid input, try again: ");
            hoursWorked = scanner.nextDouble();
        }

        // Calculate gross
        double gross = RATE * hoursWorked;
        // Display Result
        System.out.printf("Gross pay: %f", gross);

    }
}
