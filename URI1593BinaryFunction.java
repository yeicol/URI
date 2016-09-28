
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1593">Binary
 * Function</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1593BinaryFunction {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        BigInteger I;

        while (N-- > 0) {
            I = new BigInteger(in.readLine());
            out.println(I.bitCount());
        }

        out.close();
    }

}
