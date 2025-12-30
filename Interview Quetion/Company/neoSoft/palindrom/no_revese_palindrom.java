package com.neoSoft.palindrom;

public class no_revese_palindrom {

		    public static void main(String[] args) {
		       
		    int a = 12345;
		    String rev ="";
		    
		    String str = Integer.toString(a);
		    int len = str.length();
		    System.out.print(a);
		  for(int i=len-2;i>=0;i--) {
			  rev = rev+str.charAt(i);
		  }
		  System.out.println(rev);
		    }
		}


