package _1000;

import java.util.Scanner;

public class _1355 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = n; i > 0; i--) {
			for (int k = 0; k < n; k++) {
				System.out.print(" ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print("*");
				
			}
	
			System.out.println();
		}
		
	}

}
