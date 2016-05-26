
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1087">Queen</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1087Queen {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		String l;
		int x1, x2, y1, y2;
		while (!(l = in.readLine()).equals("0 0 0 0")) {
			String[] P = l.split("\\s");
			x1 = Integer.parseInt(P[0]);
			y1 = Integer.parseInt(P[1]);
			x2 = Integer.parseInt(P[2]);
			y2 = Integer.parseInt(P[3]);
			if (x1 == x2 && y1 == y2) {
				out.println(0);
			} else if (x1 == x2 || y1 == y2 || Math.abs(y2 - y1) == Math.abs(x2 - x1)) {
				out.println(1);
			} else {
				out.println(2);
			}
		}
		out.close();
	}

}
