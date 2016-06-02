
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1212">Primary
 * Arithmetic</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1212PrimaryArithmetic {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		String l;
		String[] P;
		int a, b, carries, r, r1, r2;
		while (!(l = read()).equals("0 0")) {
			P = l.split("\\s");
			a = toInt(P[0]);
			b = toInt(P[1]);
			carries = 0;
			r = 0;
			while (true) {
				r1 = a % 10;
				r2 = b % 10;
				a /= 10;
				b /= 10;
				if (r + r1 + r2 > 9) {
					r = 1;
					carries++;
				} else {
					r = 0;
				}
				if(a == 0 && b ==0){
					break;
				}
			}
			if (carries > 0) {
				out.print(carries + " carry operation");
				out.println(carries == 1 ? "." : "s.");
			} else {
				out.println("No carry operation.");
			}
		}
		out.close();
	}

	private static String read() throws IOException {
		return in.readLine();
	}

	private static int toInt(String s) {
		return Integer.parseInt(s);
	}

}
