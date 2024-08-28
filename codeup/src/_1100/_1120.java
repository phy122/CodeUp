package _1100;

import java.util.Scanner;

// 세 수의 평균
public class _1120 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		double result = (a + b + c)/3.0;
		
		System.out.println(String.format("%.2f", result));
	}

}
