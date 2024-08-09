package _1000;

//import java.util.Iterator;
import java.util.Scanner;

public class _1253 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		for (int i = a; i <=b; i++) {
			System.out.println(i + " ");
		}
		
//		if(a > b) {
//			for (int i = b; i <= a; i++) {
//				System.out.println(i);
//				
//			}
//			
//		}
//		else {
//			for (int i = a; i <= b; i++) {
//				System.out.println(i);
//				
//			}
//		}
	}

}
