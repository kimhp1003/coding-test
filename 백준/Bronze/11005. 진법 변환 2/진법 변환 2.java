import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int scale = scanner.nextInt();

        StringBuilder answer = new StringBuilder();
        while (number > 0) {
            if (number % scale > 9) {
                char c = (char) ((number % scale) + '7');
                answer.append(c);
            } else {
                answer.append(number % scale);
            }
            number /= scale;
        }
        System.out.println(answer.reverse());
    }
}