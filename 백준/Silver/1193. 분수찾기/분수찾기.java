import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        int maxValue = 0;
        int sum = 1;
        while (maxValue < x) {
            maxValue += sum;
            sum++;
        }

        int diff = maxValue - x;

        if (sum % 2 == 1) {
            System.out.println((sum - 1 - diff) + "/" + (diff + 1));
        } else {
            System.out.println((diff + 1) + "/" + (sum - 1 - diff));
        }
    }
}