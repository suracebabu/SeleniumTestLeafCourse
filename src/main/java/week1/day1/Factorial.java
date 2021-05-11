package week1.day1;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		int getNum;
		int factSum =1;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to get factorial");
		
		getNum = scan.nextInt();
		
		
		for (int i = 1; i <= getNum; i++) {
			
			factSum = factSum*i;
			
	}
		System.out.println("The factorial of "+getNum+" is "+factSum);
	}
}
