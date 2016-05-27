
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1193">Base
 * Conversion</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1193BaseConversion {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int x = readInt();
        String[] cases;
        String number, base;
        int decimal;
        int caseNumber = 0;
        while (caseNumber++ < x) {
            cases = read().split("\\s");
            number = cases[0];
            base = cases[1];
            out.println("Case " + caseNumber + ":");
            switch (base) {
                case "bin":
                    decimal = Integer.parseInt(number, 2);
                    out.println(decimal + " dec");
                    out.println(Integer.toString(decimal, 16) + " hex\n");
                    break;
                case "dec":
                    decimal = Integer.parseInt(number);
                    out.println(Integer.toString(decimal, 16) + " hex");
                    out.println(Integer.toString(decimal, 2) + " bin\n");
                    break;
                case "hex":
                    decimal = Integer.parseInt(number, 16);
                    out.println(decimal + " dec");
                    out.println(Integer.toString(decimal, 2) + " bin\n");
                    break;
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
