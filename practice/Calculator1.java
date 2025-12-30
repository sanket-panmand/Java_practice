package practice;
import java.util.Scanner;

public class Calculator1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Number :");
		double a = sc.nextDouble();
		
		System.out.print("Enter Second Number :");
		double b = sc.nextDouble();
		
		System.out.print("Enter the number for given operation type (1:+, 2:-, 3:*, 4:/, 5:%) : ");
		int  op = sc.nextInt ();
		
		if (op == 1)  
		{
           System.out.print("Addition :" + (a+b));
        }
        else if (op == 2)
        {
        	System.out.print("Subtraction :" + (a-b));
        }
        else if (op == 3) 
        {
        	System.out.print("Multiplication :" + (a*b));
        }
        else if (op == 4) 
        {
        	System.out.print("Division :" + (a/b));
        }
        else if (op == 5)
        {
        	System.out.print("Remaider :" + (a%b));
        }
        else
        {
        	System.out.print("Not Match..........!");
        }
	}
}
