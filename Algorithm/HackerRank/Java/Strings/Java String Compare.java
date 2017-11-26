/**
* URL:https://www.hackerrank.com/challenges/java-string-compare
**/
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Echizen on 2017/3/24.
 */
public class Solution {

    public static void main(String[] args) {
        String str, tmp;
        String min = "zzz", max = "aaa";
        int n;
        Scanner input = new Scanner(System.in);
        str = input.next();
        n = input.nextInt();
        for (int i = 0; i < str.length() - n + 1; i++) {
            tmp = str.substring(i, i + n);
            //System.out.println(tmp);
            if (tmp.compareTo(max) >= 0) {
                max = tmp;
            }
            if (tmp.compareTo(min) < 0) {
                min = tmp;
            }
        }
        if (max == "aaa")
            max = min;
        System.out.print(min + "\n" + max);
    }
}
