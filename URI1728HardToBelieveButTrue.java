
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1728">Hard
 * to Believe, But True!</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1728HardToBelieveButTrue {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String l;
        String[] P;
        String a, b, c;
        boolean f;
        while (!(l = read()).equals("0+0=0")) {
            P = l.split("\\+");
            a = P[0];
            P = P[1].split("=");
            b = P[0];
            c = P[1];
            a = new StringBuilder(a).reverse().toString();
            b = new StringBuilder(b).reverse().toString();
            c = new StringBuilder(c).reverse().toString();
            f = Integer.parseInt(a) + Integer.parseInt(b) == Integer.parseInt(c);
            out.println(f ? "True" : "False");
        }
        out.println("True");
        out.close();
    }

    private static String read() throws IOException {
        return in.readLine();
    }

}
