package week2.day2;

public class Fibonacci
{                                           // a0   a1    a1   a2
	                                         // b1  b1    b2   b3
	                                         //c1    c2    c3   c5
  public static void main(String[] args) 
  {
	  
	// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)

		
			
			// Iterate from 1 to the range
			
			// add first and second number assign to sum

			// Assign second number to the first number

			// Assign sum to the second number
			
	  //0,1,1,2,3,5,8,13,21,34
	
			
	int firstNumber=0;
	// Print first number
	int secondNumber=1;
	for(int i=1;i<=9;i++)
	{
		
		int sum=firstNumber+secondNumber;
		// print sum
		System.out.println(sum);
		firstNumber=secondNumber;
		secondNumber=sum;
		
	}
}
 
  
}
