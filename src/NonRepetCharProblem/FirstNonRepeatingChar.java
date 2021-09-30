package NonRepetCharProblem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {
        
        String str="teeternkg";

        System.out.println(firstNonRepetChar(str));
    }

    private static String firstNonRepetChar(String str) {

        int len=str.length();
        HashMap<Character,Integer> hm=new LinkedHashMap<>();
        for(Character c:str.toCharArray()){
            hm.put(c, hm.get(c)!=null?hm.get(c)+1:1);
        }

     return   hm.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .map(entry -> entry.getKey())
                .orElseThrow(()->new RuntimeException("No non-repeating character found"))
                .toString();
    }

}
