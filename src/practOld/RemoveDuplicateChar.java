package practOld;

import java.util.HashSet;
import java.util.Scanner;



public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  string");
		StringBuilder sb=new StringBuilder();
		char [] ch= (sc.nextLine()).toCharArray();
		HashSet<Character> hs=new HashSet<Character>();
		
		for(char c:ch){
			if(!hs.contains(c)){
				hs.add(c);
				sb.append(c);
			}
			
		}
		
		System.out.println("Final String: " + sb);
		sc.close();
	}

}
