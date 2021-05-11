package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numberList = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count;
		for (int i = 0; i < numberList.length; i++) {
			count =0;
			for (int j =i+1; j < numberList.length; j++) 
			{
				
				if (numberList[i]==numberList[j]) {
					count++;
										
				}
				else {continue;}
								
			if(count>0) {
				System.out.println("Duplicate found"+numberList[i]);
			}
		}
		
	}

}
}
