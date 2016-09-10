
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1103">Alarm Clock</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1103AlarmClock {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String l;
        int H1, M1, H2, M2, minutes;
        String[] P;
        while (!(l = in.readLine()).equals("0 0 0 0")) {
            minutes = 0;
            P = l.split("\\s");
            H1 = Integer.parseInt(P[0]);
            M1 = Integer.parseInt(P[1]);
            H2 = Integer.parseInt(P[2]);
            M2 = Integer.parseInt(P[3]);
            if (M1 > M2) {
                minutes = 60 - M1 + M2;
                H1++;
            } else {
                minutes = M2 - M1;
            }
            minutes += mod(H2 - H1, 24) * 60;
            out.println(minutes);
        }
        out.close();
    }

    private static int mod(int n, int m) {
        return (n % m + m) % m;
    }
}
