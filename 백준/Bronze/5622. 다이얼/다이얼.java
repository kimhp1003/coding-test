import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dial = scanner.nextLine();
        int answer = 0;

        for (int i = 0; i < dial.length(); i++) {
            if (dial.charAt(i) >= 90) {
                answer += (dial.charAt(i) - 67) / 3 + 3;
            } else if (dial.charAt(i) >= 83) {
                answer += (dial.charAt(i) - 66) / 3 + 3;
            } else if (dial.charAt(i) < 83) {
                answer += (dial.charAt(i) - 65) / 3 + 3;
            }
        }

        System.out.println(answer);
    }
}