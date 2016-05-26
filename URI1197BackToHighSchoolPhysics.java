
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1197">Back
 * to High School Physics</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1197BackToHighSchoolPhysics {
    
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) throws IOException {
        String l;
        while ((l = in.readLine()) != null) {            
            String[] P = l.split("\\s");
            int v = Integer.parseInt(P[0]);
            int t = Integer.parseInt(P[1]);
            out.println(2 * v * t);
        }
        out.close();
    }
    
}
