
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1785">Kaprekar</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1785Kaprekar {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		int T = readInt();
		int X;
		int numberCase = 1;
		while (numberCase <= T) {
			X = readInt();
			out.println("Caso #" + numberCase + ": " + kaprekar(X));
			numberCase++;
		}
		out.close();
	}

	private static int readInt() throws IOException {
		return Integer.parseInt(in.readLine());
	}

	private static int kaprekar(int X) {
		int cnt = 0;

		while (X != 6174) {
			if (X != 0) {
				int hi = highest_number_with_digits_of(X);
				int lo = lowest_number_with_digits_of(X);
				X = hi - lo;
				cnt = cnt + 1;
			} else {
				cnt = -1;
				break;
			}
		}

		return cnt;
	}

	private static int highest_number_with_digits_of(int X) {
		String aux = completeString(String.valueOf(X), 4, "0");
		char[] numbers = String.valueOf(aux).toCharArray();

		Arrays.sort(numbers);
		aux = "";
		for (int i = 3; i >= 0; i--) {
			aux += numbers[i];
		}
		return Integer.parseInt(aux);
	}

	private static int lowest_number_with_digits_of(int X) {
		char[] numbers = String.valueOf(X).toCharArray();
		Arrays.sort(numbers);
		String aux = "";
		for (char number : numbers) {
			aux += number;
		}
		return Integer.parseInt(aux);
	}

	private static String completeString(String s, int count, String complement) {
		return s + new String(new char[count - s.length()]).replace("\0", complement);
	}

}
