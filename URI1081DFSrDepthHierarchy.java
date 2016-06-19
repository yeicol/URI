
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1081">DFSr
 * - Depth Hierarchy</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1081DFSrDepthHierarchy {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static final int UNVISITED = -1;
    static final int VISITED = 1;
    static final int CONECTED = 1;
    static boolean f;

    public static void main(String[] args) throws IOException {
        int caseNumber = 1, N = readInt(), V, E, source, destination;
        int[][] G;
        int[] dfs, aux;
        while (N-- > 0) {
            aux = readArray();
            V = aux[0];
            E = aux[1];
            dfs = new int[V];
            G = new int[V][V];
            Arrays.fill(dfs, UNVISITED);
            while (E-- > 0) {
                aux = readArray();
                source = aux[0];
                destination = aux[1];
                G[source][destination] = CONECTED;
            }
            out.print("Caso " + caseNumber++ + ":");
            for (int i = 0; i < V; i++) {
                if (dfs[i] == UNVISITED) {
                    f = true;
                    dfs(G, dfs, i, 1);
                }
            }
            out.println();

        }
        out.close();
    }

    private static void dfs(int[][] G, int[] dfs, int v, int depth) {
        dfs[v] = VISITED;
        String ouput;
        for (int w = 0; w < G[v].length; w++) {
            if (G[v][w] == CONECTED) {
                ouput = getBlankSpaces(depth * 2);
                ouput += v + "-" + w;
                if (dfs[w] == UNVISITED) {
                    if (f) {
                        out.println();
                        f = false;
                    }
                    ouput += " pathR(G," + w + ")";
                }
                out.println(ouput);
                if (dfs[w] == UNVISITED) {
                    dfs(G, dfs, w, depth + 1);
                }
            }
        }
    }

    private static String getBlankSpaces(int count) {
        String s = "";
        while (count-- > 0) {
            s += " ";
        }
        return s;
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
