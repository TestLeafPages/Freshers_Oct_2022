package week2.day3;

public class MissingElement2 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,8};
//missing element 5
		
		int sum1=0;
		
		for (int i = 1; i <=8; i++) {
			sum1=sum1+i;
		}
		System.out.println(sum1);
		
		int sum2=0;
		for (int i = 0; i < arr.length; i++) {
			sum2=sum2+arr[i];
		}
		System.out.println(sum2);
		
		int sum3=sum1-sum2;
		System.out.println(sum3);
		
	}
}
