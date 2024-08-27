package _1500;

//지그재그 배열 2

import java.util.Scanner;

public class _1504 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[][] = new int[N][N];
		
		int c = 1;
		for (int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[j][i] = c++;
				}
			}
			
			else if(i % 2 != 0) {
				for (int j = arr.length - 1; j >= 0; j--) {
					arr[j][i] = c++;
				}
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
