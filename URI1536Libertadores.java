
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1536">Libertadores</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1536Libertadores {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        int time1, time2, M1, V1, M2, V2;
        String[] goals;
        while (N-- > 0) {
            goals = in.readLine().split("\\sx\\s");
            M1 = Integer.parseInt(goals[0]);
            V1 = Integer.parseInt(goals[1]);
            goals = in.readLine().split("\\sx\\s");
            M2 = Integer.parseInt(goals[1]);
            V2 = Integer.parseInt(goals[0]);
            time1 = M1 + M2;
            time2 = V1 + V2;
            if (time1 > time2 || time1 == time2 && V2 > M1) {
                out.println("Time 1");
            } else if (time1 < time2|| time1 == time2 && V2 < M1) {
                out.println("Time 2");
            } else {
                out.println("Penaltis");
            }
        }
        out.close();
    }
}
