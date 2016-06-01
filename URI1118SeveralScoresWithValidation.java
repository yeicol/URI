
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1118">Several
 * Scores with Validation</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1118SeveralScoresWithValidation {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		int op;
		double X, a, n;
		do {
			op = 0;
			a = 0;
			while (op < 2) {
				n = readDouble();
				if (n >= 0 && n <= 10) {
					a += n;
					op++;
				} else {
					out.println("nota invalida");
				}
			}
			out.printf("media = %.2f\n", a / 2f);
			do {
				out.println("novo calculo (1-sim 2-nao)");
				X = readDouble();
			} while (X != 1 && X != 2);
		} while (X != 2);
		out.close();
	}

	private static double readDouble() throws IOException {
		return Double.parseDouble(in.readLine());
	}

}
