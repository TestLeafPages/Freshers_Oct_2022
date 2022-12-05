package week2.day1;

public class Calculator {

	public int addTwoNumber(int a, int b) {
				int c=a+b;
		//System.out.println(c);
				return c;
	}
	public void subractionTwoNumber(int total, int b) {
		int c=total - b;
     System.out.println(c);
		
}
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		int total = calc.addTwoNumber(10,20);
		System.out.println(total);
		calc.subractionTwoNumber(total , 10);
	}
}
