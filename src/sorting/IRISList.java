package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IRISList {

    public static void main(String[] args) {

      /*  String x="x1y2z3";

        String[] k=x.split("\\d");
        for(String s:k){
            System.out.print(s);
        }
*/

        List al=new ArrayList<>();

        al.add(20);
        al.add(8);
        al.add(5);

        Collections.sort(al);
    for(int i=0;i<al.size();i++){
        System.out.println(al.get(i));
    }
    }
}
