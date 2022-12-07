package week2.day3;

public class OddIndexToUppercase {
public static void main(String[] args) {
	String text="changme";
	
	//1.convert the String into character
	char[] charArray = text.toCharArray();
	System.out.println(charArray);
	//2.Iterate the values 0 to charArray length
	for (int i = 0; i < charArray.length; i++) {
		//System.out.println(charArray[i]);
		if(i%2!=0) {
			char upperCase = Character.toUpperCase(charArray[i]);
			System.out.print(upperCase);
		}else {
			System.out.print(charArray[i]);
		}
	}
	
	//3.if it is odd index
	//4.change the lowercase into uppercase
	//5.print the values
}
}
