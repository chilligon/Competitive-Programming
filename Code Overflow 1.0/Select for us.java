import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

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
        SelectForUs solver = new SelectForUs();
        solver.solve(1, in, out);
        out.close();
    }

    static class SelectForUs {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = in.nextInt();
            Arrays.sort(arr);
            int curr = n - 1;
            int count = 0;
            List<Integer> list = new ArrayList<Integer>();
            while (count < k) {
                if (!list.contains(arr[curr])) {
                    count = count + numberocc(arr, arr[curr]);
                    list.add(arr[curr]);
                }
                curr--;

            }
            out.println(count);
        }

        public static int numberocc(int[] arr, int n) {
            int count = 0;
            for (int item : arr) {
                if (item == n) count++;
            }
            return count;
        }

    }
}

