package chapter6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestScore {
    public static final double MAXIMUM_SCORE = 100.0;
    public static final double MINIMUM_A_SCORE = 90.0;
    public static final double MINIMUM_B_SCORE = 80.0;
    public static final double MINIMUM_C_SCORE = 70.0;
    public static final double MINIMUM_D_SCORE = 60.0;
    public static final double MINIMUM_PASSING_SCORE = 50.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Enter test Score
        System.out.print("Enter test score: ");
        double testScore = scanner.nextDouble();
        DecimalFormat df = new DecimalFormat("#.##");

        //3. Display result
        System.out.printf("Score of %s corresponds to grade %s", df.format(testScore), CalculateLetterGrade(testScore));


    }

    private static String CalculateLetterGrade(double score) {
        String letterGrade;
        if (score >= MINIMUM_A_SCORE && score <= MAXIMUM_SCORE) {
            letterGrade = "A";
        } else if (score >= MINIMUM_B_SCORE) {
            letterGrade = "B";
        } else if (score >= MINIMUM_C_SCORE) {
            letterGrade = "C";
        } else if (score >= MINIMUM_D_SCORE) {
            letterGrade = "D";
        } else if (score >= MINIMUM_PASSING_SCORE) {
            letterGrade = "E";
        } else {
            letterGrade = "F";
        }
        return letterGrade;
    }
}
