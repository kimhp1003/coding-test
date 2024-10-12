import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        TreeSet<String> set = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            String s1 = sc.next();
            String s2 = sc.next();
            if (s2.equals("enter")) {
                set.add(s1);
            } else {
                set.remove(s1);
            }
        }

        for (String s : set) {
            System.out.println(s);
        }
    }
}