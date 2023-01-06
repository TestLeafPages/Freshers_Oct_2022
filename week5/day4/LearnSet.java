package week5.day4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
public static void main(String[] args) {
	
	Set<String> names=new TreeSet<String>();
	names.add("Vijay");
	boolean add = names.add("Arun");
	System.out.println(add);//[Vijay, Arun, Balaji, Vignesh, Nithish]-linkedhashset
	names.add("Balaji");//[Vijay, Vignesh, Arun, Nithish, Balaji]
	names.add("Vignesh");//[Arun, Balaji, Nithish, Vignesh, Vijay]

	names.add("Nithish");
	
	boolean add2 = names.add("Arun");
	System.out.println(add2);
	System.out.println(names);
	
	
}
}
