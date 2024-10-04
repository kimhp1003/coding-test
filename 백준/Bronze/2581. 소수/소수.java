import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int m = input.nextInt();
        int n = input.nextInt();

        int answer = 0;
        int min = 10000;

        for (int i = (m > 1) ? m : 2; i <= n; i++) {
            int count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                if (i < min) {
                    min = i;
                }
                answer += i;
            }
        }

        if (answer != 0) {
            System.out.println(answer);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
    }
}