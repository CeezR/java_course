package chapter5b;

import java.util.Scanner;

public class PhoneBillCalculator {
    private static final double OVERAGE_MINUTE_FEE = 0.25;
    private static final double TAX = 0.15;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter planFee
        System.out.print("Enter base cost of the plan:");
        double planFee = scanner.nextDouble();
        // Enter overage minute
        System.out.print("\nEnter overage minutes:");
        int overageMinute = scanner.nextInt();
        // Calculate the overage fee
        double overageFee = CalculateOverageFee(overageMinute);
        // Calculate Tax
        double taxFee = CalculateTax(planFee + overageFee);
        // Calculate TotalBill
        double totalBill = totalBill(planFee,overageFee,taxFee);

        System.out.printf("Phone Bill Statement\nPlan: $%s\nOverage: $%s\nTax: $%s\nTotal: $%s",
                String.format("%.2f", planFee),
                String.format("%.2f", overageFee),
                String.format("%.2f", taxFee),
                String.format("%.2f", totalBill));
    }
    private static double CalculateOverageFee(int overageMinute) { return OVERAGE_MINUTE_FEE * overageMinute; }
    private static double CalculateTax(double subtotal) {return subtotal * TAX; }
    private static double totalBill(double planFee, double overageFee, double taxFee) { return planFee + overageFee + taxFee; }


}
