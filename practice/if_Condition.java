package practice;

import java.util.Scanner;

public class if_Condition {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a Mark :");
		int mark = sc.nextInt();
		
		if(mark <= 100 && mark >= 90)
		{
			System.out.println("Outstanding.........!");
		}
		else if(mark <= 89 && mark >= 70)
		{
			System.out.println("Distingtion..........!");
		}
		else if (mark <= 79 && mark >= 60 )
		{
			System.out.println("Average..............!");
		}
		else if (mark <= 69 && mark >=35 )
		{
			System.out.println("Pass..............!");
		}
		else
		{
			System.out.println("Fail..............!");
		}

	}

}
