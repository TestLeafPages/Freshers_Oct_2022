package week2.day3;

public class LearnString2 {
public static void main(String[] args) {
	
	String text="Test Leaf";
	//given String convert into each Character and Store the char[]
		//char[] charArray = text.toCharArray();
		char charAt2 = text.charAt(5);
		System.out.println("charAt2  "+charAt2);
		//System.out.println(charArray);
		//to iterate the loop
		for (int i = 0; i <text.length(); i++) {
			char charAt = text.charAt(i);
			System.out.println(charAt);
		}
	
}
}
