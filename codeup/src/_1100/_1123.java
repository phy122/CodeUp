package _1100;

import java.util.Scanner;

// 섭씨 온도를 화씨 온도로 변환
public class _1123 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		float b = (((float)9/5)*a)+32;
		System.out.printf("%.3f",b);
	}

}

