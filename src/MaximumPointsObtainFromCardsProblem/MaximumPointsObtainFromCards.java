package MaximumPointsObtainFromCardsProblem;

public class MaximumPointsObtainFromCards {


    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,1};  int k1 = 3;
        System.out.println(maxPointObtain(arr1, k1));

        int[] arr2 = {2,2,2};  int k2 = 2;
        System.out.println(maxPointObtain(arr2, k2));

        int[] arr3 = {9,7,7,9,7,7,9};  int k3 = 7;
        System.out.println(maxPointObtain(arr3, k3));

        int[] arr4 = {1,1000,1};  int k4 = 1;
        System.out.println(maxPointObtain(arr4, k4));

        int[] arr5 = {1,79,80,1,1,1,200,1};  int k5 = 3;
        System.out.println(maxPointObtain(arr5, k5));
    }


    private static int maxPointObtain(int[] arr, int k) {
        int sum = 0;
        int LA[] = new int[k + 1];
        int RA[] = new int[k + 1];
        LA[0] = 0;
        RA[0] = 0;
        for (int i = 1; i <=k; i++) {
            LA[i] = LA[i - 1] + arr[i - 1];
        }
        for (int i = 1; i <=k; i++) {
            RA[i] = RA[i - 1] + arr[arr.length - i];
        }
        for (int i = 0; i <=k; i++) {
            sum = Math.max(sum,LA[i]+RA[k-i]);
        }

        return sum;
    }
}
