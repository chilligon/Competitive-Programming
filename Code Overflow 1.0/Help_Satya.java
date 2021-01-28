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
        HelpSatya solver = new HelpSatya();
        solver.solve(1, in, out);
        out.close();
    }

    static class HelpSatya {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long n = in.nextLong();
            out.println(((2 * n) - 1) * n);
        }

    }
}

