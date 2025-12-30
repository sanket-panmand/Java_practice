package Hirarchical_Inheritance;

import java.util.Scanner;

public class child2 extends parent {

	static void mul(int a, int b) {
		int c = a * b;
		System.out.println("Multiplication :"+ c);
	}
	
public static void main() {
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter First Number :");
	int a = sc.nextInt();

	System.out.print("Enter Second Number :");
	int b = sc.nextInt();

	System.out.println("----------------------------------");

	mul(a,b);          // call Static method
	child2 t1 = new child2();        //call non static method
	t1.add(a, b);
	
	parent t2 = new parent();    //call non static method
	t2.add(a, b);

	parent t3 = new child2();    //call non static method
	t3.add(a, b);
	
}
}