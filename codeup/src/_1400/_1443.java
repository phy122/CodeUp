package _1400;

import java.util.Scanner;
//삽입정렬
public class _1443 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[10001];
		int n, i, j, temp, key;
		
		n = sc.nextInt();
		
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		for (i = 1; i <= n; i++) {
			key = a[i];
			j = i - 1;
			
			while(j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
		
		for (i = 1; i <= n; i++) {
			System.out.println(a[i]);
			
		}
	}

}
