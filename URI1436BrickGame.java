
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1436">Brick
 * Game</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1436BrickGame {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int n = readInt(), m;
        String[] a;
        for (int i = 1; i <= n; i++) {
            a = in.readLine().split("\\s");
            out.print("Case " + i + ": ");
            m = a.length / 2;
            if (a.length % 2 == 0) {
                out.println(a[m]);
            } else {
                out.println(Math.min(toInt(a[m]), toInt(a[m + 1])));
            }
        }
        out.close();
    }

    private static int readInt() throws IOException {
        return Integer.parseInt(in.readLine());
    }

    private static int toInt(String s) {
        return Integer.parseInt(s);
    }
}
