
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1573">Chocolate
 * Factory</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1573ChocolateFactory {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String l;
        String[] P;
        int A, B, C;
        while (!(l = read()).equals("0 0 0")) {
            P = l.split("\\s+");
            A = Integer.parseInt(P[0]);
            B = Integer.parseInt(P[1]);
            C = Integer.parseInt(P[2]);
            out.println((int) Math.pow(A * B * C, 1.0 / 3.0));
        }
        out.close();
    }

    private static String read() throws IOException {
        return in.readLine();
    }

}
