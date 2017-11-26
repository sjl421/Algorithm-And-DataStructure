/**
* url:https://www.hackerrank.com/challenges/between-two-sets
*/

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    FastScanner in;
    PrintWriter out;

    class FastScanner {

        BufferedReader br;
        StringTokenizer st;

        private FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        private FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    /**
     * @param arr
     * @param m
     * @return
     */
    private int GCD(int[] arr, int m) {
        if (m == 1)
            return arr[0];
        else {
            //TODO
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                min = gcd(min, arr[i]);
            }
            return min;
        }
    }

    private int LCM(int[] arr, int n) {
        if (n == 0)
            return arr[0];
        else {
            //TODO
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                max = lcm(max, arr[i]);
            }
            return max;
        }
    }

    private void solve() {

        int n, m;
        n = in.nextInt();
        m = in.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];

        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        int l = LCM(a, n);
        for (int i = 0; i < b.length; i++) {
            b[i] = in.nextInt();
        }
        Arrays.sort(b);
        int r = GCD(b, m);
        int count = 0;
        for (int i = 1; l * i <= r; i++) {
            if (r % (i * l) == 0) {
                count += 1;
            }
        }
        out.println(count);
    }

    private void run() {
        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
