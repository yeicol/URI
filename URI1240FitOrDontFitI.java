import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1240">Fit or Dont Fit I</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1240FitOrDontFitI {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine()), diff;
        String A, B;
        String[] P;
        while (N-- > 0) {
            P = in.readLine().split("\\s");
            A = P[0];
            B = P[1];
            diff = A.length() - B.length();
            if (0 > diff) {
                out.println("nao encaixa");
            } else if (A.substring(diff).equals(B)) {
                out.println("encaixa");
            } else {
                out.println("nao encaixa");
            }
        }
        out.close();
    }

}
