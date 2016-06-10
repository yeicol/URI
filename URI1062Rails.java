
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Stack;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1062">Rails</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1062Rails {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		String l;
		String[] coaches;
		int N, current, coach;
		boolean firstTest = true;
		while (!(l = in.readLine()).equals("0")) {
			N = Integer.parseInt(l);
			if (firstTest) {
				firstTest = false;
			} else {
				out.println();
			}
			while (!(l = in.readLine()).equals("0")) {
				Stack<Integer> stack = new Stack<>();
				coaches = l.split("\\s");
				current = 0;
				coach = Integer.parseInt(coaches[current]);
				for (int i = 1; i <= N; i++) {
					stack.push(i);

					while (!stack.isEmpty() && coach == stack.lastElement()) {
						if (++current < N) {
							coach = Integer.parseInt(coaches[current]);
						}
						stack.pop();
					}
				}
				out.println(stack.isEmpty() ? "Yes" : "No");
			}
		}
		out.println();
		out.close();
	}

}
