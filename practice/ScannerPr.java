package practice;
import java.util.Scanner;

public class ScannerPr {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Number :");
		int a = sc.nextInt();
		
		System.out.print("Enter Second Number :");
		int b = sc.nextInt();
		
		System.out.println("Add To Number : " + (a+b));
		System.out.println("Sub To Number : " + (a-b));
		System.out.println("Mul To Number : " + (a*b));
		System.out.println("Div To Number : " + (a/b));

	}

}
