package week1.day1;
import java.util.Scanner;
public class PrimeNumber {
	
public static void main(String[] args) {
	int givenNumber;
	int factorsIdentified=0;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number to be verified for prime");
	givenNumber = scan.nextInt();   
	
		for (int i = 1; i <= givenNumber;i++) {
				if(givenNumber %i ==0)
		{
			factorsIdentified++;
			
			if (i<=givenNumber&& factorsIdentified>2)
			{System.out.println("Entered number is not a prime"+"\n"+"There are more than two factors identified"+factorsIdentified);
			break;}
		
			else if (i==givenNumber&& factorsIdentified==2) {
				System.out.println("Entered number is a prime"+"\n"+"There exists only two factors "+factorsIdentified);
			
			}
			else {continue;
			}
		}
}}}
