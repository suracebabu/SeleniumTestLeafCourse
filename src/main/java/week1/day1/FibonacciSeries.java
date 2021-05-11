package week1.day1;
import java.util.Scanner;

import org.junit.Test;
public class FibonacciSeries {
		@Test
	public void findFinobannicSeries(){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the sequnce");
	int sequence = scan.nextInt();
	calculateFibonacciSeries(sequence);
	}
private void calculateFibonacciSeries(int data) {
	int lastSequence=0;
	int currentSequence=1;
	int nextSequence;
	System.out.print(lastSequence);
	System.out.print("\t"+currentSequence);
	
	do {		
		nextSequence=lastSequence+currentSequence;
		System.out.print("\t"+ nextSequence);
		lastSequence=currentSequence;
		currentSequence=nextSequence;
		data--;
	} 
	while(data>0);
		}
}