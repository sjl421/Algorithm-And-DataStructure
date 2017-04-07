//package com.zhangyong.Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Solution {

    FastScanner in;
    PrintWriter out;
    final long MAX = (int) 1e9 + 7;

    // public void solve() {
    // long sum = 0;
    //     for (int i = 1; i < 1000; i++) {
    //         if (i % 3 == 0 || i % 5 == 0)
    //             sum += i;
    //     }
    //     out.print(sum);
    // }
    public void solve(){

    }
    /**
     * @param a
     * @param b
     * @return long gcd of a&b21
     */
    public long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public void run() {
        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream f) {
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

    public static void main(String[] args) {
        new Solution().run();
    }
}
