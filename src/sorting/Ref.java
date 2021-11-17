package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.*;

enum Name {
    Alice,Smith,Bob,Jones
}
public class Ref {

    public static void main(String[] args) {
     Set<Name> s=new TreeSet<>();
     s.add(Name.Alice);
        s.add(Name.Smith);
        s.add(Name.Bob);
        s.add(Name.Smith);
        for(Name n:s){
            System.out.println(n);

        }

    }

    private static int findMin(List<Integer> al) {

    Collections.sort(al);

    return al.get(0);
    }
}
