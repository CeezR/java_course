package chapter4;

import java.util.Scanner;

public class SalaryCalculator2 {
    public static void main(String[] args) {
        // Initialize know values
        int salary = 1000;
        int minimumSales = 10;

        Scanner scanner = new Scanner(System.in);

        // Get values from the unknown (number of sales)
        System.out.print("Enter number of sales: ");
        int sales = scanner.nextInt();
        scanner.close();
        // Output

        if(sales >= minimumSales){
            System.out.print("Congratulation!");
        } else {
            int salesShort = minimumSales - sales;
            System.out.printf("Unfortunatly you are %d sales short.", salesShort);
        }

    }
}
