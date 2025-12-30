package com.logic.practice;

public class Sum_of_Digit {

	    public static void main(String[] args) {
	    
	   int number = 1234;
	   int sum = 0;
	   
	   while(number !=0 ) {
		   sum = sum + number % 10;  //123.4 consider only after decimal 4
		   number = number / 10;      // 123.4 consider only before decimal 123
	   }
	   System.out.println(sum);
	    
	    }
}


