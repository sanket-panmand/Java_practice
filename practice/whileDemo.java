package practice;

import java.util.Scanner;

public class whileDemo {

	public static void main(String argu[]) {

		int i = 0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number :");

		int n = obj.nextInt();
		while (i < n) {
			System.out.print(" " + i);
			i++;
		}
	}
}
