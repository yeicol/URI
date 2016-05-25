
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1140">
 * Flowers Flourish from France</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1140FlowersFlourishFromFrance {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		String l;
		String[] w;
		while (!(l = in.readLine()).equals("*")) {
			w = l.split("\\s");
			boolean f = true;
			String firstLetter = w[0].substring(0, 1);
			for (int i = 1; i < w.length; i++) {
				if (!firstLetter.equalsIgnoreCase(w[i].substring(0, 1))) {
					f = false;
					break;
				}
			}
			out.println(f ? "Y" : "N");
		}
		out.close();
	}

}
