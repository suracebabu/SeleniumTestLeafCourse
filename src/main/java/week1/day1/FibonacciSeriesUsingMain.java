package week1.day1;
import java.util.Scanner;

import org.junit.Test;
public class FibonacciSeriesUsingMain {
 
	public static void main(String[] args) {
		int lastSequence=0;
		int currentSequence=1;
		int nextSequence;
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the sequence");
	int sequence = scan.nextInt();
	
	System.out.print(lastSequence);
	System.out.print("\t"+currentSequence);
	
	do {		
		nextSequence=lastSequence+currentSequence;
		System.out.print("\t"+ nextSequence);
		lastSequence=currentSequence;
		currentSequence=nextSequence;
		sequence--;
	} 
	while(sequence>0);
		}
}