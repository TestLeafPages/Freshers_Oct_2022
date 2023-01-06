package week5.day4;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicate {
public static void main(String[] args) {
	

	/*
	 * Problem Statement : Print only duplicate values
	 * Expected output: 4 and 8
	 * 
	 * How to solve?
	 * 1) Regular for loop
	 * 2) Using Set
	 * 
	 * Using Set 
	 * 
	 * a) Add every element into Set
	 * b) If it is already there in the Set -> Print duplicate
	 * 
	 */
	int[] data = {4,3,6,8,29,1,2,4,7,8};
	//declare a set
	Set<Integer> val=new LinkedHashSet<Integer>();
	//Iterate the values from data
	for (int i = 0; i < data.length; i++) {
		if(!val.add(data[i])) {
			System.out.println(data[i]);
		}
	}
	
	System.out.println(val);
	
	
}
}
