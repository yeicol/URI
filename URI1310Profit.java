
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1310">Profit</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1310Profit {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		String l;
		int N, perDayCost, maxProfit, profit, inversion;
		while ((l = read()) != null) {
			N = Integer.parseInt(l);
			perDayCost = readInt();
			maxProfit = 0;
			int[] revenues = new int[N];
			int[] profits = new int[N];
			for (int i = 0; i < N; i++) {
				revenues[i] = readInt();
			}
			profits[0] = revenues[0];
			for (int i = 1; i < N; i++) {
				profits[i] = profits[i - 1] + revenues[i];
			}
			for (int numDias = 0; numDias < N; numDias++) {
				inversion = perDayCost * (numDias + 1);
				for (int pos = 0; pos < N - numDias; pos++) {
					profit = profitInRange(pos, pos + numDias, profits);
					if (profit - inversion > maxProfit) {
						maxProfit = profit - inversion;
					}
				}
			}
			out.println(maxProfit);
		}
		out.close();
	}

	private static int profitInRange(int s, int f, int[] profits) {
		return s == 0 ? profits[f] : profits[f] - profits[s - 1];
	}

	private static String read() throws IOException {
		return in.readLine();
	}

	private static int readInt() throws IOException {
		return Integer.parseInt(in.readLine());
	}

}
