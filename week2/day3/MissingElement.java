package week2.day3;

public class MissingElement {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};

		// Sort the array	


		// loop through the array (start i from arr[0] till the length of the array)

		// check if the iterator variable is not equal to the array values respectively

		// print the number

		// once printed break the iteration
		
		for(int i=0;i<arr.length;i++)
		{
			int arr1=i+1;
			if(arr1!=arr[i])
			{
				System.out.println(arr1);
				break;
				
			}
		}
		
		
	}
}
