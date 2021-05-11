package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int givenNum=999;
		int sum=0,rem=0,quo=0;
		while (givenNum>0) {
			
			rem	=givenNum%10;
			quo =givenNum/10;
			givenNum=quo;
			sum+=rem;
			
		};
		
		System.out.println("Sum"+sum);
	
	}

}
