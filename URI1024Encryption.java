
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1024">Encryption</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1024Encryption {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine()), half, length;
        char[] M;
        char temp;
        while (N-- > 0) {
            M = in.readLine().toCharArray();
            length = M.length;
            half = length / 2;
            for (int i = 0; i < length; i++) {
                if (Character.isLetter(M[i])) {
                    M[i] = (char) ((int) M[i] + 3);
                }
            }
            for (int i = 0; i < half; i++) {
                temp = M[i];
                M[i] = M[M.length - i - 1];
                M[M.length - i - 1] = temp;
            }
            for (int i = (half); i < length; ++i) {
                M[i] = (char) ((int) M[i] - 1);
            }
            for (char Mi : M) {
                out.print(Mi);
            }
            out.println();
        }
        out.close();
    }
}
