package chapter5;


import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args) {
        double minimumSalary = 30000;
        Period minimumExperience = Period.of(2, 0,0);
        LocalDate currentDate = LocalDate.now();
        Scanner scanner = new Scanner(System.in);

        //1. Ask for current salary
        System.out.print("Enter current Salary: ");
        double salary = scanner.nextDouble();

        //2. Ask for the starting date of current job
        System.out.print("Enter starting date of current job in number form without leading zeros as year,month,day: ");
        LocalDate startingDate = getLocalDateFromString(scanner.next());
        scanner.close();

        //3. Calculate period between statingDate and currentDate
        Period experiencePeriod = Period.between(startingDate, currentDate);

        //4. Validate qualifiers
        boolean salaryQualifier = salary >= minimumSalary;
        boolean experienceQualifier = experiencePeriod.getYears() >= minimumExperience.getYears();


        //5. Display Result
        if(salaryQualifier && experienceQualifier) {
            System.out.println("You qualify for a loan!");
        } else {
            System.out.println("Unfortunately you don't qualify for a loan.");
            if(!salaryQualifier) {
                double salaryShortFall = minimumSalary - salary;
                System.out.printf("Your salary is %f below the minimum \n", salaryShortFall);

            }
            if(!experienceQualifier) {
                Period experienceShortFall = minimumExperience.minus(experiencePeriod).normalized();

                System.out.printf("You work experience is %d year and %d month's below the minimum work period \n",
                        experienceShortFall.getYears(),
                        experienceShortFall.getMonths());
            }
        }
    }

    public static LocalDate getLocalDateFromString(String date) {
        String[] yearMonthDay = date.split(",");
        return LocalDate.of(
                Integer.parseInt(yearMonthDay[0]),
                Integer.parseInt(yearMonthDay[1]),
                Integer.parseInt(yearMonthDay[2]));
    }
}
