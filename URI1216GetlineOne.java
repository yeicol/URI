import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1216">Getline
 * One</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1216GetlineOne {

    static FastScanner in = new FastScanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {

        String line;
        double c = 0d;
        double avg = 0d;
        while ((line = in.nextLine()) != null) {
            avg += in.nextDouble();
            c++;
        }
        out.printf("%.1f\n", avg / c);
        in.close();
        out.close();
    }

    static class FastScanner implements Closeable {

        private final BufferedReader reader;
        private StringTokenizer tokenizer;

        public FastScanner(InputStream input) {
            reader = new BufferedReader(
                    new InputStreamReader(input));
            tokenizer = new StringTokenizer("");
        }

        public String next() throws IOException {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                String line = nextLine();
                if (line == null) {
                    return null;
                }
                tokenizer = new StringTokenizer(line);
            }
            return tokenizer.nextToken();
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

        public String[] nextStringArray() throws IOException {
            return nextLine().split("\\s");
        }

        public int[] nextIntArray() throws IOException {
            String[] stringArray = nextStringArray();
            int length = stringArray.length;
            int[] array = new int[length];
            for (int i = 0; i < stringArray.length; i++) {
                array[i] = Integer.parseInt(stringArray[i]);
            }
            return array;
        }

        public long[] nextLongArray() throws IOException {
            String[] stringArray = nextStringArray();
            int length = stringArray.length;
            long[] array = new long[length];
            for (int i = 0; i < stringArray.length; i++) {
                array[i] = Long.parseLong(stringArray[i]);
            }
            return array;
        }

        public float[] nextFloatArray() throws IOException {
            String[] stringArray = nextStringArray();
            int length = stringArray.length;
            float[] array = new float[length];
            for (int i = 0; i < stringArray.length; i++) {
                array[i] = Float.parseFloat(stringArray[i]);
            }
            return array;
        }

        public double[] nextDoubleArray() throws IOException {
            String[] stringArray = nextStringArray();
            int length = stringArray.length;
            double[] array = new double[length];
            for (int i = 0; i < stringArray.length; i++) {
                array[i] = Double.parseDouble(stringArray[i]);
            }
            return array;
        }

        @Override
        public void close() throws IOException {
            tokenizer = null;
            reader.close();
        }
    }
}
