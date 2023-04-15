package chapter3e;

import java.util.Scanner;

public class GradeMessage {
    private static final String GRADE_A_MESSAGE = "Excellent Job!";
    private static final String GRADE_B_MESSAGE = "Great Job!";
    private static final String GRADE_C_MESSAGE = "Good Job!";
    private static final String GRADE_D_MESSAGE = "You need to work a bit harder";
    private static final String GRADE_E_MESSAGE = "You passed";
    private static final String GRADE_F_MESSAGE = "Uh oh!";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //1. Ask for letter grade
        System.out.print("Enter letter grade: ");

        String message = null;
        while (message == null)
        {
            char letterGrade = scanner.next().charAt(0);

            //2. Use Switch statement to get assign correct grade message to message variable

            switch (letterGrade) {
                case 'A' -> message = GRADE_A_MESSAGE;
                case 'B' -> message = GRADE_B_MESSAGE;
                case 'C' -> message = GRADE_C_MESSAGE;
                case 'D' -> message = GRADE_D_MESSAGE;
                case 'E' -> message = GRADE_E_MESSAGE;
                case 'F' -> message = GRADE_F_MESSAGE;
                default -> System.out.print("Error, invalid grade. Try again: ");
            }

        }

        //3. Display message
        System.out.println(message);
    }
}
