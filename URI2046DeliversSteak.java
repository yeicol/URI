
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/2046">Delivers
 * Steak</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI2046DeliversSteak {

    static Reader in = new Reader(System.in);
    static Writer out = new Writer(System.out);

    public static void main(String[] args) throws IOException {
        int N, M, K, L, x, y, instance = 0;
        Pair[][] sol;

        Pair[] headquarters;
        Pair[][] solution;
        while (true) {
            M = in.nextInt();
            N = in.nextInt();
            if (N + M == 0) {
                break;
            }
            sol = new Pair[M][N];

            K = in.nextInt();
            headquarters = new Pair[K];
            for (int i = 0; i < K; i++) {
                x = in.nextInt() - 1;
                y = in.nextInt() - 1;
                headquarters[i] = new Pair(x, y);

            }
            Queue q = new LinkedList();
            Arrays.sort(headquarters, new Comparator<Pair>() {
                @Override
                public int compare(Pair p1, Pair p2) {
                    int x1 = p1.x;
                    int x2 = p2.x;
                    int y1 = p1.y;
                    int y2 = p2.y;
                    return (x1 != x2) ? x1 - x2 : y1 - y2;

                }
            });
            for (Pair headquarter : headquarters) {
                PairOfPairs pop = new PairOfPairs(headquarter, headquarter);
                sol[headquarter.x][headquarter.y] = headquarter;
                q.add(pop);
            }
            L = in.nextInt();
            if (instance != 0) {
                out.println();
            }
            out.println("Instancia " + ++instance);
            solution = bfs(q, sol);
            while (L-- > 0) {
                x = in.nextInt() - 1;
                y = in.nextInt() - 1;
                out.println(solution[x][y].x + 1, solution[x][y].y + 1);
            }

        }

        in.close();
        out.flush();
        out.close();
    }

    private static Pair[][] bfs(Queue q, Pair[][] sol) {
        while (!q.isEmpty()) {
            PairOfPairs pop = (PairOfPairs) q.remove();
            int x = pop.coordinate.x;
            int y = pop.coordinate.y;

            if (x - 1 >= 0 && sol[x - 1][y] == null) {
                sol[x - 1][y] = pop.solution;
                q.add(new PairOfPairs(new Pair(x - 1, y), pop.solution));
            }
            if (y - 1 >= 0 && sol[x][y - 1] == null) {
                sol[x][y - 1] = pop.solution;
                q.add(new PairOfPairs(new Pair(x, y - 1), pop.solution));
            }
            if (x + 1 < sol.length && sol[x + 1][y] == null) {
                sol[x + 1][y] = pop.solution;
                q.add(new PairOfPairs(new Pair(x + 1, y), pop.solution));
            }
            if (y + 1 < sol[0].length && sol[x][y + 1] == null) {
                sol[x][y + 1] = pop.solution;
                q.add(new PairOfPairs(new Pair(x, y + 1), pop.solution));
            }
        }
        return sol;
    }

    static class Pair {

        public int x = -1;
        public int y = -1;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class PairOfPairs {

        public Pair coordinate = null;
        public Pair solution = null;

        public PairOfPairs(Pair x, Pair y) {
            this.coordinate = x;
            this.solution = y;
        }
    }

    static class Reader implements Closeable {

        private final BufferedReader reader;
        private StringTokenizer tokenizer;

        public Reader(InputStream input) {
            reader = new BufferedReader(
                    new InputStreamReader(input));
            tokenizer = new StringTokenizer("");
        }

        private StringTokenizer getTokenizer() throws IOException {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                String line = nextLine();
                if (line == null) {
                    return null;
                }
                tokenizer = new StringTokenizer(line);
            }
            return tokenizer;
        }

        public boolean hasNext() throws IOException {
            return getTokenizer() != null;
        }

        public String next() throws IOException {
            return hasNext() ? tokenizer.nextToken() : null;
        }

        public String nextLine() throws IOException {
            tokenizer = null;
            return reader.readLine();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public float nextFloat() throws IOException {
            return Float.parseFloat(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public String[] nextStringArray(int size) throws IOException {
            String[] array = new String[size];
            for (int i = 0; i < size; i++) {
                array[i] = next();
            }
            return array;
        }

        public int[] nextIntArray(int size) throws IOException {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = nextInt();
            }
            return array;
        }

        public long[] nextLongArray(int size) throws IOException {
            long[] array = new long[size];
            for (int i = 0; i < size; i++) {
                array[i] = nextLong();
            }
            return array;
        }

        public double[] nextDoubleArray(int size) throws IOException {
            double[] array = new double[size];
            for (int i = 0; i < size; i++) {
                array[i] = nextDouble();
            }
            return array;
        }

        @Override
        public void close() throws IOException {
            tokenizer = null;
            reader.close();
        }
    }

    static class Writer {

        private final PrintWriter writer;

        public Writer(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void println(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

        public void flush() {
            writer.flush();
        }

    }
}
