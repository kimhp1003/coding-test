import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Double> scoreBoard = new HashMap<>();
        scoreBoard.put("A+", 4.5);
        scoreBoard.put("A0", 4.0);
        scoreBoard.put("B+", 3.5);
        scoreBoard.put("B0", 3.0);
        scoreBoard.put("C+", 2.5);
        scoreBoard.put("C0", 2.0);
        scoreBoard.put("D+", 1.5);
        scoreBoard.put("D0", 1.0);
        scoreBoard.put("F", 0.0);

        double totalCredit = 0;
        double totalScore = 0;

        for (int i = 0; i < 20; i++) {
            String subject = scanner.next();
            double credit = scanner.nextDouble();
            String grade = scanner.next();

            if (!grade.equals("P")) {
                totalCredit += credit;
                double gradeScore = scoreBoard.get(grade);
                double score = credit * gradeScore;
                totalScore += score;
            }
        }

        System.out.println(totalScore / totalCredit);
    }
}