package week3.day1;

public class Calculator {

	
	public void add(int num1, int num2)
	{
		
		int sum;
		
		sum = num1+ num2;
		
		System.out.println("Sum of num1 & num2 "+ sum);
		
			}
	
	
	public void add(int num1, int num2, int num3 )
	{
		
		int sum;
		
		sum = num1+ num2+ num3;
		
		System.out.println("Sum of num1 & num2 & num3 "+ sum);
		
			}	
	
	
	public void sub(int num1, int num2)
	{
		
		int sub;
		
		sub = num1- num2;
		
		System.out.println("sub of num1 & num2 "+ sub);
		
			}
	
	
	public void sub(double num1, double num2)
	{
		
		double sub;
		
		sub = num1-num2;
		
		System.out.println("Sub of num1 & num2 "+ sub);
		
			}	
	
	public void multi(int num1, int num2)
	{
		
		int multi;
		
		multi = num1*num2;
		
		System.out.println("Multi of num1 & num2 "+ multi);
		
			}	
	
	public void multi(int num1, double num2)
	{
		
		double multi;
		
		multi = num1*num2;
		
		System.out.println("Multi of int num1 & double num2 "+ multi);
		
			}	
	
	
	public void div(int num1, int num2)
	{
		
		int  div;
		
		div = num1/num2;
		
		System.out.println("Division of int num1 & int num2 "+ div);
		
			}	
	
	public void div(Double num1, int num2)
	{
		
		double div;
		
		div = num1/num2;
		
		System.out.println("Division of Double num1 & int num2 "+ div);
		
			}	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Calculator calObj= new Calculator();
		
		calObj.add(15, 25);
		calObj.add(10, 20, 30);
		calObj.sub(40, 10);
		calObj.sub(10.5d, 1.5d);
		calObj.multi(23, 2);
		calObj.multi(22, 1.2d);
		calObj.div(50, 2);
		calObj.div(50.4d, 3);

	}

}
