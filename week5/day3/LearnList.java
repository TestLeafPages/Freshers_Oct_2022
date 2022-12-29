package week5.day3;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
public static void main(String[] args) {
	List<String> names=new ArrayList<String>();
	
	
	
	names.add("Vijay");
	names.add("Arun");
	names.add("Balaji");
	names.add("Vignesh");
	names.add("Nithish");
	
	System.out.println(names);
	//verify if the list is empty 
		boolean empty = names.isEmpty();
		System.out.println(empty);
		
		//to get the particular element in this list
		String string = names.get(2);
		System.out.println(string);
	//To iterate the for loop
int size = names.size();
System.out.println(size);

for (int i = 0; i < names.size(); i++) {
	String string2 = names.get(i);
	System.out.println(string2);
}

//names.remove(2);
names.remove("Arun");
System.out.println(names);

//add one more element in particular index
names.add(0, "Ajay");
System.out.println(names);


}
}
