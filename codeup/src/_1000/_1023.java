package _1000;

import java.util.Scanner;

public class _1023 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String data[] = sc.next().split("[.]");
		
		int first = Integer.parseInt(data[0]);
		int end = Integer.parseInt(data[1]);
		
		System.out.println(String.format("%d", first));
		System.out.println(String.format("%d", end));
	}

}
