package week2.day3;

public class PrintEachCharacter {
public static void main(String[] args) {
	String name="GoodAfternoon";
	//find the length of the string
	int length = name.length();
	System.out.println(length);
	
	//i want to print all the character into uppercase
	String upperCase = name.toUpperCase();
	System.out.println(upperCase);
	
	
	String lowerCase = name.toLowerCase();
	System.out.println(lowerCase);
	
	
	
	//given String convert into each Character and Store the char[]
	char[] charArray = name.toCharArray();
	
	System.out.println(charArray);
	//to iterate the loop
	for (int i = 0; i < charArray.length; i++) {
		System.out.println(charArray[i]);
	}
}
}
