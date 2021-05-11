package week1.day2;

import java.util.Arrays;

public class Anagram {
	/*
	 * Pseudo Code
	  
	 *Declare a String 
		String text1 = "stops";
	 *Declare another String
		String text2 = "potss"; 
	 * a) Check length of the strings are same then (Use A Condition)
	 * b) Convert both Strings in to characters
	 * c) Sort Both the arrays
	 * d) Check both the arrays has same value
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1 ="stops";
		String text2 ="potss"; 
		
	    int text1Len = text1.length();
	    int text2Len = text2.length();
	    
	    if (text1Len==text2Len)
	    {
		char[] char1 = text1.toCharArray();
		char[] char2 = text2.toCharArray();
		
		Arrays.sort(char1);
		System.out.println(char1);
		Arrays.sort(char2);
		System.out.println(char2);
		
	if (Arrays.equals(char1, char2)){
	
	System.out.println("text1 and text2 are anagrams");
	    }
	

	}
	    else {
			System.out.println("text1 and text2 are not anagrams");
		}
}}
