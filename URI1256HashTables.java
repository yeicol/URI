
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1256">Hash
 * Tables</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1256HashTables {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int N = readInt(), M, index;
        int[] P;
        String[] elements;
        while (N-- > 0) {
            P = readArray();
            M = P[0];
            String[] keys = new String[M];
            Arrays.fill(keys, "");
            elements = read().split("\\s");
            for (String element : elements) {
                index = toInt(element) % M;
                
                keys[index] += " -> " + element;
            }
            for (int i = 0; i < M; i++) {
                out.println(i + keys[i] + " -> \\");
            }
            if(N != 0){
                out.println();
            }
        }
        out.close();
    }

    private static String read() throws IOException {
        return in.readLine();
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

    private static int[] readSortedArray() throws IOException {
        int[] a = readArray();
        Arrays.sort(a);
        return a;
    }

    private static int toInt(String s) {
        return Integer.parseInt(s);
    }
}
