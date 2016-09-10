
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Stack;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1084">Erasing and Winning</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1084ErasingAndWinning {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String l;
        int N, D, t;
        String[] aux;
        char[] numbers;
        char current;
        while (!(l = in.readLine()).equals("0 0")) {
            aux = l.split("\\s");
            N = Integer.parseInt(aux[0]);
            D = Integer.parseInt(aux[1]);
            Stack<Character> stack = new Stack<>();
            numbers = in.readLine().toCharArray();
            t = N - D;
            for (int i = 0; i < N; i++) {
                current = numbers[i];
                while (stack.size() > 0  && stack.size() + N - i > t  && stack.lastElement() < current) {
                    stack.pop();
                }
                if (stack.size() < t) {
                    stack.push(current);
                    
                }
            }
            for (char number : stack) {
                out.print(number);
            }
            out.println();
        }
        out.close();
    }

}
