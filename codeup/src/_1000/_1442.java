package _1000;

import java.util.Scanner;

public class _1442 {
	public static void main(String[] args) {
		
		int[] a = new int[10001];
        int n, i, j, temp, min;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        
        for (i = 1; i <= n; i++)
            a[i] = scanner.nextInt();
        
        for (i = 1; i < n; i++) {
            min = i;
            for (j = i + 1; j <= n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

        for (i = 1; i <= n; i++)
            System.out.println(a[i]);
        
        scanner.close();
	}

}