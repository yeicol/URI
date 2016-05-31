
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
/**
 * See <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1241">
 * Fit or Don't Fit II</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1241FitOrDontFitII {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(in.readLine());
        while (n-- > 0) {
            String[] p = in.readLine().split("\\s");
            String A = p[0];
            String B = p[1];
            int lengthA = A.length();
            int lengthB = B.length();
            if (lengthB > lengthA) {
                out.println("nao encaixa");
            } else {

                out.println(A.substring(lengthA - lengthB, lengthA).equals(B) ? "encaixa" : "nao encaixa");
            }
        }
        out.close();
    }
}
