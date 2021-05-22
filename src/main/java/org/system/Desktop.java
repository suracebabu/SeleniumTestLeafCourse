package org.system;

public class Desktop extends Computer {
	
	public void desktopSize()
	{
		
		System.out.println("Desktop Size - 1444*900");
	}
	
	
	public static void main(String args[]) {
		
		
		Desktop desObj1 = new Desktop();
		
		desObj1.computerModel();
		
		desObj1.desktopSize();
		
	}
}
