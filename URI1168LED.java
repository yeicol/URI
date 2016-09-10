
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1168">LED</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1168LED {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        char[] numbers;
        int leds;
        while (N-- > 0) {
            leds = 0;
            numbers = in.readLine().toCharArray();
            for (char number : numbers) {
                switch (number) {
                    case '8':
                        leds += 7;
                        break;
                    case '0':
                    case '6':
                    case '9':
                        leds += 6;
                        break;
                    case '2':
                    case '3':
                    case '5':
                        leds += 5;
                        break;
                    case '4':
                        leds += 4;
                        break;
                    case '7':
                        leds += 3;
                        break;
                    case '1':
                        leds += 2;
                        break;
                }
            }
            out.println(leds + " leds");
        }
        out.close();
    }
}
