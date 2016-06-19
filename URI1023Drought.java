
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.TreeMap;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1023">Drought</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1023Drought {

    static InputReader in = new InputReader(System.in);
    static OutputWriter out = new OutputWriter(System.out);

    public static void main(String[] args) throws IOException {
        String aux;
        int N, X, Y, cityNumber = 1, totalResidents, totalConsumption, roundConsumption;
        boolean firstCase = true;
        int[] P;
        double ans;
        while (!(aux = in.readString()).equals("0")) {
            if (firstCase) {
                firstCase = false;
            } else {
                out.printLine();
            }
            totalResidents = 0;
            totalConsumption = 0;
            Map<Integer, Integer> relation = new HashMap<>();
            N = Integer.parseInt(aux);
            while (N-- > 0) {
                P = IOUtils.readIntArray(in, 2);
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
            out.printLine("Cidade# " + cityNumber++ + ":");
            aux = "";
            Map<Integer, Integer> treeMap = new TreeMap<>(relation);
            for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
                Integer key = entry.getKey();
                Integer value = entry.getValue();
                aux += value + "-" + key + " ";
            }
            out.printLine(aux.trim());
            ans = Math.floor(100 * (((100 * (double) totalConsumption) / (100 * (double) totalResidents)))) / 100;
            out.printLine("Consumo medio: " + String.format("%.2f", ans) + " m3.");

        }
        out.flush();
        out.close();
    }

    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}

class InputReader {

    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;
    private SpaceCharFilter filter;

    public InputReader(InputStream stream) {
        this.stream = stream;
    }

    public int read() {
        if (numChars == -1) {
            throw new InputMismatchException();
        }
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0) {
                return -1;
            }
        }
        return buf[curChar++];
    }

    public int readInt() {
        int c = read();
        while (isSpaceChar(c)) {
            c = read();
        }
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        int res = 0;
        do {
            if (c < '0' || c > '9') {
                throw new InputMismatchException();
            }
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }

    public String readString() {
        int c = read();
        while (isSpaceChar(c)) {
            c = read();
        }
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isSpaceChar(c));
        return res.toString();
    }

    public boolean isSpaceChar(int c) {
        if (filter != null) {
            return filter.isSpaceChar(c);
        }
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public String next() {
        return readString();
    }

    public interface SpaceCharFilter {

        public boolean isSpaceChar(int ch);
    }
}

class OutputWriter {

    private final PrintWriter writer;

    public OutputWriter(OutputStream outputStream) {
        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }

    public OutputWriter(Writer writer) {
        this.writer = new PrintWriter(writer);
    }

    public void print(Object... objects) {
        for (int i = 0; i < objects.length; i++) {
            if (i != 0) {
                writer.print(' ');
            }
            writer.print(objects[i]);
        }
    }

    public void printLine(Object... objects) {
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

class IOUtils {

    public static int[] readIntArray(InputReader in, int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = in.readInt();
        }
        return array;
    }

}
