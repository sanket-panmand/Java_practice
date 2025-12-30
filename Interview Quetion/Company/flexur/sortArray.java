package com.flexur;

public class sortArray {

    public static void main(String[] args) {
        
		/*
		 * int[] arr = {4, 3, 7, 1, 5}; 
		 * int[] arr1 = {14, 12, 5478, 35, 10};
		 * 
		 * // Create a new array to hold elements of both arr and arr1 
		 * int[] arr2 = new int[arr.length + arr1.length];
		 * 
		 * // Copy elements from arr to arr2 
		 * System.arraycopy(arr, 0, arr2, 0,arr.length);
		 * 
		 * // Copy elements from arr1 to arr2 
		 * System.arraycopy(arr1, 0, arr2,arr.length, arr1.length);
		 * 
		 * // Sort the combined array arr2 Arrays.sort(arr2);
		 * 
		 * // Print the sorted combined array
		 * System.out.println("Sorted Combined Array: " + Arrays.toString(arr2));
		 */
    	
    	
    	        int[] arr = {4, 3, 7, 1, 5};
    	        int[] arr1 = {14, 12, 5478, 35, 10};
    	        
    	        // Create a new array to hold elements of both arr and arr1
    	        int[] arr2 = new int[arr.length + arr1.length];    
    	        
    	        // Copy elements from arr to arr2
    	        for (int i = 0; i < arr.length; i++) {
    	            arr2[i] = arr[i];
    	        }
    	        
    	        // Copy elements from arr1 to arr2
    	        for (int i = 0; i < arr1.length; i++) {
    	            arr2[arr.length + i] = arr1[i];
    	        }
    	        
    	        // Sort the combined array arr2 using a nested loop
    	        for (int i = 0; i < arr2.length; i++) {
    	            for (int j = i + 1; j < arr2.length; j++) {
    	                if (arr2[i] > arr2[j]) {
    	                    // Swap arr2[i] and arr2[j]
    	                    int temp = arr2[i];
    	                    arr2[i] = arr2[j];
    	                    arr2[j] = temp;
    	                }
    	            }
    	        }
    	        
    	        // Print the sorted combined array
    	        System.out.print("Sorted Combined Array: ");
    	        for (int k : arr2) {
    	            System.out.print(k + " ");
    	        }
    	    }
}