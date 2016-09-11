
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1247">Coast
 * Guard</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1247CoastGuard {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String l;
        String[] P;
        double D, VF, VG, hip;
        while ((l = read()) != null) {
            P = l.split("\\s");
            D = toDouble(P[0]);
            VF = toDouble(P[1]);
            VG = toDouble(P[2]);
            hip = Math.sqrt(D * D + 144d);
            out.println((hip / VG <= 12 / VF) ? "S" : "N");
        }
        out.close();
    }

    private static String read() throws IOException {
        return in.readLine();
    }

    private static double toDouble(String s) {
        return Double.parseDouble(s);
    }
}
