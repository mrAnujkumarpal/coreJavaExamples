package lambda;

import java.util.*;

public class LambdaDemo4 {

    public static void main(String[] args) {

        List<String> places = new ArrayList<>();


        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Nepal, Pokhara");
        places.add("Africa, Nigeria");
        places.add("Nepal, Kathmandu");
        
        Collections.sort(places,(p1, p2) -> p1.length()- p2.length());
        System.out.println(places);
    }
}
