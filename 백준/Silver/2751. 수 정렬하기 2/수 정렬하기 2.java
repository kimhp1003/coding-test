import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < n; i++){
            numbers.add(scanner.nextInt());
        }

        Collections.sort(numbers);

        for (int number : numbers) {
            sb.append(number).append("\n");
        }

        System.out.println(sb);
    }
}