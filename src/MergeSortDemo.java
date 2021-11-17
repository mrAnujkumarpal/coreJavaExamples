public class MergeSortDemo {

    public static void main(String[] args) {

        int arr[] = {2, 4, 1, 5, 9, 5};

        mergeSort(arr);
    }

    private static void mergeSort(int[] arr) {
        partition(arr);

    }

    private static void partition(int[] arr) {
        int len = arr.length;
        int left = 0;
        int right = len;
        int mid = (left + right) / 2;
        int newArray[] = new int[mid];
        for (int i = 0; i < mid; i++) {
            newArray[i] = arr[i];
        }
        partition(newArray);
        if (len <= 2) {
           // int a[] = mergeElement(newArray, len);

        }
    }

    private static void mergeElement(int[] newArray, int len) {

        if (len == 1) {
           // return newArray;
        } else {
            if (newArray[0] > newArray[1]) {
                int temp = newArray[0];
                newArray[0] = newArray[1];
                newArray[1] = temp;
               // return newArray;
            }
        }
    }
}
