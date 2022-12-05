package week2.day1;

public class SwappingBetweenTwoNumber2 {
public static void main(String[] args) {
	//Swapping between two numbers without temp variable
	int a=10;
	int b=20;
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	
	System.out.println(b);
}
}
