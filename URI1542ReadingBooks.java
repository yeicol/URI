
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1542">
 * Reading Books</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1542ReadingBooks {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String l;
        int Q, D, P, pag;
        while (!(l = in.readLine()).equals("0")) {
            String[] parameters = l.split("\\s");
            Q = Integer.parseInt(parameters[0]);
            D = Integer.parseInt(parameters[1]);
            P = Integer.parseInt(parameters[2]);
            pag = (int) (P * D * Q) / (P - Q);
            String ouput = pag + " pagina";
            ouput += (pag == 1) ? "" : "s";
            out.println(ouput);
        }
        out.close();
    }
}
