package week5.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintSencodLargestNumber {
public static void main(String[] args) {
	// Here is the input
			int[] data = {3,2,11,4,1,6,7,5};
			//       output= 7;
			List<Integer> datas=new ArrayList<Integer>();
			for (int i = 0; i < data.length; i++) {
				datas.add(data[i]);
			}
				
			Collections.sort(datas);
			int size = datas.size();
			System.out.println("Count "+size);
			//1,2,3,4,5,6,7,11
			System.out.println("The second largest number is");
			System.out.println(datas.get(datas.size()-2));
}
}
