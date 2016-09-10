
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1221">Fast Prime Number</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1221FastPrimeNumber {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        long X;
        while (N-- > 0) {
            X = Long.parseLong(in.readLine());
            out.println(isPrime(X) ? "Prime" : "Not Prime");
        }
        out.close();
    }

    private static boolean isPrime(long n) {
        if (n > 2 && n % 2 == 0) {
            return false;
        }
        int top = (int) Math.sqrt(n) + 1;
        for (int i = 3; i < top; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
