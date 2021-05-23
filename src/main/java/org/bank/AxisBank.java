package org.bank;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		
		System.out.println("Axis -Term deposit Account-interest 7.3%"); 
		
		
	}

	public static void main(String[] args) {
		AxisBank axisObj1 = new AxisBank();
		
		axisObj1.deposit();
		
	}
}
