package week1.day2;

import java.util.Scanner;

public class Palindrome {
	/*
	 * Pseudo Code
	
	 * a) Declare A String value as"madam"
	 
	 * b) Declare another String rev value as ""
	 * c) Iterate over the String in reverse order
	 * d) Add the char into rev
	 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
	 
	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
	 */

	public static void main(String[] args) {
		
		System.out.println("Enter a string value");
		Scanner scan = new Scanner(System.in);
		String Str3 = scan.nextLine();
		//String str1="madam";
		String str2="";
		
		for (int i =(Str3.length()-1); i >=0; i--) {
			
			//System.out.print(str1.charAt(i));
			str2=str2+Str3.charAt(i);
		}
		
		if(Str3.equalsIgnoreCase(str2)){
			System.out.println("Entered string  "+Str3+" is an Palindrome");
		}

	}}


