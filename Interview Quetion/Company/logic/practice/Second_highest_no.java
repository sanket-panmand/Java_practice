package com.logic.practice;

public class Second_highest_no {

    public static void main(String[] args) {
        int[] arr = {2, 3, 8, 6, 5};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } 
            else if (num > second && num != first) {
                second = num;
            }
            
        }
        System.out.println(second);
    }
}
   