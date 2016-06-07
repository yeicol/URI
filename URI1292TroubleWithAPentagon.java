
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1292">Trouble
 * with a Pentagon</a>
 *
 * @author Brian Yeicol Restrepo TangarifeURI1256HashTables
 */
public class URI1292TroubleWithAPentagon {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String l;
        double F;
        while ((l = read()) != null) {
            F = Double.parseDouble(l);
            out.printf("%.10f\n", (Math.sin(108 * Math.PI / 180.0) / Math.sin(63 * Math.PI / 180.0)) * F);
        }
        out.close();
    }

    private static String read() throws IOException {
        return in.readLine();
    }
}
