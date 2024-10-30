import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        word = word.replaceAll("c=", " ")
                    .replaceAll("c-", " ")
                    .replaceAll("dz=", " ")
                    .replaceAll("d-", " ")
                    .replaceAll("lj", " ")
                    .replaceAll("nj", " ")
                    .replaceAll("s=", " ")
                    .replaceAll("z=", " ");

        System.out.println(word.length());
    }
}