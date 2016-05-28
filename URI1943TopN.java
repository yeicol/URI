
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1943">Top
 * N</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1943TopN {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static final int[] TOPS = {1, 3, 5, 10, 25, 50, 100};

    public static void main(String[] args) throws IOException {
        int K = readInt();
        int t = 0;
        for (int top : TOPS) {
            if (K <= top) {
                t = top;
                break;
            }
        }
        out.println("Top " + t);
        out.close();
    }

    private static int readInt() throws IOException {
        return Integer.parseInt(in.readLine());
    }

}
