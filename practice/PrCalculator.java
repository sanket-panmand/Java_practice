package practice;
import java.util.Scanner;

public class PrCalculator
{
	public static void main(String[] args)
	{		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Number :");
		double a = sc.nextDouble();
		
		System.out.print("Enter Second Number :");
		double b = sc.nextDouble();
		
		System.out.print("Name of Operation: ");
		
           String t2 = sc.next(); 
           if(t2.equals("add"))
           {
           	System.out.println("Addition :" + (a+b));
           	System.out.print("Name of Operation : ");
           }
           
   		   String t3 = sc.next(); 
           if(t3.equals("sub"))
           {
           	System.out.println("Subtraction :" + (a-b));
           	System.out.print("Name of Operation : ");
           }
           
           String t4 = sc.next(); 
           if(t4.equals("mul")) 
           {
           	System.out.println("Multiplication :" + (a*b));
           	System.out.print("Name of Operation : ");
           }
           
           String t5 = sc.next(); 
            if(t5.equals("div")) 
           {
           	System.out.println("Division :" + (a/b));
           	System.out.print("Name of Operation : ");
           }
            
            String t6 = sc.next(); 
            if(t6.equals("mod"))
           {
           	System.out.println("Remaider :" + (a%b));
           	System.out.print("Name of Operation : ");
           }
            
           else
           {
           	System.out.println("Not Match..........!");
           }
        }
      
	}


