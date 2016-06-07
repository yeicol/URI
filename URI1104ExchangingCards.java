
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1104">Exchanging
 * Cards</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1104ExchangingCards {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String l;
        int cards1, cards2;
        while (!(l = in.readLine()).equals("0 0")) {
            Set<String> c1 = new HashSet<>(Arrays.asList(in.readLine().split("\\s")));
            Set<String> c2 = new HashSet<>(Arrays.asList(in.readLine().split("\\s")));
            cards1 = 0;
            cards2 = 0;
            for (Iterator<String> iterator = c1.iterator(); iterator.hasNext();) {
                String a = iterator.next();
                cards1 += (!c2.contains(a) ? 1 : 0);
            }
            for (Iterator<String> iterator = c2.iterator(); iterator.hasNext();) {
                cards2 += (!c1.contains(iterator.next()) ? 1 : 0);
            }
            out.println(cards1 > cards2 ? cards2 : cards1);
        }
        out.close();
    }

}
