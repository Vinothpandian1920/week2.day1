package week2.day1;

public class Calculator1 {
	public void additionOfTwoNumbers(int a,int b) {
		int c=a+b;
	System.out.println("for Addition C="+ c);
	}
	public void subractionOfTwoNumbers(int e,int f) {
		int d=e-f;
		System.out.println("For Subtraction D="+ d);
	}
	public void multipleTwoNumbers(double i,double j) {
		double k=i*j;
		System.out.println("For Mul K="+ k);
	}
	public void divideTwoNumbers(float x,float y) {
		float z=x/y;
		System.out.println("For Division Z="+ z);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Calculator1 cal=new  Calculator1();
		    cal.additionOfTwoNumbers(10,10);
		    cal.subractionOfTwoNumbers(2,2);
		    cal.multipleTwoNumbers(1.2,2.2);
		    cal.divideTwoNumbers(20f,10f);

	}

}
