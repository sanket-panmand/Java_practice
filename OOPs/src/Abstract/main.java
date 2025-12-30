package Abstract;

import java.util.Scanner;



public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first Number : ");
		int a = sc.nextInt();
		System.out.print("Enter Second Number : ");
		int b = sc.nextInt();
		calculator2 obj = new calculator2();
//		obj.add(a,b);
//		obj.sub(a,b);
//		obj.mul(a,b);
//		obj.div(a,b);
//		obj.mod(a,b);
		
		System.out.print("Enter the operation Number : ");
		String c = sc.next();
	
		if(c.equals("add")){
			obj.add(a,b);
		}
		else if(c.equals("sub")) {
			obj.sub(a,b);
		}
		else if(c.equals("mul")) {
			obj.mul(a,b);
		}
		else if(c.equals("div")) {
			obj.div(a,b);
		}
		else if(c.equals("mod")) {
			obj.mod(a,b);
		}
		else  {
			System.out.print("Not match..........");
		}

	}

}

