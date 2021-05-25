package week3.day2.assignments;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintDupUsingCollection {
	
	public static void main(String[] args) {
		
		int[] dataSet= {1,3,8,3,11,5,6,4,7,6,7};
		
		Set<Integer> setValues = new TreeSet<Integer>();
		
		for (int i = 0; i < dataSet.length; i++) {
			
			if(setValues.add(dataSet[i]))
					
					{
				
				
			}
			 
			else {
				System.out.println(dataSet[i]);
				
			}
			
		}
		
		
		
		
	}

	private static Integer data(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
