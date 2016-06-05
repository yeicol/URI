
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1129">Optical
 * Reader
 * </a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1129OpticalReader {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static final char[] ANSWERS = {'A', 'B', 'C', 'D', 'E'};

    public static void main(String[] args) throws IOException {
        String l;
        int N;
        char answer;
        String[] marks;
        int graylevel;
        while (!(l = read()).equals("0")) {
            N = toInt(l);
            while (N-- > 0) {
                answer = '*';
                marks = read().split("\\s");
                for (int i = 0; i < 5; i++) {
                    graylevel = toInt(marks[i]);
                    if (graylevel <= 127) {
                        if (answer == '*') {
                            answer = ANSWERS[i];
                        } else {
                            answer = '*';
                            break;
                        }
                    }
                }
                out.println(answer);
            }
        }
        out.close();
    }

    private static String read() throws IOException {
        return in.readLine();
    }

    private static int toInt(String s) {
        return Integer.parseInt(s);
    }
}
