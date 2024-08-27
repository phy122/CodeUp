package _1300;
//삼각형 출력하기 5
import java.util.Scanner;

public class _1358 {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n % 2 == 0 || n < 3 || n > 99) {
            return;
        }

        for (int i = 1; i <= n; i += 2) {
            for (int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
