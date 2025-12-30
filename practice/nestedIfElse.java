package practice;
import java.util.Scanner;

public class nestedIfElse {

	public static void main(String argu[]) {
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter Any number :");
		int n = obj.nextInt();
		
		if(n % 2 == 00){
			System.out.print("This is a Even Number ");
			
			if(n % 4 == 0) {
				System.out.println("and Divisible by 4");
			}
			else {
				System.out.println("and not Divisible by 4");
			}
			
		}
		else{
			System.out.print("This is Odd Number ");
			
			if(n % 3 == 0) { 
				System.out.println("and Divisible by 3");
			}
			else {
				System.out.println("and not Divisible by 3");
			}
		}
	}
}
