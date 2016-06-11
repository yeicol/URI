
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/">URI1401GeneratingFastSortedPermutation</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1401GeneratingFastSortedPermutation {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int N = readInt();
        String s;
        while (N-- > 0) {
            s = read();

            Set<String> permutations = new HashSet<>();

            permutations = getPermutations("", s, permutations);
            List<String> ab = new ArrayList<>(permutations);
            Collections.sort(ab, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            });
            for (String string : ab) {
                out.println(string);
            }
            out.println();
        }
        out.close();
    }

    private static Set<String> getPermutations(String prefix, String str, Set<String> s) {
        int n = str.length();
        if (n == 0) {
            s.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                getPermutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), s);
            }
        }
        return s;
    }

    private static String read() throws IOException {
        return in.readLine();
    }

    private static int readInt() throws IOException {
        return Integer.parseInt(in.readLine());
    }

}
