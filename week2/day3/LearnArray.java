package week2.day3;

import java.util.Arrays;

public class LearnArray {
public static void main(String[] args) {
	
	String[] name=new String[5];
	name[0]="Balaji";
	name[1]="Hari";
	name[2]="Vignesh";
	
	System.out.println(Arrays.toString(name));
	
	System.out.println(name[5]);
	for (int i = 0; i < name.length; i++) {
		System.out.println(name[i]);
	}
	
	
	
	
}
}
