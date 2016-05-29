
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1953">Robert
 * and Rampant Room</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1953RobertAndRampantRoom {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String s;
        int n, EHD, EPR, INTRUSOS;
        String symbol;
        while ((s = read()) != null) {
            n = Integer.parseInt(s);
            EHD = 0;
            EPR = 0;
            INTRUSOS = 0;
            while (n-- > 0) {
                symbol = read();
                if (symbol.matches(".*\\sEHD")) {
                    EHD++;
                } else if (symbol.matches(".*\\sEPR")) {
                    EPR++;
                } else {
                    INTRUSOS++;
                }
            }
            out.println("EPR: " + EPR);
            out.println("EHD: " + EHD);
            out.println("INTRUSOS: " + INTRUSOS);

        }
        out.close();
    }

    private static String read() throws IOException {
        return in.readLine();
    }

}
