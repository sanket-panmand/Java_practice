package com.flexur;

	public class ArmstrongNumber {
	    public static void main(String[] args) {
	        // Assign the number directly
	        int number = 153;

	        // Store the original number
	        int originalNumber = number;
	        int result = 0;
	        int n = 0;

	        // Find the number of digits in the number
	        for (int temp = number; temp != 0; temp /= 10) {
	            n++;
	        }

	        // Calculate the sum of digits raised to the power of the number of digits without using Math.pow
	        for (int temp = number; temp != 0; temp /= 10) {
	            int digit = temp % 10;
	            
	            // Calculate digit^n without Math.pow()
	            int power = 1;
	            for (int i = 0; i < n; i++) {
	                power *= digit;
	            }
	            
	            result += power;
	        }

	        // Check if the result equals the original number
	        if (result == number) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }
	    }
	}
