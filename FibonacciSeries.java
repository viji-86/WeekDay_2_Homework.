package week1.day2.WH2;

//import java.util.Iterator;

public class FibonacciSeries {

	//To find Fibonacci Series for a given range
	
	 
 public static void main(String[] args) {
	 
	 //for (int i = 2; i <= 10; i++) {
		//System.out.println(i);
	 int range = 8;
	 int firstNum = 0;
	 int secNum = 1;
	 int thirdNum;
	 
	  System.out.println(firstNum);
	  System.out.println(secNum);
	 for (int i = 2; i < range; i++) {
		 
		 thirdNum = firstNum + secNum;
		System.out.println(thirdNum);
		firstNum=secNum;
		secNum=thirdNum;
	}
	 
	}
}


