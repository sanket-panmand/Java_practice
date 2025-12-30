package Single_Inheritance;
import java.util.Scanner;

class main extends child  {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number :");
		int a = sc.nextInt();
		System.out.print("Enter Second number :");
		int b = sc.nextInt();

		main obj = new main();				//call non static method
		obj.add(a, b);                  
		obj.sub(a, b);
		
		main.mul(a, b);                     // call static method
		main.div(a, b);
		
		//Single inheritance
		System.out.println("--------------------------------------");
		child ch = new child();				//call non static method
		ch.add(a, b);
		ch.sub(a, b);
		
		child.mul(a, b);                     // call static method
		child.div(a, b);
		
		System.out.println("--------------------------------------");
		parent pr = new parent();				//call non static method
		pr.add(a, b);
	//	pr.sub(a, b);
		
		parent.mul(a, b);                     // call static method
	//	parent.div(a, b);
		
		System.out.println("--------------------------------------");
		child t1 = new main();		//call non static method
		t1.add(a, b);
		t1.sub(a, b);
		
		System.out.println("--------------------------------------");
		parent t2 = new child();		//call non static method
		t1.add(a, b);
		t1.sub(a, b);
		
		parent.mul(a, b);                     // call static method
		child.div(a, b);
		
	}

}
