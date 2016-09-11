
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1171">Number
 * Frequence</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1171NumberFrequence {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int[] F = new int[2001];
        int N = readInt();
        while (N-- > 0) {
            F[readInt()]++;
        }
        for (int i = 0; i < 2001; i++) {
            if (F[i] > 0) {
                out.println(i + " aparece " + F[i] + " vez(es)");
            }
        }
        out.close();
    }

    private static int readInt() throws IOException {
        return Integer.parseInt(in.readLine());
    }
}
