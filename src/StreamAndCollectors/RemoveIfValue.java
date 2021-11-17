package StreamAndCollectors;

import java.util.HashMap;
import java.util.Map;

public class RemoveIfValue {


    public static void main(String[] args) {

        Map<Integer, String> hm = new HashMap<>();
        hm.put(21, "Anuj");


        System.out.println("Size : " + hm.size());
        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            if (hm.containsValue(entry.getValue())) {
                hm.remove(entry.getKey());

                hm.put(25, "Anuj");
            }else{
                hm.put(256, "Anuj Pal");
            }
        }
        System.out.println("Size : " + hm.size());
        for (Map.Entry<Integer, String> entry1 : hm.entrySet()) {

            System.out.println(entry1.getKey() + " : " + entry1.getValue());

        }
    }
}
