package week2.day2;

import java.util.Arrays;

public class PrintNumberInDecendingOrder {
public static void main(String[] args) {
	int[] num={5,7,9,1,2,4,8};
	
	Arrays.sort(num);
	int length = num.length;
	System.out.println("Array Length "+length);
	for (int i = num.length-1; i>=0; i--) {
		System.out.println(num[i]);
	}
	
}
}
