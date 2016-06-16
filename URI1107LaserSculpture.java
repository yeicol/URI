
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1107">Laser
 * Sculpture</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1107LaserSculpture {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String l;
        boolean f;
        int ans, A, tmp, w;
        int[] X;
        while (!(l = read()).equals("0 0")) {
            A = toInt(l.split("\\s")[0]);
            X = readArray();
            tmp = A;
            w = A;
            ans = 0;
            f = false;
            for (int Xi : X) {
                if (Xi <= tmp) {
                    f = false;
                } else {
                    if (!f) {
                        ans += w - tmp;
                    }
                    w = Xi;
                    f = true;
                }

                tmp = Xi;
            }
            out.println(f ? ans : ans + w - tmp);
        }
        out.close();
    }

    private static String read() throws IOException {
        return in.readLine();
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

    private static int toInt(String s) {
        return Integer.parseInt(s);
    }
}
