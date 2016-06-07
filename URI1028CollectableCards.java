
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/">URI1028CollectableCards</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1028CollectableCards {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		int N = readInt();
		int[] F;
		while (N-- > 0) {
			F = readArray();
			out.println(gcd(F[0], F[1]));
		}
		out.close();
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	private static String read() throws IOException {
		return in.readLine();
	}

	private static int readInt() throws IOException {
		return Integer.parseInt(in.readLine());
	}

	private static int[] readArray() throws IOException {
		String[] line = read().split("\\s");
		int length = line.length;
		int[] array = new int[length];
		for (int i = 0; i < line.length; i++) {
			array[i] = toInt(line[i]);
		}
		return array;
	}

	private static int toInt(String s) {
		return Integer.parseInt(s);
	}

}
