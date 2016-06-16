
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1516">Image</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1516Image {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String l, row;
        String[] P;
        int A, B, N, M;
        int[] repetitions;
        char[][] pixels;
        while (!(l = read()).equals("0 0")) {
            P = l.split("\\s");
            N = toInt(P[0]);
            M = toInt(P[1]);
            pixels = new char[N][M];
            for (int i = 0; i < N; i++) {
                pixels[i] = read().toCharArray();
            }
            repetitions = readArray();
            A = repetitions[0] / N;
            B = repetitions[1] / M;
            for (int i = 0; i < N; i++) {
                row = "";
                for (int j = 0; j < M; j++) {
                    row += strRepeat(String.valueOf(pixels[i][j]), B);
                }
                for (int j = 0; j < A; j++) {
                    out.println(row);
                }
            }
            out.println();
        }
        out.close();
    }

    private static String strRepeat(String s, int repetitions) {
        return new String(new char[repetitions]).replace("\0", s);
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
