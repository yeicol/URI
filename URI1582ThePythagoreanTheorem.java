
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1582">The
 * Pythagorean Theorem</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1582ThePythagoreanTheorem {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String l;
        String[] p;
        int a, b, c;
        String ans;
        while ((l = read()) != null) {
            p = l.split("\\s");
            a = Integer.parseInt(p[0]);
            b = Integer.parseInt(p[1]);
            c = Integer.parseInt(p[2]);

            ans = "tripla";
            if (isPythagorean(a, b, c)) {
                ans += " pitagorica";
                ans += (gcd(gcd(a, b), c) == 1 ? " primitiva" : "");
            }
            out.println(ans);
        }
        out.close();
    }

    public static boolean isPythagorean(int a, int b, int c) {
        int s1, s2, s3;
        if (a >= b && b >= c || a >= c && c >= b) {
            s3 = a;
            s1 = b;
            s2 = c;
        } else if (b >= a && a >= c || b >= c && c >= a) {
            s3 = b;
            s1 = c;
            s2 = a;
        } else {
            s3 = c;
            s2 = a;
            s1 = b;
        }
        return s1 * s1 + s2 * s2 == s3 * s3;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private static String read() throws IOException {
        return in.readLine();
    }

}
