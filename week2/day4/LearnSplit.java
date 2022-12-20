package week2.day4;

import java.util.Iterator;

public class LearnSplit {
public static void main(String[] args) {
	
	String words="i am a software       tester";
	//split the given string
	String[] split = words.split("\\s+");
	//initialize the variable as count
	int count=0;
	
	int length = split.length;
	System.out.println("length "+length);
	//iterate the loop
	for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
		count++;
	}
	System.out.println(count);
	
}
}
