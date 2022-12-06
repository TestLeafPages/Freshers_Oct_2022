package week2.day2;

public class PrintDuplicate {
public static void main(String[] args) {
	
		int[] num={1,2,3,4,5,6,1,2,3};
		//output:123
		//iterate the values 0 to arrat length
		for (int i = 0; i < num.length; i++) {
			// iterate the next index value from i (i.e) i+1
			for (int j = i+1; j < num.length; j++) {
				//compare the both arrays
				if(num[i]==num[j]) {
					//print the duplicate value
					System.out.println(num[i]);
				}
			}
		}
		
		
}
}
