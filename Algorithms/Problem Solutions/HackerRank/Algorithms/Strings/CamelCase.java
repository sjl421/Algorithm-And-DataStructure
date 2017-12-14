/**
*https://www.hackerrank.com/challenges/camelcase
*/
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		String str;
		Scanner in = new Scanner(System.in);
		str = in.next();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				count += 1;
			}
		}
		System.out.println(count + 1);
	}
}
