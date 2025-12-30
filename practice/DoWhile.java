package practice;
import java.util.Scanner;
public class DoWhile {

	public static void main(String argu[]){
		
	int a=1;
	Scanner obj = new Scanner(System.in);
	System.out.print("Enter number :");
	int n = obj.nextInt();
		do {
			System.out.println("Do While");
			a++;
		}
		while(a<n);
	}
}
