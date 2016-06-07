import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1495">Football</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1495Football {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String l;
        String[] P;
        int[] goals;
        int N, G, w;
        long points;
        boolean f;
        while ((l = read()) != null) {
            points = 0;
            P = l.split("\\s");
            N = toInt(P[0]);
            G = toInt(P[1]);
            Integer[] matches = new Integer[N];
            for (int i = 0; i < N; i++) {
                goals = readArray();
                matches[i] = goals[0] - goals[1];
            }

            Arrays.sort(matches, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2.compareTo(o1);
                }
            });
            f = true;
            for (Integer match : matches) {
                w = match.compareTo(0);
                switch (w) {
                    case 1:
                        points += 3;
                        break;
                    case 0:
                        if (G > 0) {
                            G--;
                            points += 3;
                        } else {
                            points++;
                        }
                        break;
                    case -1:
                        if (G + match - 1 >= 0) {
                            G += match - 1;
                            points += 3;
                        } else {
                            if(G + match == 0){
                                points++;
                            }
                            f = false;
                            break;
                        }
                        break;
                }
                if(!f){
                    break;
                }
            }
            out.println(points);
        }
        out.close();
    }

    private static String read() throws IOException {
        return in.readLine();
    }


    private static int toInt(String s) {
        return Integer.parseInt(s);
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
