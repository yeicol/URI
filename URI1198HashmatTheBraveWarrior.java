
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1198">Hashmat
 * the Brave Warrior</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1198HashmatTheBraveWarrior {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String l;
        String[] army;
        while ((l = read()) != null) {
            army = l.split("\\s");
            out.println(Math.abs(toLong(army[0]) - toLong(army[1])));
        }
        out.close();
    }

    private static String read() throws IOException {
        return in.readLine();
    }

    private static long toLong(String s) {
        return Long.parseLong(s);
    }
}
