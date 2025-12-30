package practice;

import java.util.Scanner;

public class whileDemo1 {
	public static void main(String argu[]) {
		int a = 1;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number :");
		int n = sc.nextInt();

		do {
			int c = n * a;
			System.out.println(n + "*" + a + " = " + c);
			a++;

		} while (a <= 10);
	}
}
