
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1076">Design
 * Labirints</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1076DesignLabirints {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static final int UNVISITED = -1;
    static final int VISITED = 1;
    static final int CONECTED = 1;
    static int edges;

    public static void main(String[] args) throws IOException {
        int T = readInt(), V, E, source, destination, start;
        int[][] G;
        int[] vertex, aux;
        while (T-- > 0) {
            start = readInt();
            aux = readArray();
            V = aux[0];
            E = aux[1];
            vertex = new int[V];
            G = new int[V][V];
            Arrays.fill(vertex, UNVISITED);
            while (E-- > 0) {
                aux = readArray();
                source = aux[0];
                destination = aux[1];
                G[source][destination] = CONECTED;
                G[destination][source] = CONECTED;
            }
            edges = 0;
            dfs(G, vertex, start);
            out.println(edges * 2);
        }

        out.close();
    }

    private static void dfs(int[][] G, int[] vertex, int v) {
        vertex[v] = VISITED;
        for (int w = 0; w < G[v].length; w++) {
            if (G[v][w] == CONECTED) {
                if (vertex[w] == UNVISITED) {
                    edges++;
                    dfs(G, vertex, w);
                }
            }
        }
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
