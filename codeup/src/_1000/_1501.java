package _1000;
//2차원 배열 채우기 1
import java.util.Scanner;

public class _1501 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		
		int c = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				arr[i][j] = c++;
			}
	
	}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
					
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
