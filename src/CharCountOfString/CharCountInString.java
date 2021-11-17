package CharCountOfString;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class CharCountInString {

    public static void main(String[] args) {
        String s = "This is my laptop";
        char[] word = s.toCharArray();
        Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        for (char c : word) {
            if (c !=' ') {
                charCountMap.put(c, charCountMap.get(c) == null ? 1 : charCountMap.get(c) + 1);
            }
        }
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + "  - " + entry.getValue());
        }
    }


}
