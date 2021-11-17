package practOld;

import java.util.Scanner;

public class BubbleSortDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements of array ");
		int i = 0, j = 0, t;
		int n=sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter the elements");

		for (i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		for (i = 0; i < n; i++) {
			for (j = 0; j < n-1; j++) {
				if (arr[j] > arr[j + 1]) {
					t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}

			}
		}

		System.out.println("Sorted array");
		for (i = 0; i < n; i++)
			System.out.println(arr[i]);

	sc.close();
	}
	
}
