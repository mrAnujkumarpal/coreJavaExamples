package HouseRobbProblem;

public class RobbMaxAmount {

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 7, 1, 1};
        System.out.println(maxRobbAmount(arr));

        int nums[] = {2,0,0,2};
        System.out.println(maxRobbAmount(nums));

        int num[] = {2,9,0,2,9};
        System.out.println(maxRobbAmount(num));
    }

    private static int maxRobbAmount(int[] arr) {
        int len = arr.length;
        if (len == 0) return 0;
        if (len == 1) return arr[0];
        if (len == 2) return Math.max(arr[0], arr[1]);
        int lootBag[] = new int[len];
        if (len > 2) {
            lootBag[0] = arr[0];
            lootBag[1] = Math.max(arr[0], arr[1]);
            int sum = 0;
            for (int i = 2; i < len; i++) {
                lootBag[i] = Math.max(lootBag[i - 1], lootBag[i - 2] + arr[i]);
            }
        }
        return lootBag[len - 1];

    }
}
