package practOld;

import java.util.Scanner;

public class RecursionFact {

	public static void main(String[] args) {

		
		int y = 0;
		int i=0;
		for ( i = 0; i<10; ++i) {
		   y += i;
		}
		System.out.println("y " + y);
		
		System.out.println("i " + i);
	//	Scanner sc = new Scanner(System.in);
	//	System.out.println("Enter a no. ");
	//	int n = sc.nextInt();
	//	sc.close();
	//	System.out.println(n + "Factorial is " + fact(n));
	}

	private static int fact(int n) {
		
	
		if (n <= 1) 
			return 1;
		 else 
			 return n * fact(n - 1);
		

	
	}

}