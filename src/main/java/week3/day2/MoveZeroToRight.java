package week3.day2;

import java.util.*;

public class MoveZeroToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {4,0,3,0,1,5,2,0};
		
		int zeroCount=0;
		int swapNum;
		
		
		List<Integer> values = new ArrayList<Integer>();
		
		for (Integer integer : num) {
			if(integer!=0)
				{
				values.add(integer);
				zeroCount++;
				}
			}
	
		
		for(int i=0;i<(num.length-zeroCount);i++)
		{
		values.add(0);
		}
		System.out.println(zeroCount);
		System.out.println(values);
		
		
//	
		for (Integer integer : num) {
			
			System.out.println(integer);
		}
		
	}
	
	
//	for (int i = 0; i <(num.length-2); i++) {
//		//check if first number is zero, if zero -> shift right and swap the right number to left
//		if(num[i]==0)
//		{
//			
//			if(num[i+1]==0)
//			{
//				num[i]=num[i+2];
//				num[i+2]=0;
//				
//			}
//			else {
//			num[i]= num[i+1];
//			num[i+1]=0;
//			}
//		}
//		
//		else {
//			continue;
//		}
//	}
}
