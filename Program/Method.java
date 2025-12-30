package Program;
import java.util.Scanner;

public class Method {
	
	public static void Square()						//Static Method
	{
		System.out.println("Square of Any number");
		System.out.print("Enter number :");
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		
		System.out.println("Square is "+ (p * p));
		System.out.println("============================================");
	}
	
	public void Rectangle_Area() 					//Non Static Method
	{
		System.out.println("Area of Rectangle");

		Scanner obj = new Scanner(System.in);
		System.out.print("Enter First value :");
		int n = obj.nextInt();	
		System.out.print("Enter Second value :");
		int m = obj.nextInt();
		int c =n*m;
		System.out.println("Area of Rectangle is "+ c);
		System.out.println("============================================");
	}

	public static void Circle_Area() 					//Static Method
	{
		System.out.println("Area of Circle ");
		System.out.print("Enter value :");
		Scanner obj = new Scanner(System.in);
		int r = obj.nextInt();
		System.out.println("Area of Circle is " + 3.14*(r*r));
	}
	
	public static void main(String argu[]) {
		
		Square();
		
		Method t1 = new Method();
		t1.Rectangle_Area();
		
		Circle_Area();		
	}
}
