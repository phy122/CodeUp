package _1000;

import java.util.Scanner;

public class _1035 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		int b = Integer.parseInt(a,16);
		
		System.out.println(Integer.toOctalString(b));
	}

}
