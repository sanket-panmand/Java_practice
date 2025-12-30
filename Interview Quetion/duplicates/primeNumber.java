package duplicates;

import java.util.Scanner;
//divided exactly only by itself and 1 and greater than 1
public class primeNumber {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the any number : ");
		int n = sc.nextInt();*/
		int n=7;
		int temp=0;
		for(int i=2; i<=n-1; i++) {
			if(n % i == 0) {
			temp = temp+1;
		}
		}
		
			if(temp == 0) 
			{
				System.out.println("It is a prime Number..........."+n);
			}
			else {
				System.out.println("it is not prime number.........."+5);
			}

	}

}
