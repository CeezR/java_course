package chapter6d;

import java.math.BigDecimal;

public class PhoneBill {
    private static final double TAX_RATE = 0.15;
    private static final BigDecimal OVERAGE_CHARGE = new BigDecimal("0.25");

    private String id;
    private BigDecimal baseCost;
    private int allottedMinutes;
    private int minutesUsed;

    public BigDecimal getBaseCost() {
        return baseCost;
    }
    public void setBaseCost(BigDecimal baseCost) {
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes) {
        if (allottedMinutes < 0) {
            throw new IllegalArgumentException("Allotted minutes cannot be negative");
        }
        this.allottedMinutes = allottedMinutes;
    }

    public int getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed) {
        if (minutesUsed < 0) {
            throw new IllegalArgumentException("Minutes used cannot be negative");
        }
        this.minutesUsed = minutesUsed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PhoneBill(String id) {
        this.id = id;
    }

    public PhoneBill(String id, BigDecimal baseCost, int allottedMinutes, int minutesUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public BigDecimal calculateOverage() {
        int overageMinutes = Math.max(0, minutesUsed - allottedMinutes);
        return new BigDecimal(overageMinutes).multiply(OVERAGE_CHARGE);
    }

    public BigDecimal calculateTax() {
        return baseCost.add(calculateOverage()).multiply(new BigDecimal(TAX_RATE));
    }

    public BigDecimal calculateTotal() {
        return baseCost.add(calculateOverage()).add(calculateTax());
    }

    public void printItemizedBill() {
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", baseCost));
        System.out.println("Overage: $" + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $" + String.format("%.2f", calculateTax()));
        System.out.println("Total: $" + String.format("%.2f", calculateTotal()));
    }
}

