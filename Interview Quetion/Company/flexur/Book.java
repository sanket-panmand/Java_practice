package com.flexur;

public class Book {

	public static int remain(int totalBook, int soldBook) {
		
		return totalBook - soldBook;
	}
	
	public static void main(String[] args) {
		
		int totalBook = 100;
		int soldBook = 30;
		
		int remainingBook = remain(totalBook, soldBook);
		
		System.out.println("totalBook : "+totalBook);
		System.out.println("soldBook : "+soldBook);
		System.out.println("remaining Book : "+remainingBook);

	}

}
