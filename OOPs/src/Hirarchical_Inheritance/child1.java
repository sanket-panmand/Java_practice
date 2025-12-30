package Hirarchical_Inheritance;

import java.util.Scanner;

public class child1 extends parent {
	static void sub(int a, int b) {
		int c = a - b;
		System.out.println("Subtraction :"+ c);
	}
	
	public static void main() {
		Scanner obj = new Scanner(System.in);

		System.out.print("Enter First Number :");
		int a = obj.nextInt();

		System.out.print("Enter Second Number :");
		int b = obj.nextInt();

		System.out.println("----------------------------------");
		
		sub(a,b);           // call Static method
		child1 t1 = new child1();    //call non static method
		t1.add(a, b);
		
		parent t2 = new parent();    //call non static method
		t2.add(a, b);

		parent t3 = new child1();    //call non static method
		t3.add(a, b);
	}
}
