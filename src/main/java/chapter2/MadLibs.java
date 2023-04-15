package chapter2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Ask for a season
        String season = null;
        while (season == null) {
            System.out.print("Enter a season: ");
            season = validateSeason(scanner.next().toLowerCase());
        }

        //2. Ask for whole number
        System.out.print("Enter a whole number: ");
        int wholenumber = scanner.nextInt();

        //3. Ask for adjective
        System.out.print("Enter an adjective: ");
        String adjective = scanner.next();

        //4. Display result
        System.out.printf("On a %s %s day, I drink a minimum of %d cups of coffee.%n", adjective, season, wholenumber);
    }
    private static String validateSeason(String input) {
        List<String> seasons = Arrays.asList(
                "winter",
                "spring",
                "summer",
                "autumn");
        if(seasons.contains(input))
            return input;
        else
            return null;
    }
}
