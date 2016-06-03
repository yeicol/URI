
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1244">Sort
 * by length</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1244SortByLength {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		int N = readInt();
		String[] P;
		while (N-- > 0) {
			P = read().split("\\s");
			Arrays.sort(P, new Comparator<String>() {
				@Override
				public int compare(String s1, String s2) {
					return s2.length() - s1.length();
				}
			});
			for (int i = 0; i < P.length; i++) {
				out.print(P[i]);
				out.print(i != P.length - 1 ? " " : "\n");
			}
		}
		out.close();
	}

	private static String read() throws IOException {
		return in.readLine();
	}

	private static int readInt() throws IOException {
		return Integer.parseInt(in.readLine());
	}

}
