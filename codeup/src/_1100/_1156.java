package _1100;

//홀수 짝수 구별
import java.util.Scanner;

public class _1156 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a % 2 == 1)
			System.out.println("odd");
		else
			System.out.println("even");
		
		sc.close();
	}


}
