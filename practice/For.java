package practice;

import java.util.Scanner;

public class For {

	public static void main(String argu[]) {

		Scanner obj = new Scanner(System.in);

		System.out.print("Enter the  number : ");

		int n = obj.nextInt();
		for (int a = 1; a <= n; a++) {
			System.out.print(a + " ");

		}
	}
}
