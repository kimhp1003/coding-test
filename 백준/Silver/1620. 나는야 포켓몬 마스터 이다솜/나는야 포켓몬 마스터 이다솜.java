import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String[] list = new String[n];
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            list[i] = str;
            map.put(str, i + 1);
        }

        for (int i = 0; i < m; i++) {
            String input= sc.next();

            if (input.matches("[0-9]+")) {
                System.out.println(list[Integer.parseInt(input) - 1]);
            } else {
                System.out.println(map.get(input));
            }
        }
    }
}