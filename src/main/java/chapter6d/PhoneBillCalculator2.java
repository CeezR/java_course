package chapter6d;

import java.math.BigDecimal;

public class PhoneBillCalculator2 {
    public static void main(String[] args) {
        PhoneBill bill = new PhoneBill("1234");
        bill.setBaseCost(new BigDecimal("1000.00"));
        bill.setAllottedMinutes(800);
        bill.setMinutesUsed(900);
        bill.printItemizedBill();
    }
}
