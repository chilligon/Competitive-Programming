import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author chiliagon
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TauntingTarun solver = new TauntingTarun();
        solver.solve(1, in, out);
        out.close();
    }

    static class TauntingTarun {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 1 will always be common
            // we can use a O(n) approach
            // by traversing till min of both
            int a = in.nextInt();
            int b = in.nextInt();
            int n1 = a;
            int n2 = b;
            int count = 0;
            int gcd = hcf(n1, n2);
            for (int i = 1; i <= gcd; i++) {
                if (a % i == 0 && b % i == 0) {
                    count = count + 1;
                }

            }
            out.println(count);
        }

        public static int hcf(int a, int b) {
            int temp;
            while (b > 0) {
                temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

    }
}

