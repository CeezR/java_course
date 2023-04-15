package chapter4b;

import java.util.Scanner;

public class TwoNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean loop;
        do{
            // Ask for two numbers
            System.out.print("Enter two number separated by a comma: ");
            String[] numbers = scanner.next().split(",");
            // Calculate SUM
            double sum = Double.parseDouble(numbers[0]) + Double.parseDouble(numbers[1]);

            // Display Result
            System.out.printf("The sum of %s and %s is equal to %s", numbers[0], numbers[1], String.format("%.2f", sum));

            // Ask for reset
            System.out.println("\n Do you wish to continue. Type true for Yes, false for No");
            loop = scanner.nextBoolean();
        } while (loop);

    }
}
