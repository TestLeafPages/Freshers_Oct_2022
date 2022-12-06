package week2.day2;

public class Factorial {
public static void main(String[] args) {
	//initialize the temp variable as 1
	int fact=1;
//iterate from 5 to 1
	for(int i=5;i>0;i--){
        //multiply the variable with i
	    fact= fact*i;
	    //print the  factorial
	    System.out.println(fact);
	}
}
}
