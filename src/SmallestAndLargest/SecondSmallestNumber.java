package SmallestAndLargest;

public class SecondSmallestNumber {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 8, 9};

        int sNum = secondSmallest(arr);
    }

    private static int secondSmallest(int[] arr) {
        int len = arr.length;
        int firstMin = arr[0];
        int secondMin =   Math.min(arr[0],arr[1]);
        int temp = 0; int sum=0;
        for (int i = 0; i < len; i++) {
            if (arr[i] < firstMin) {

            }

        }
        return sum;
    }
}
