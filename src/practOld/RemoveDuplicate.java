package practOld;

import java.util.*;

class RemoveDuplicate {
	public static void main(String args[]) {
		String s, ans = "";
		char ch;
		int l, i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any string: "); // Inputting the word
		s = sc.nextLine();
		
		l = s.length();
		s += " "; 
		
		ch = s.charAt(0); // taking ch as first character
		while (i < l) {
			ans = ans + ch; 

			while (s.charAt(++i) == ch && i < l) {
			}
			ch = s.charAt(i); // **to store the previously last character in ch
		}

		System.out.println("String after removing repeated characters : \n" + ans); 
		sc.close();
	}
}
