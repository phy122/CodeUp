package _1000;

import java.util.Scanner;

public class _1046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float a = sc.nextInt();
		float b = sc.nextInt();
		float c = sc.nextInt();
		
		System.out.printf("%.0f",a+b+c);
		System.out.println();
		System.out.printf("%.1f",(a+b+c)/3);
	}

}
