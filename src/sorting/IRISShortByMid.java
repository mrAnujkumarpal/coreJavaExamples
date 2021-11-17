package sorting;

import java.util.Arrays;

public class IRISShortByMid {

    public static void main(String[] args) {

        int[] arr = {10201, 30215, 90051, 36103, 92315};
        int a[] = sortByMid(arr);

        System.out.println(Arrays.toString(a));

    }

    private static int[] sortByMid(int[] arr) {
        int len = arr.length;
        int newArray[] = new int[len];
        for (int i = 0; i < len; i++) {
            int num = arr[i];
            int index = middleDigitNumber(num);
            if (newArray[index] != 0) {
                index = index + 1;
            }
            newArray[index] = num;
        }
        return newArray;
    }

    static int middleDigitNumber(int number) {
        int total_digits = (int) Math.log10(number) + 1;
        int mid_digit = (int) (number / Math.pow(10, total_digits / 2)) % 10;
        return mid_digit;
    }
}
