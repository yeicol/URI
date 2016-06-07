
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1161">Factorial
 * Sum</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1161FactorialSum {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static final long[] FACTORIALS = {
        1,
        1,
        2,
        6,
        24,
        120,
        720,
        5040,
        40320,
        362880,
        3628800,
        39916800,
        479001600,
        6227020800L,
        87178291200L,
        1307674368000L,
        20922789888000L,
        355687428096000L,
        6402373705728000L,
        121645100408832000L,
        2432902008176640000L
    };

    public static void main(String[] args) throws IOException {
        String l;
        String[] P;
        while ((l = read()) != null) {
            P = l.split("\\s");
            out.println(FACTORIALS[toInt(P[0])] + FACTORIALS[toInt(P[1])]);
        }
        out.close();
    }

    private static String read() throws IOException {
        return in.readLine();
    }

    private static int toInt(String s) {
        return Integer.parseInt(s);
    }
}
