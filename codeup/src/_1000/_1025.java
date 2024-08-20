package _1000;

import java.util.Scanner;

public class _1025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		System.out.println("["+(a / 10000) * 10000 + "]");
		System.out.println("["+((a % 10000) / 1000) * 1000+ "]");
		System.out.println("["+(((a % 10000) % 1000)/100)*100+ "]");
		System.out.println("["+((((a % 10000) % 1000)%100)/10)*10+ "]");
		System.out.println("["+((((a % 10000) % 1000)%100)%10)+ "]");
	}
}
