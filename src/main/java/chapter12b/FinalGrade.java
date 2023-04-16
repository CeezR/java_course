package chapter12b;

import java.util.HashMap;
import java.util.Map;

public class FinalGrade {
    public static void main(String[] args) {
        Map<String, Integer> grades1 = new HashMap<>();
        Map <String, Integer> grades2 = new HashMap<>();
        Map <String, Integer> finalGrades = new HashMap<>();

        grades1.put("Mark", 100);
        grades1.put("John", 90);
        grades1.put("Mary", 80);
        grades1.put("Jane", 70);
        grades1.put("Bob", 60);
        grades1.put("Alice", 50);
        grades1.put("Tom", 40);
        grades1.put("Jerry", 30);
        grades1.put("Mickey", 20);
        grades1.put("Donald", 10);
        grades1.put("Minnie", 0);

        grades2.put("Minnie", 50);
        grades2.put("Donald", 60);
        grades2.put("Mickey", 70);
        grades2.put("Jerry", 80);
        grades2.put("Tom", 90);
        grades2.put("Alice", 100);
        grades2.put("Bob", 90);
        grades2.put("Jane", 80);
        grades2.put("Mary", 70);
        grades2.put("John", 60);
        grades2.put("Mark", 50);

        for (String name : grades1.keySet()) {
            int grade = Math.max(grades1.get(name), grades2.get(name));
            finalGrades.put(name, grade);
            System.out.println(name + " " + grade);
        }

    }



}
