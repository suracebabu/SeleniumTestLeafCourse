package week1.day2;

import java.util.Arrays;
import java.util.Iterator;

public class LearnArray {
	static int[] seq= {20,23,90,45,56};
	
	static int[] num2 = new int[3];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(seq.length);
		
		for (int i = (seq.length-1); i >=0; i--) {
			System.out.print("\t"+seq[i]);
			
		}
		
		// sort data in ascending order, Arrays is a class & sort is method
		
		Arrays.sort(seq);
		for (int i =0; i<=(seq.length-1); i++) {
			System.out.print("\n"+seq[i]);
			
		}
//		
//		for (int num3:seq) {
//			seq[num3];
//			
//		}
		
	}

}
