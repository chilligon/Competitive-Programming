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
        MittalFinds3 solver = new MittalFinds3();
        solver.solve(1, in, out);
        out.close();
    }

    static class MittalFinds3 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long a = in.nextLong();
            long b = in.nextLong();
            out.println((a * b) / hcf(a, b));
        }

        public static long hcf(long a, long b) {
            long temp;
            while (b > 0) {
                temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

    }
}

