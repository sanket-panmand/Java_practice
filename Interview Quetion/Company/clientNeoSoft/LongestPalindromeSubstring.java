package com.clientNeoSoft;

public class LongestPalindromeSubstring {
	
    public static String longestPalindrome(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
        	
            result = checkPalindrome(s, i, i, result);     // Odd-length
            result = checkPalindrome(s, i, i + 1, result); // Even-length
        }
        return result;
    }

    private static String checkPalindrome(String s, int left, int right, String result) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        String current = s.substring(left + 1, right);
        return current.length() > result.length() ? current : result;
    }

    public static void main(String[] args) {
        System.out.println("Longest Palindromic Substring: " + longestPalindrome("babad"));
    }
}
