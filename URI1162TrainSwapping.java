
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1162">Train
 * Swapping</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1162TrainSwapping {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int N = readInt(), pos;
        int L, swaps;
        String[] P;
        while (N-- > 0) {
            L = readInt();
            int[] positions = new int[L];
            P = read().split("\\s");
            for (int i = 0; i < L; i++) {
                positions[i] = Integer.parseInt(P[i]);
            }
            swaps = bubbleSort(positions);

            out.println("Optimal train swapping takes " + swaps + " swaps.");
        }
        out.close();
    }

    private static String read() throws IOException {
        return in.readLine();
    }

    private static int readInt() throws IOException {
        return Integer.parseInt(in.readLine());
    }

    private static int bubbleSort(int[] array) {
        int totalSwaps = 0;
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int swaps = 0;

            for (int j = 0; j < length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    swaps++;
                    totalSwaps++;
                }
            }

            if (swaps == 0) {
                return totalSwaps;
            }
        }
        return totalSwaps;
    }

}
