package _1000;

import java.util.Scanner;

public class _1058 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(b == 0 && a == 0) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}

}