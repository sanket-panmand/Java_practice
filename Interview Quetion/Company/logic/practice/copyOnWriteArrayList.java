package com.logic.practice;

import java.util.concurrent.CopyOnWriteArrayList;

public class copyOnWriteArrayList {

	public static void main(String[] args) {
		
		 // Create a CopyOnWriteArrayList
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // Add elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Initial List: " + list);

        // Iterate through the list
        System.out.println("Iterating over the list:");
        for (String fruit : list) {
            System.out.println(fruit);

            // Attempt to modify the list while iterating
            // CopyOnWriteArrayList allows this safely
            if (fruit.equals("Banana")) {
                list.add("Date");
            }
        }

        // Show the list after modification
        System.out.println("List after modification: " + list);
        }
}