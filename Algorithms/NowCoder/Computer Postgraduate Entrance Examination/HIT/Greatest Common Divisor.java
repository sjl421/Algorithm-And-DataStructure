/**
题目描述
输入两个正整数，求其最大公约数。 
输入描述:
测试数据有多组，每组输入两个正整数。


输出描述:
对于每组输入,请输出其最大公约数。

输入例子:
49 14

输出例子:
7
**/
Java Code:
import java.util.Scanner;

public class Main {
	private static long gcd(long a, long b) {

		return b == 0 ? a : gcd(b, a % b);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a, b;
		while (in.hasNext()) {
          a=in.nextLong();
          b=in.nextLong();
			System.out.println(gcd(a, b));
		}
	}
}
C++ Code:
//#include<bits/stdc++.h>
#include<cstdio>
#include<algorithm>
using namespace std;
inline int gcd(int a, int b) {
	return b == 0 ? a : gcd(b, a%b);
}
int main() {
	int a, b;
	while (~scanf("%d%d", &a, &b)) {
		printf("%d\n", gcd(a,b));
	}
}

