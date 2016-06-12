
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1618">Colision</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1618Colision {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine()), rx, ry, ax, bx, by, cy;
        int[] CP;
        while (N-- > 0) {
            CP = readArray();
            ax = CP[0];
            bx = CP[2];
            by = CP[3];
            cy = CP[5];
            rx = CP[8];
            ry = CP[9];
            out.println(ax <= rx && rx <= bx && by <= ry && ry <= cy ? 1 : 0);
        }
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
