
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1620">Delaunay
 * Triangulation</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1620DelaunayTriangulation {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);
	static final BigDecimal THREE = new BigDecimal("3.0");

	public static void main(String[] args) throws IOException {
		String line;
		BigDecimal L, I;
		BigDecimal X;
		while (!(line = in.readLine()).equals("0")) {
			L = new BigDecimal(line);
			I = L.add(L.subtract(THREE));
			X = (I.subtract(L)).divide(L, 6, RoundingMode.HALF_UP);
			out.println(X);
		}
		out.close();
	}

}
