/*
* url：https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/magical-word/、
*/

import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Echizen
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        MagicalWord solver = new MagicalWord();
        solver.solve(1, in, out);
        out.close();
    }

    static class MagicalWord {
        private boolean judgeIsPrime(int num) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

        private ArrayList<Integer> getList() {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 65; i <= 122; i++) {
                if (judgeIsPrime(i) == true) {
                    list.add(i);
                }
            }
            return list;
        }

        private char getMagicLetter(char c, ArrayList<Integer> list) {
            int max = 255;
            int index = list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if (Math.abs(c - list.get(i)) < max) {
                    max = Math.abs(c - list.get(i));
                    index = list.get(i);
                }
            }
            return (char) index;
        }

        private String get_MagicString(String str, ArrayList<Integer> list) {
            String temp = new String("");

            for (int i = 0; i < str.length(); i++) {
                char letter = getMagicLetter(str.charAt(i), list);
                temp += letter;
            }
            return temp;
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int num;
            String str = new String();
            ArrayList<Integer> list = getList();
            while (n-- > 0) {
                num = in.nextInt();
                str = in.next();
                String magicString = get_MagicString(str, list);
                out.println(magicString);
            }
        }

    }
}

