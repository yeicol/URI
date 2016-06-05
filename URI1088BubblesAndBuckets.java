
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1088">Bubbles
 * and Buckets</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1088BubblesAndBuckets {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String l;
        String P[];
        int N, swaps, pos;
        while (!(l = in.readLine()).equals("0")) {
            P = l.split("\\s");
            N = Integer.parseInt(P[0]);
            int[] X = new int[N];
            int[] aux = new int[N];
            for (int i = 0; i < N; i++) {
                pos = Integer.parseInt(P[i + 1]) - 1;
                X[pos] = i;
                aux[i] = pos;
            }
            swaps = 0;
            for (int i = 0; i < N - 1; i++) {
                if (X[i] != i) {
                    X[aux[i]] = X[i];
                    aux[X[i]] = aux[i];
//                    X[i] = i; 
//                    aux[i] = i;
                    swaps++;
                }
            }
            out.println(swaps % 2 == 0 ? "Carlos" : "Marcelo");
        }
        out.close();
    }

}
