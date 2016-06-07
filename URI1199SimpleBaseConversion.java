
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1199">Simple
 * Base Conversion</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1199SimpleBaseConversion {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String s;
        int N;
        while (true) {
            s = read();
            if (s.matches("0x.*")) {
                s = s.substring(2);
                out.println(Integer.parseInt(s, 16));
            } else {
                N = toInt(s);
                if (N < 0) {
                    break;
                } else {
                    out.println("0x" + Integer.toString(N, 16).toUpperCase());
                }
            }
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
