package Chapter3;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        // Initialize know values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;
        
        Scanner scanner = new Scanner(System.in);

        // Get values from the unknown (number of sales)
        System.out.print("Enter number of sales: ");
        int sales = scanner.nextInt();

        // Quick detour for the bonus earners
        int totalSalary = sales <= quota? salary : salary + bonus;
        // Output

        System.out.printf("Total Salary: %d", totalSalary);
    }
}
