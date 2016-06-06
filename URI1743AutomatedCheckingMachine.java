
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1743">Automated
 * Checking Machine</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1743AutomatedCheckingMachine {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int[] A = readArray();
        int[] B = readArray();
        for (int i = 0; i < 5; i++) {
            if (A[i] + B[i] != 1) {
                out.println("N");
                out.close();
                break;
            }
        }
        out.println("Y");
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
