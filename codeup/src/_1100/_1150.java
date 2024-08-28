package _1100;

import java.util.Scanner;

// 세 수 중 가장 작은 수
public class _1150 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a <= b && a <= c) {
			System.out.println(a);
		}
		else if(b <= a && b <= c) {
			System.out.println(b);
		}
		else
			System.out.println(c);
		
	}

}
