package week1.day2;

public class Calculator {
	int num1,num2,num3,sum,diff=0;
	double prod,mulNum1,mulNum2;
	float divNum1=0,divNum2=0,divRes=0;
	
	
	public int add(int num1, int num2, int num3) {
		// TODO Auto-generated method stub

		sum = num1+num2+num3;
		return sum;
	}
	
	public int sub(int num1, int num2) {
		// TODO Auto-generated method stub

		diff = num1-num2;
		return diff;
	}
	
	public double mul(double mulNum1, double mulNum2) {
		// TODO Auto-generated method stub

		prod = mulNum1*mulNum2;
		return prod;
	}
	


	public float div(float divNum1, float divNum2) {
		
		divRes = divNum1/divNum2;

		return divRes;
	

}
}
