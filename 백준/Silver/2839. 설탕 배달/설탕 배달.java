import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int weight = scanner.nextInt();
        int count = 0;

        while (weight > 0) {
            if (weight % 5 == 0) {
                count += weight / 5;
                break;
            }
            weight -= 3;
            count++;
        }

        if (weight == -2) {
            count = -1;
        }

        System.out.println(count);
    }
}
