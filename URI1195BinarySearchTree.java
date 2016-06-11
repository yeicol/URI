
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1195">Binary
 * Search Tree</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1195BinarySearchTree {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int C = readInt();
        int[] numbers;
        for (int numberCase = 1; numberCase <= C; numberCase++) {
            read();
            numbers = readArray();
            Node root = null;
            for (int number : numbers) {
                root = insert(root, number);
            }
            out.println("Case " + numberCase + ":");
            out.print("Pre.:");
            preOrder(root);
            out.println();
            out.print("In..:");
            inOrder(root);
            out.println();
            out.print("Post:");
            postOrder(root);
            out.println("\n");
        }

        out.close();
    }

    private static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;

        }
    }

    private static void preOrder(Node root) {
        if (root != null) {
            out.print(" " + root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    private static void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            out.print(" " + root.data);
        }
    }

    private static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            out.print(" " + root.data);
            inOrder(root.right);
        }
    }

    private static String read() throws IOException {
        return in.readLine();
    }

    private static int readInt() throws IOException {
        return Integer.parseInt(read());
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

class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
