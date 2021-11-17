package practOld;

import java.util.Scanner;

public class BinearySearch extends BubbleSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no of element in array :");
		int first, last, middle = 0;
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter the element of array :");
		for (int c = 0; c < arr.length; c++)
			arr[c] = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}

			}
		}

		System.out.println("Sorted array");
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

		System.out.println("Enter the searching element");
		int search = sc.nextInt();

		first = 0;
		last = arr.length - 1;
		System.out.println(middle);
		while (first <= last) {
			
			if (arr[middle] < search) {
				first = middle + 1;
			} else if (arr[middle] == search) {
				System.out.println(search + " found at location " + (middle + 1) + ".");
				break;
			} else {
				last = middle - 1;
			}
			middle = (first + last) / 2;
		}
		if (first > last) {
			System.out.println(search + " is not present in the list.\n");
		}
		sc.close();
	}
}
