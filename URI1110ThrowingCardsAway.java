
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * See <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1110">
 * Throwing Cards Away</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1110ThrowingCardsAway {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String l, removed;
        int n, base, number;

        while (!(l = in.readLine()).equals("0")) {
            n = Integer.parseInt(l);
            if (n == 1) {
                out.println("Discarded cards:");
                out.println(1);
            } else {
                base = 1;
                List<Integer> cards = new ArrayList<Integer>();
                for (int i = 1; i <= n; i++) {
                    cards.add(i);
                }
                base = 2;
                boolean f = true;
                removed = "";
                while (cards.size() > 1) {
                    for (Iterator<Integer> iterator = cards.iterator(); iterator.hasNext();) {
                        number = iterator.next();
                        if (base == 2) {
                            base = 0;
                            removed += number + ", ";
                            iterator.remove();
                        }
                        base++;
                    }
                }
                out.println("Discarded cards: " + removed.substring(0, removed.length() - 2));
                out.println("Remaining card: " + cards.get(0));
            }
        }
        out.close();
    }

}
