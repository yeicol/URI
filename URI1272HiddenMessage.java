
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1272">Hidden Message</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1272HiddenMessage {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		int N = readInt();
		while (N-- > 0) {
			String[] words = read().trim().split("\\s+");

			for (String word : words) {
				out.print(word.length() > 0 ? word.substring(0, 1) : "");
			}
			out.println();
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
