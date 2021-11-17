package practOld;

import java.util.Scanner;

public class LeanierSearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int   c,serch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no of array");
		  int arr[]= new int[sc.nextInt()];
		 
		  for(c=0; c< arr.length; c++)
		   arr[c]=sc.nextInt();
		  		  
		  System.out.println("Enter search element ");
		  serch=sc.nextInt();
		  
		  for(c=0; c< arr.length; c++){
			  if(serch==arr[c]){
				  System.out.println(serch + "is present locationn is :" +  (c+1) );
				  break;
			  }
		  }
		  if(c==arr.length){
			  System.out.println("NOT found");
		  }
		  sc.close();
	}

}
