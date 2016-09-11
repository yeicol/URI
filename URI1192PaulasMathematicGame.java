
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1192">Paula's Mathematic Game</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1192PaulasMathematicGame {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int N = readInt(), a, b;
        char[] s;
        while (N-- > 0) {
            s = in.readLine().toCharArray();
            a = Character.getNumericValue(s[0]);
            b = Character.getNumericValue(s[2]);
            if (a == b) {
                out.println(a * b);
            } else if (Character.isLowerCase(s[1])) {
                out.println(a + b);
            } else {
                out.println(b - a);
            }
        }

        out.close();
    }

    private static int readInt() throws IOException {
        return Integer.parseInt(in.readLine());
    }
}
