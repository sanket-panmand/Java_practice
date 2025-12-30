package com.neoSoft;

public class AlternateCase {
    public static void main(String[] args) {
        String input = "my name is sanket";
        String result = "";
 

        for (int i = 0; i < input.length(); i++) {
        	
            char c = input.charAt(i);
            if (i % 2 == 0) {
                result += Character.toUpperCase(c); // Uppercase for even index
            } else {
                result += Character.toLowerCase(c); // Lowercase for odd index
            }
        }

        System.out.println("Original String: " + input);
        System.out.println("Transformed String: " + result);
    }
}

