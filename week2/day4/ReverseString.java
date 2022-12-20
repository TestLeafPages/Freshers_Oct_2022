package week2.day4;

public class ReverseString {
public static void main(String[] args) {
	//input String text="Testleaf";
	//output : faeltseT
	/*Pesudecode
	step01: call main method
	step 02: separate string to array
	step03;insert for loop
	step04;change the value increment to decrement
	step05;call print funtion and insert chararray
	step06; close thhe bracket.*/
	
	String text="Test leaf";
	char[] charArray = text.toCharArray();
	System.out.println(charArray);
	for (int i = charArray.length-1; i >=0; i--)
	{
		System.out.println(charArray[i]);
		
	}
	
	
	
	
	
	
}

private static void array() {
	// TODO Auto-generated method stub
	
}
}
