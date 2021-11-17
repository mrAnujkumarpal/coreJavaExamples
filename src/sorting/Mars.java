package sorting;

import java.util.*;

public class Mars {
    public static void main(String[] args) {
//10,3
        int i1 = 14;
        int i2 = 4;
        int i3[] = {4, 6, 8, 9};
        System.out.println(cal(i1, i2, i3));

        int i4 = 10;
        int i5 = 3;
        int i6[] = {1, 3, 5};
        System.out.println(cal(i4, i5, i6));
    }

    private static int cal(int input1, int input2, int[] input3) {
        int sum = input1;
        int max = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < input3.length; i++) {
            list.add(input3[i]);
        }
        for (int i = 1; i <= input1; i++) {
            sum = sum - i;
            int count = 0;
            if (!list.contains(i)) {
                for (int j = i + 1; j <= input1; j++) {
                    if (!list.contains(j) && (sum - j) >= 0) {
                        sum = sum - j;
                        count++;
                    }
                }
                max = Math.max(count, max);
            }
        }
        return max + 1;
    }
}
