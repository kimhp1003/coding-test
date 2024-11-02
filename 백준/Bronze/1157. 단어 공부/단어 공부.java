import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine().toUpperCase();

        int[] counts = new int[26];
        for (int i = 0; i < word.length(); i++) {
            counts[word.charAt(i) - 65]++;
        }

        int max1 = 0;
        int index = -1;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > max1) {
                max1 = counts[i];
                index = i + 65;
            } else if (counts[i] == max1) {
                index = -1;
            }
        }

        if (index == -1) {
            System.out.println("?");
        } else {
            System.out.println((char) index);
        }
    }
}