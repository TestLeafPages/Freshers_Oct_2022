package week2.day2;

public class JumpStatement {
public static void main(String[] args) {
	
	//to print 1 to 5 
	for (int i = 1; i <=5; i++) {
		
		if(i==3) {
			System.out.println("Three");
		//	continue;// to skip the current iteration
			break;
		}
		System.out.println(i);
	}
}
}
