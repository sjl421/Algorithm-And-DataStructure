//package com.zhangyong.algorithm;
/*
* url: https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/seating-arrangement-1/
*/
import java.io.*;
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

    private String[] arr = new String[]{
            "WS", "MS", "AS", "AS", "MS", "WS"
    };

    private int GG(int n) {
        if (n <= 12) {
            return (13 - n);
        } else if (n <= 24) {
            return (37 - n);
        } else if (n <= 36) {
            return (61 - n);
        } else if (n <= 48) {
            return (85 - n);
        } else if (n <= 60) {
            return (109 - n);
        } else if (n <= 72) {
            return (133 - n);
        } else if (n <= 84) {
            return (157 - n);
        } else if (n <= 96) {
            return (181 - n);
        } else if (n <= 108) {
            return (205 - n);
        }
        return 0;
    }

    private void solve() {
        int t = in.nextInt();
        int n;
        while (t-- > 0) {
            n = in.nextInt();
            n = GG(n);
            int k = n % arr.length == 0 ? 0 : n % arr.length - 1;
            out.println(n + " " + arr[k]);
        }
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
