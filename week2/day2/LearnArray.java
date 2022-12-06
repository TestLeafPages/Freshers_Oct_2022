package week2.day2;

import java.util.Arrays;

public class LearnArray {
public static void main(String[] args) {
	
	String[] name=new String[5];
	name[0]="Balaji";
	name[1]="Hari";
	name[2]="Vignesh";
	
	System.out.println(Arrays.toString(name));
	
	
	for (int i = 0; i < name.length; i++) {
		System.out.println(name[i]);
	}
	
	
	
	
}
}
