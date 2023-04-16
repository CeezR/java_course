package chapter7c;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        int day = scanner.nextInt();
        scanner.close();
        System.out.println(week[day - 1]);
    }
}
