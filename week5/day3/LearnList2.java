package week5.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList2 {
public static void main(String[] args) {
	List<Integer> names=new ArrayList<Integer>();
	names.add(5);
	names.add(4);
	names.add(1);
	names.add(3);
	names.add(2);
	System.out.println(names);
	
	Collections.sort(names);
	System.out.println(names);
	
	Collections.reverse(names);
	System.out.println(names);
	
}
}
