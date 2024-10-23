import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int answer = 0;
        int number = 666;
        int count = 0;

        while (count < n) {
            String title = number + "";
            if (title.contains("666")) {
                answer = number;
                count++;
            }
            number++;
        }

        System.out.println(answer);
    }
}