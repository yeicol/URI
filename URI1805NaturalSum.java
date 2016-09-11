
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1805">Natural
 * Sum</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1805NaturalSum {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int[] P = readArray();
        int A = P[0];
        int B = P[1];
        long s = 0;
        for (int i = A; i <= B; i++) {
            s+=i;
        }
        out.println(s);
        out.close();
    }

    private static int[] readArray() throws IOException {
        String[] line = in.readLine().split("\\s");
        int l = line.length;
        int[] a = new int[l];
        for (int i = 0; i < l; i++) {
            a[i] = Integer.parseInt(line[i]);
        }
        return a;
    }

}
