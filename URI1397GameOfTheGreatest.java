
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1397">Game
 * of The Greatest</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1397GameOfTheGreatest {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		String l;
		String[] p;
		int N, A, B, ai, bi;
		while (!(l = read()).equals("0")) {
			N = Integer.parseInt(l);
			ai = 0;
			bi = 0;
			while (N-- > 0) {
				p = read().split("\\s");
				A = Integer.parseInt(p[0]);
				B = Integer.parseInt(p[1]);
				if (A > B) {
					ai++;
				} else if (B > A) {
					bi++;
				}
			}
			out.println(ai + " " + bi);
		}
		out.close();
	}

	private static String read() throws IOException {
		return in.readLine();
	}
}
