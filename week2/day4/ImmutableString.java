package week2.day4;

public class ImmutableString {
public static void main(String[] args) {
	String text="Test";
	
	text="leaf";
	System.out.println(text);
	
	
	String s1="Testleaf";
	String s2="Testleaf";
	if(s1==s2) {
		System.out.println("Literal are equal");
	}else {
		System.out.println("Not equal");
	}
	
	String name=new String("TestLeaf");
	String name2=new String("Testl eaf");
	if(name==name2) {
		System.out.println("Litteral are equal");
	}else {
		System.out.println("Not equal");
	}
	boolean equals = name.equals(name2);
	System.out.println(equals);
	if(name.equalsIgnoreCase(name2)) {
		System.out.println(".equal    Litteral are equal");
	}else {
		System.out.println(".equal Not equal");
	}
	
}
}
