
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1169">Grains
 * in a Chess Board</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1169GrainsInAChessBoard {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static final String[] KG = {"0",
        "0",
        "0",
        "0",
        "0",
        "0",
        "0",
        "0",
        "0",
        "0",
        "0",
        "0",
        "0",
        "0",
        "1",
        "2",
        "5",
        "10",
        "21",
        "43",
        "87",
        "174",
        "349",
        "699",
        "1398",
        "2796",
        "5592",
        "11184",
        "22369",
        "44739",
        "89478",
        "178956",
        "357913",
        "715827",
        "1431655",
        "2863311",
        "5726623",
        "11453246",
        "22906492",
        "45812984",
        "91625968",
        "183251937",
        "366503875",
        "733007751",
        "1466015503",
        "2932031007",
        "5864062014",
        "11728124029",
        "23456248059",
        "46912496118",
        "93824992236",
        "187649984473",
        "375299968947",
        "750599937895",
        "1501199875790",
        "3002399751580",
        "6004799503160",
        "12009599006321",
        "24019198012642",
        "48038396025285",
        "96076792050570",
        "192153584101141",
        "384307168202282",
        "768614336404564",
        "1537228672809129"};

    public static void main(String[] args) throws IOException {
        int N = readInt();
        while (N-- > 0) {
            int X = readInt();
            out.println(KG[X] + " kg");
        }
        out.close();
    }

    private static int readInt() throws IOException {
        return Integer.parseInt(in.readLine());
    }
}
