package multilevel_Inheritance;

import java.util.Scanner;

class main extends child4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter First Number :");
		int a = sc.nextInt();

		System.out.print("Enter Second Number :");
		int b = sc.nextInt();

		System.out.println("----------------------------------");

		main obj = new main(); // call Non Static method
		obj.add(a, b);
		obj.sub(a, b);
		obj.mul(a, b);
		obj.div(a, b);
		obj.mod(a, b);

		System.out.println("----------------------------------");

	   // call Static method
		main.add(a, b);
		main.sub(a, b);
		main.mul(a, b);
		main.div(a, b);
		main.mod(a, b);

		System.out.println("----------------------------------");
		child4 t1 = new main();
		t1.add(a, b);
		t1.sub(a, b);
		t1.mul(a, b);
		t1.div(a, b);
		t1.mod(a, b);
		
		System.out.println("----------------------------------");
		child4 t2 = new child4();
		t2.add(a, b);
		t2.sub(a, b);
		t2.mul(a, b);
		t2.div(a, b);
		t2.mod(a, b);
	}

}
