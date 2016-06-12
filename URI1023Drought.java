
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1023">Drought</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1023Drought {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String aux;
        int N, X, Y, cityNumber = 1, totalResidents, totalConsumption, roundConsumption;
        boolean firstCase = true;
        int[] P;
        while (!(aux = read()).equals("0")) {
            if (firstCase) {
                firstCase = false;
            } else {
                out.println();
            }
            totalResidents = 0;
            totalConsumption = 0;
            Map<Integer, Integer> relation = new HashMap<>();
            N = toInt(aux);
            while (N-- > 0) {
                P = readArray();
                X = P[0];
                Y = P[1];
                totalResidents += X;
                totalConsumption += Y;
                roundConsumption = (int) Math.floor(Y / X);
                if (relation.containsKey(roundConsumption)) {
                    X += relation.get(roundConsumption);
                }
                relation.put(roundConsumption, X);
            }
            out.println("Cidade# " + cityNumber++ + ":");
            aux = "";
            Map<Integer, Integer> treeMap = new TreeMap<>(relation);
            for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
                Integer key = entry.getKey();
                Integer value = entry.getValue();
                aux += value + "-" + key + " ";
            }
            out.println(aux.trim());
            out.printf("Consumo medio: %.2f m3.\n", Math.floor(100 * (((100 * (double) totalConsumption) / (100 * (double) totalResidents)))) / 100);

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
