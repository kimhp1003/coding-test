import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.EmptyStackException;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            if (command == 1) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if(command == 2) {
                try {
                    bw.write(stack.pop() + "\n");
                } catch (EmptyStackException e) {
                    bw.write("-1\n");
                }
            } else if(command == 3) {
                bw.write(stack.size() + "\n");
            } else if (command == 4) {
                if (stack.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else {
                try {
                    bw.write(stack.peek() + "\n");
                } catch (EmptyStackException e) {
                    bw.write("-1\n");
                }
            }
        }

        bw.flush();
        bw.close();
    }
}