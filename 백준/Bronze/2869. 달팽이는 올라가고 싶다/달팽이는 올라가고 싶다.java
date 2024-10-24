import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double v = scanner.nextInt();

        System.out.println((int) Math.ceil((v - b) / (a - b)));
    }
}