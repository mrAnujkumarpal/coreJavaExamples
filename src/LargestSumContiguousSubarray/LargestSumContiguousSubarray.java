package LargestSumContiguousSubarray;

public class LargestSumContiguousSubarray {

    public static void main(String[] args) {

       // int [] arr={-2, 1, -3, 4, -1, 2, 1, -5, 4};
       // System.out.println(printLargestSum(arr));

        int [] arr={4,9,8,2,6};
        System.out.println(printLargestSum(arr));
    }

    private static int printLargestSum(int[] arr) {
        int len= arr.length;
        int currentMax=arr[0];
        int tempMax=currentMax;
        for(int i=1; i<len; i++){
            currentMax=Math.max(arr[i], currentMax+arr[i]);
            tempMax=Math.max(tempMax, currentMax);
            //System.out.println(currentMax + " : " + tempMax);
        }
        return tempMax;
    }
}
