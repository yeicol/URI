
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1323">Feynman</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1323Feynman {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String l;
        int n;
        while (!(l = in.readLine()).equals("0")) {
            n = Integer.parseInt(l);
            out.println(n * (n + 1) * (3 * n - n + 1) / 6);
        }
        out.close();
    }

}
