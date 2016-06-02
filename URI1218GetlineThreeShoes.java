
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1218">Getline
 * Three - Shoes</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1218GetlineThreeShoes {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		int cases = 1, F, M, i;
		String N, shoe, gender;
		String[] shoes;
		while ((N = read()) != null) {
			shoes = read().split("\\s");
			i = 0;
			F = 0;
			M = 0;
			while (i < shoes.length) {
				shoe = shoes[i++];
				gender = shoes[i++];
				if (N.equals(shoe)) {
					switch (gender) {
						case "F":
							F++;
							break;
						case "M":
							M++;
							break;

					}
				}
			}
			if (cases != 1) {
				out.println();
			}
			out.printf("Caso %d:\n", cases++);
			out.println("Pares Iguais: " + (F + M));
			out.println("F: " + F);
			out.println("M: " + M);
		}
		out.close();
	}

	private static String read() throws IOException {
		return in.readLine();
	}

}
