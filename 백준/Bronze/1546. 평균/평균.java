import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] scores = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
            if (max < scores[i]) {
                max = scores[i];
            }
        }

        double [] newScores = new double [n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            newScores[i] = (double) scores[i] / max * 100;
            sum += newScores[i];
        }
        System.out.println(sum / n);
    }
}