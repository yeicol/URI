
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/2312">Medal Table</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI2312MedalTable {

    static Reader in = new Reader(System.in);
    static Writer out = new Writer(System.out);

    public static void main(String[] args) throws IOException {
        int N = in.nextInt();
        Country[] medals = new Country[N];
        for (int i = 0; i < N; i++) {
            medals[i] = new Country(in.next(), in.nextInt(), in.nextInt(), in.nextInt());
        }
        Country m;
        Arrays.sort(medals, new Comparator<Country>() {
            @Override
            public int compare(Country m1, Country m2) {
                if (m1.gM != m2.gM) {
                    return m2.gM - m1.gM;
                } else if (m2.sM != m1.sM) {
                    return m2.sM - m1.sM;
                } else if (m2.bM != m1.bM) {
                    return m2.bM - m1.bM;
                } else {
                    return m1.name.compareTo(m2.name);
                }
            }
        });
        for (int i = 0; i < N; i++) {
            m = medals[i];
            out.println(m.name, m.gM, m.sM, m.bM);
        }
        in.close();
        out.flush();
        out.close();
    }

    static class Country {

        public String name;
        public int gM;
        public int sM;
        public int bM;

        public Country(String name, int gM, int sM, int bM) {
            this.name = name;
            this.gM = gM;
            this.sM = sM;
            this.bM = bM;
        }

    }

    ////////////////////////////////////////////////////////////////////////////
    /////////////////////////////  INPUT / OUTPUT  /////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
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

    static class Writer implements Closeable, Flushable {

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

        @Override
        public void close() {
            writer.close();
        }

        @Override
        public void flush() {
            writer.flush();
        }
    }
}
