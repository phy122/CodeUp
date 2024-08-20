package _1000;

import java.util.Scanner;

public class _1024 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		String[] arr;
		
		arr = word.split("");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("'" + arr[i] + "'");
		}
	}

}
