
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1261">Hay
 * Points</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1261HayPoints {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int[] P = readArray();
        String[] line;
        int M = P[0];
        int N = P[1];
        String job;
        int salary, total, length;
        String description, aux;
        Map<String, Integer> dictionary = new HashMap<>();
        while (M-- > 0) {
            line = read().split("\\s");
            job = line[0];
            salary = toInt(line[1]);
            dictionary.put(job, salary);
        }
        description = "";
        total = 0;
        while (N > 0) {
            aux = read();
            if (aux.equals(".")) {
                for (Map.Entry<String, Integer> entry : dictionary.entrySet()) {
                    String key = entry.getKey();
                    Integer value = entry.getValue();
                    length = description.length();
                    description = description.replaceAll(key, "");
                    total += ((length - description.length()) / key.length()) * value;
                }
                out.println(total);
                N--;
                description = "";
                total = 0;
            } else {
                description += aux + " ";
            }
        }
        out.close();
    }

    private static String read() throws IOException {
        return in.readLine();
    }

    private static int[] readArray() throws IOException {
        String[] line = in.readLine().split("\\s");
        int l = line.length;
        int[] a = new int[l];
        for (int i = 0; i < l; i++) {
            a[i] = Integer.parseInt(line[i]);
        }
        return a;
    }

    private static int toInt(String s) {
        return Integer.parseInt(s);
    }
}
