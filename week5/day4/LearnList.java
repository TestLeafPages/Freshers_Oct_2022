package week5.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
public static void main(String[] args) {
	String[] companyName= {"TCS","CTS","Qeagle","Testleaf"};
	//declare a list
	List<String> company = new ArrayList<String>();
	//Iterate the values from comapanyname
	for (int i = 0; i < companyName.length; i++) {
		//add the items in list
		company.add(companyName[i]);
		
	}
	//to sort the item in this list
	Collections.sort(company);
	
	for (int i = 0; i < company.size(); i++) {
		//print the list
		System.out.println(company.get(i));
	}
	
	
	
	
}
}
