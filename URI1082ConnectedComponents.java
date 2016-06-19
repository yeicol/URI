
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.TreeSet;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1082">Connected
 * Components</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1082ConnectedComponents {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int caseNumber = 1, N = readInt(), V, E, s, d, connectedComponents;
        int[] P;
        int[][] G;
        String links;

        while (N-- > 0) {
            P = readArray();
            V = P[0];
            E = P[1];
            G = new int[V][V];
            while (E-- > 0) {
                links = read();
                s = (int) links.charAt(0) - 97;
                d = (int) links.charAt(2) - 97;
                G[s][d] = 1;
                G[d][s] = 1;
            }
            connectedComponents = 0;
            out.println("Case #" + caseNumber++ + ":");
            for (int i = 0; i < V; i++) {
                TreeSet<Integer> treeSet = new TreeSet<>();
                treeSet.add(i);
                treeSet = getConectedComponents(treeSet, G, i, 0);
                if (!treeSet.isEmpty()) {
                    connectedComponents++;
                    for (Integer next : treeSet) {
                        out.print((char) (next + 97) + ",");
                    }
                    out.println();
                }
            }
            out.println(connectedComponents + " connected components");
            out.println();

        }
        out.close();
    }

    private static TreeSet<Integer> getConectedComponents(TreeSet<Integer> treeSet, int[][] G, int i, int depth) {
        boolean hasConnection = false;
        int nonConnection = 0;
        for (int j = 0; j < G[i].length; j++) {
            if (G[i][j] == 1) {
                hasConnection = true;
                G[i][j] = 2;
                G[j][i] = 2;
                treeSet.add(j);
                treeSet = getConectedComponents(treeSet, G, j, depth + 1);
            } else if (G[i][j] == 0) {
                nonConnection++;
            }
        }
        if (!hasConnection && nonConnection < G[i].length && depth == 0) {
            treeSet.remove(i);
        }
        return treeSet;

    }

    private static String read() throws IOException {
        return in.readLine();
    }

    private static int readInt() throws IOException {
        return Integer.parseInt(in.readLine());
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
}
