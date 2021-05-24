package week3.day2;

import java.util.*;

public class MoveZeroToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numArray = {4,0,3,0,1,5,2,0};
		
		int zeroCount=0;
		int swapNum;
		
		for (int i = 0; i <(numArray.length-2); i++) {
			//check if first number is zero, if zero -> shift right and swap the right number to left
			if(numArray[i]==0)
			{
				
				if(numArray[i+1]==0)
				{
					
					numArray[i]=numArray[i+2];
					numArray[i+2]=0;
					
				}
				else {
					numArray[i]= numArray[i+1];
					numArray[i+1]=0;
				}
			}
			
			else {
				continue;
			}
		}
		
		
		
//		List<Integer> values = new ArrayList<Integer>();
//		
//		for (Integer integer : num) {
//			if(integer!=0)
//				{
//				values.add(integer);
//				zeroCount++;
//				}
//			}
//	
//		
//		for(int i=0;i<(num.length-zeroCount);i++)
//		{
//		values.add(0);
//		}
//		System.out.println(zeroCount);
//		System.out.println(values);

	for (Integer integer : numArray) {
		
		System.out.println(integer);
	}
	
	}}
