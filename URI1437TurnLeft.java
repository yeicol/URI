
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1437">Turn
 * Left!</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1437TurnLeft {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static char[] DIRECTIONS = {'N', 'L', 'S', 'O'};

    public static void main(String[] args) throws IOException {
        String line;
        int countD, countE, originaLength, rotations;
        while (!(line = read()).equals("0")) {
            line = read();
            originaLength = line.length();
            line = line.replaceAll("E", "");
            countD = line.length();
            countE = originaLength - countD;

            if (countD >= countE) {
                rotations = (countD - countE) % 4;
            } else {
                rotations = (countE - countD) % 4;
                if (rotations % 2 != 0) {
                    rotations = (rotations == 3) ? 1 : 3;
                }
            }
            out.println(DIRECTIONS[rotations]);
        }
        out.close();
    }

    private static String read() throws IOException {
        return in.readLine();
    }
}
