
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1196">WERTYU</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1196WERTYU {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);
	static final String ALPHABETH = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
	static final char[] KEYBOARD = ALPHABETH.toCharArray();

	public static void main(String[] args) throws IOException {
		String line;
		char[] input;
		int index;
		while ((line = in.readLine()) != null) {
			input = line.toCharArray();
			for (char letter : input) {
				index = ALPHABETH.indexOf(letter);
				out.print(index != -1 ? KEYBOARD[index - 1] : letter);
			}
			out.println();
		}
		out.close();
	}

}
