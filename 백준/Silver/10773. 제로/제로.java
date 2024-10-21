import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        int sum = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            int command = Integer.parseInt(br.readLine());
            if (command == 0) {
                sum -= stack.peek();
                stack.pop();
            } else {
                stack.push(command);
                sum += command;
            }
        }

        System.out.println(sum);
    }
}