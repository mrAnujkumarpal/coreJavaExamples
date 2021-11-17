import java.util.HashMap;

public class ReArrangeNumberInOccurance {
    public static void main(String[] args) {
        //5,2,8,8,5,5,8,1,9,0,1,1,0,1
       /* 
        2-1
        9-1
        0-2
        5-3
        8-3
        1-4
           */
        int arr[] = {5, 2, 8, 8, 5, 5, 8, 1, 9, 0, 1, 1, 0, 1};
        countOfElements(arr);
    }

    private static void countOfElements(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            hm.put(key, hm.get(key) == null ? 1 : hm.get(key) + 1);
        }

        System.out.println(hm);

        //sortMapByValue(hm);

        hm.entrySet().stream()
                .sorted((k1, k2) -> k1.getValue().compareTo(k2.getValue()))
                .forEach(k -> System.out.println(k.getKey() + ": " + k.getValue()));

    }
}
