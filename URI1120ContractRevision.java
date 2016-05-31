
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1120">Contract
 * Revision</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1120ContractRevision {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		String l;
		while (!(l = in.readLine()).equals("0 0")) {
			String[] p = l.split("\\s");
			String D = p[0];
			String N = p[1];
			String r = N.replace(D, "");
			r = r.replaceFirst("0*", "");
			System.out.println(r.length() > 0 ? r : 0);
		}
		out.close();
	}
}
