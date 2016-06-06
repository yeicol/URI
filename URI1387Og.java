
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1387">Og</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1387Og {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String l;
        String[] P;
        while (!(l = read()).equals("0 0")) {
            P = l.split("\\s");
            out.println(toInt(P[0]) + toInt(P[1]));
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
