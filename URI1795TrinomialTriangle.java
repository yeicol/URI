
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1795">Trinomial
 * Triangle</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1795TrinomialTriangle {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		int R = readInt();
		long ans = 1;
		while (R-- > 0) {
			ans *= 3;
		}
		out.println(ans);
		out.close();
	}

	private static int readInt() throws IOException {
		return Integer.parseInt(in.readLine());
	}

}
