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

        for (int i = 0; i < n; i++) {
            Stack<Integer> stack = new Stack<>();
            char[] chars = br.readLine().toCharArray();
            boolean isValid = true;

            for (char c : chars) {
                try {
                    if (c == '(') {
                        stack.push(1);
                    } else {
                        stack.pop();
                    }
                } catch (EmptyStackException e) {
                    bw.write("NO\n");
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                if (stack.isEmpty()) {
                    bw.write("YES\n");
                } else {
                    bw.write("NO\n");
                }
            }
        }

        bw.flush();
        bw.close();
    }
}