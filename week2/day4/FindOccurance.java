package week2.day4;

public class FindOccurance {
public static void main(String[] args) {
	//input String text="Testleaf";
	//output : faeltseT
	/*Pesudecode
	*/
	
	String text="Testleaf";
	
	//e=2
	char[] charArray = text.toCharArray();
	int count =0;
	
	for (int i = 0; i < charArray.length; i++) {
		
		if (charArray[i]=='e') {
			count++;
		}	
	}
	System.out.println("no of e in the given string is " +count);

	
	
	
	
}

}
