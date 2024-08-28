package _1100;

import java.util.Scanner;

// 초를 분/초로 변환
public class _1122 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int min = a/60;
		int sec = a%60;
		
		System.out.println(min + " " + sec);
	}

}
