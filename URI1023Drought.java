
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1023">Drought</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1023Drought {

    static Reader in = new Reader(System.in);
    static Writer out = new Writer(System.out);

    public static void main(String[] args) throws IOException {
        String aux;
        int N, X, Y, cityNumber = 1, totalResidents, totalConsumption, roundConsumption;
        boolean firstCase = true;
        int[] P;
        double ans;
        while (true) {
            N = in.nextInt();
            if (N == 0) {
                break;
            }
            if (firstCase) {
                firstCase = false;
            } else {
                out.println();
            }
            totalResidents = 0;
            totalConsumption = 0;
            Map<Integer, Integer> relation = new HashMap<>();
            while (N-- > 0) {
                X = in.nextInt();
                Y = in.nextInt();
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
            ans = Math.floor(100 * (((100 * (double) totalConsumption) / (100 * (double) totalResidents)))) / 100;
            out.println("Consumo medio: " + String.format("%.2f", ans) + " m3.");

        }
        out.flush();
        out.close();
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
