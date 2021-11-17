package practOld;

import java.util.HashMap;

import java.util.Scanner;

public class CharCount {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		System.out.println("Enter the string");

		char arr[] = (sc.nextLine()).toCharArray();

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (Character c : arr) {
			if (!c.equals(' ')) {
				if (hm.containsKey(c))
					hm.put(c, hm.get(c) + 1);
				else
					hm.put(c, 1);
			}
		}
		System.out.println(hm);

	}

}
