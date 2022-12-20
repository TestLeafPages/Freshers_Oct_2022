package week2.day4;

public class Palindrome {
	public static void main(String[] args) {
		//* a) Declare A String value as"madam"

		//* b) Declare another String rev value as ""
		//* c) Iterate over the String in reverse order
		//* d) Add the char into rev
		//* e) Compare the original String with the reversed String, if it is same then print palinDrome
	String text="madam";
	char[] charArray = text.toCharArray();
	String rev="";
	for (int i =charArray.length-1 ; i >=0; i--) {
		rev=rev+charArray[i];
		
	}
	if (text.equals(rev)) {
		System.out.println("Palindrome");
		
	}
	else {
		System.out.println("Not a Palindrome");
	}
	}
}
