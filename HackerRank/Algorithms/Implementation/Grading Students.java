/**
 *https://www.hackerrank.com/challenges/grading
 */

import java.io.*;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

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

    private void solve() {
        int n;
        n = in.nextInt();
        int[] grades = new int[n];
        for (int i = 0; i < n; i++) {
            grades[i] = in.nextInt();
            grades[i] = getNextGrade(grades[i]);
        }
        for (int i = 0; i < grades.length; i++) {
            out.println(grades[i]);
        }
    }

    private int getNextMultipleOfFive(int n) {
        return n / 5 == 0 ? n : (n / 5 + 1) * 5;
    }

    private int getNextGrade(int grade) {
        //40-37 = 3 not less 3
        if (grade <= 37)
            return grade;
        else if (getNextMultipleOfFive(grade) - grade >= 3) {
            return grade;
        } else {
            return getNextMultipleOfFive(grade);
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
