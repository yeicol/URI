
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
        int N = readInt(), rx, ry, ax, bx, cx, dx, ay, by, cy, dy;
        int[] CP;
        while (N-- > 0) {
            CP = readArray();
            ax = CP[0];
            ay = CP[1];
            bx = CP[2];
            by = CP[3];
            cx = CP[4];
            cy = CP[5];
            dx = CP[6];
            dy = CP[7];
            rx = CP[8];
            ry = CP[9];
            if (ax <= rx && ay <= ry && rx <= bx && by <= ry && dx <= rx && ry <= dy && rx <= cx && ry <= cy) {
                out.println(1);
            } else {
                out.println(0);
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
