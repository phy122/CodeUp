package _1000;

import java.util.Scanner;

public class _1020 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String number[] = sc.next().split("[-]");
		
		int first = Integer.parseInt(number[0]);
		int end = Integer.parseInt(number[1]);
		
		System.out.print(String.format("%06d", first) + String.format("%06d", end));
		
	}

}
