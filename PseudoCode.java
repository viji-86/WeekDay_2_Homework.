package week1.day2.WH2;

public class PseudoCode {
	public static void main(String[] args) {
	
		//An array 
		// data type = variablename = variable number
		
		int[] numOne = {3,2,11,4,6,7};
		
		//int len = numOne.length;
		
		int[] numTwo = {1,2,8,4,9,7};
		
	//	int lens = numTwo.length;
		
		for (int i = 0; i < numOne.length; i++) {
			
				for (int j = 0; j < numTwo.length; j++) {
					
					if(numOne[i] == numTwo[j]) {
						System.out.println(numOne[i]);			
					}
			
		}
		
		
}
}
}
