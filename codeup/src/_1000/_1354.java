package _1000;

import java.util.Scanner;

public class _1354 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = n; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");

			}
			System.out.println();
		}
	}
}


