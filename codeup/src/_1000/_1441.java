package _1000;

import java.util.Scanner;
//버블정렬
public class _1441 {
	public static void main(String[] args) {
		
		int arr[] = new int[10001];
		int n, i, j ,temp;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		for (i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (i = 0; i < n; i++) {
			for (j = 0 ; j < n - i; j++) {
				if(arr[j] > arr[j + 1]) {
					
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for (i = 1; i <= n; i++) {
			System.out.println(arr[i]);
		
		}
		
		sc.close();
	}

}
