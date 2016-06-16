
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1855">Master's
 * Map</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1855MaestersMap {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int x = Integer.parseInt(in.readLine());
        int y = Integer.parseInt(in.readLine());
        int i = 0;
        int j = 0;
        char[][] map = new char[x][y];
        char direction = map[0][0];
        for (int z = 0; z < y; z++) {
            map[z] = in.readLine().toCharArray();
        }
        boolean solution = true;
        boolean search = true;
        while (search) {
            if (i >= 0 && i < y && j >= 0 && j < x) {
                switch (map[i][j]) {
                    case '*':
                        search = false;
                        break;
                    case '>':
                    case '^':
                    case '<':
                    case 'v':
                        direction = map[i][j];
                        map[i][j] = '!';
                        break;
                    case '!':
                        search = false;
                        solution = false;
                        break;
                }
                i = getPosI(i, direction);
                j = getPosJ(j, direction);
            } else {
                search = false;
                solution = false;
            }
        }
        out.println(solution ? '*' : '!');
        out.close();
    }

    private static int getPosI(int i, char direction) {
        switch (direction) {
            case '^':
                i--;
                break;
            case 'v':
                i++;
                break;
        }
        return i;
    }

    private static int getPosJ(int j, char direction) {
        switch (direction) {
            case '<':
                j--;
                break;
            case '>':
                j++;
                break;
        }
        return j;
    }
}
