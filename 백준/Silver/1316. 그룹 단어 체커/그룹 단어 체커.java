import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int count = 0;

        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            boolean check = true;
            ArrayList<Character> wordLists = new ArrayList<>();

            wordLists.add(word.charAt(0));
            for (int j = 1; j < word.length(); j++) {
                if (word.charAt(j) != word.charAt(j - 1) && wordLists.contains(word.charAt(j))) {
                    check = false;
                    break;
                }
                wordLists.add(word.charAt(j));
            }
            if (check) {
                count++;
            }
        }

        System.out.println(count);
    }
}