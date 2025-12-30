package com.neoSoft;

public class Find_second_LargeNumber {

	    public static void main(String[] args) {
	        int[] numbers = {10, 20, 5, 40, 30};

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int number : numbers) {
	            if (number > largest) {
	                secondLargest = largest;
	                largest = number;
	            } else if (number > secondLargest && number != largest) {
	                secondLargest = number;
	            }
	        }

	        System.out.println("Second Largest: " + secondLargest);
	    }
	}
 
		


