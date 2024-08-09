package _1000;

import java.util.Scanner;

//	두 수 중 큰 수

public class _1149 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
	
		int result = 0;
		if(a > b) {
			result = a;
		}
		else
			result = b;
		
		System.out.println(result);
	}
	

}
