import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1593">Binary Function</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1593BinaryFunction {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static final BigInteger TWO = new BigInteger("2");
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        int ones;
        BigInteger I;

        while (N-- > 0) {
            ones = 0;
            I = new BigInteger(in.readLine());
            while(I.compareTo(BigInteger.ZERO) > 0){
                if(I.mod(TWO).compareTo(BigInteger.ONE) == 0){
                    ones++;
                }
                I = I.divide(TWO);
            }
            out.println(ones);
        }
        
        out.close();
    }

}
