package _1000;

//삼각형 출력하기 4
import java.util.Scanner;

public class _1357 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int k = 1; k < n; k++) {
			for (int t = n; t > k; t--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
