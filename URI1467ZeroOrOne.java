
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1467">Zero
 * or One</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1467ZeroOrOne {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String s;
        while ((s = in.readLine()) != null) {
            switch (s) {
                case "0 1 1":
                case "1 0 0":
                    out.println("A");
                    break;
                case "1 0 1":
                case "0 1 0":
                    out.println("B");
                    break;
                case "1 1 0":
                case "0 0 1":
                    out.println("C");
                    break;
                default:
                    out.println("*");
                    break;
            }
        }
        out.close();
    }

}
