
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1555">Functions</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1555Functions {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int N = readInt(), x, y, Rafael, Beto, Carlos, x2, y2;
        int[] P;
        while (N-- > 0) {
            P = readArray();
            x = P[0];
            y = P[1];
            x2 = x * x;
            y2 = y * y;
            Rafael = 9 * x2 + y2;
            Beto = 2 * x2 + 25 * y2;
            Carlos = -100 * x + y2 * y;
            if (Rafael > Beto && Rafael > Carlos) {
                out.println("Rafael ganhou");
            } else if (Beto > Rafael && Beto > Carlos) {
                out.println("Beto ganhou");
            } else {
                out.println("Carlos ganhou");
            }
        }
        out.close();
    }

    private static int readInt() throws IOException {
        return Integer.parseInt(in.readLine());
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
