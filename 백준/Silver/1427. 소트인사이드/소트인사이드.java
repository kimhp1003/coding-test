import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] numbers = new int[10];

        while (number > 0) {
            numbers[number % 10]++;
            number /= 10;
        }

        for (int i = 9; i >= 0 ; i--) {
            while(numbers[i]-- > 0) {
                System.out.print(i);
            }
        }
    }
}