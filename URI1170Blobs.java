
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1170">Blobs</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1170Blobs {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        double X;
        int days;
        while (N-- > 0) {
            days = 0;
            X = Double.parseDouble(in.readLine());
            while (X > 1) {
                X /= 2;
                days++;
            }
            out.println(days + " dias");
        }
        out.close();
    }
}
