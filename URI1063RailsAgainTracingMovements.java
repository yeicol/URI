
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Stack;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1063">Rails
 * Again... Tracing Movements</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1063RailsAgainTracingMovements {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String l;
        String[] sequence, desired;
        int n, current;
        while (!(l = in.readLine()).equals("0")) {
            n = Integer.parseInt(l);
            sequence = read().split("\\s");
            desired = read().split("\\s");
            Stack<String> stack = new Stack<>();
            current = 0;
            for (int i = 0; i < n; i++) {
                stack.push(sequence[i]);
                out.print("I");
                while (stack.size() > 0 && desired[current].equals(stack.lastElement())) {
                    current++;
                    stack.pop();
                    out.print("R");
                }
            }
            out.println(stack.size() > 0 ? " Impossible" : "");
        }
        out.close();
    }

    private static String read() throws IOException {
        return in.readLine();
    }

}
