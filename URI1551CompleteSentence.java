
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1551">Complete
 * Sentence</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1551CompleteSentence {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static final String[] ALPHABET = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    public static void main(String[] args) throws IOException {
        int N = readInt();
        int count;
        String s;
        while (N-- > 0) {
            count = 0;
            s = read();
            for (String letter : ALPHABET) {
                if (s.contains(letter)) {
                    count++;
                }
            }
            if (count == 26) {
                out.println("frase completa");
            } else if (count > 12) {
                out.println("frase quase completa");
            } else {
                out.println("frase mal elaborada");
            }
        }
        out.close();
    }

    private static String read() throws IOException {
        return in.readLine();
    }

    private static int readInt() throws IOException {
        return Integer.parseInt(in.readLine());
    }

}
