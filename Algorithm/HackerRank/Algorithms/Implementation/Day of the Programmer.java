/*
* https://www.hackerrank.com/challenges/day-of-the-programmer
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

    static int[] month = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    //    static int[] month1 = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static int DayOfProgrammer = 256;

    /**
     * @param year
     * @return
     */
    private boolean IsLeapYearInGregorianCalendar(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            return true;
        return false;
    }

    private boolean IsLeapYearInJulianCalendar(int year) {
        return year % 4 == 0 ? true : false;
    }

    /**
     * in JulianCalendar solution
     */
    private void solve1917(int year) {
        if (IsLeapYearInJulianCalendar(year) == true) {
            month[2] = 29;
        }
        int sum = 0;
        int index = 1;
        for (index = 1; sum < 256; index++) {
            sum += month[index];
            if (sum >= 256) {
                break;
            }
        }
        int day = month[index] - (sum - DayOfProgrammer);
        System.out.printf("%02d.%02d.%d", day, index, year);
    }

    /**
     * @param year
     * @return
     */
    private void solve1918(int year) {
        System.out.println("26.09.1918");
    }

    /**
     * in GregorianCalendar solution
     *
     * @param year
     * @return
     */
    private void solve1919(int year) {
        if (IsLeapYearInGregorianCalendar(year) == true) {
            month[2] = 29;
        }
        int sum = 0;
        int index = 1;
        for (index = 1; sum < 256; index++) {
            sum += month[index];
            if (sum >= 256) {
                break;
            }
        }
        int day = month[index] - (sum - DayOfProgrammer);
        System.out.printf("%02d.%02d.%d", day, index, year);
    }

    private void solve() {
        int year = in.nextInt();
        if (year <= 1917) {
            solve1917(year);
        } else if (year == 1918) {
            solve1918(year);
        } else {
            solve1919(year);
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