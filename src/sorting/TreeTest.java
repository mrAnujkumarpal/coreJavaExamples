package sorting;

import java.util.TreeSet;

public class TreeTest {

    public static void main(String[] args) {

        TreeSet s1= new TreeSet();
        TreeSet subset1= new TreeSet();

        for(int i=604;i<617;i++){
            if(i%2==0){
                s1.add(i);
            }
        }
        subset1= (TreeSet) s1.subSet(606,613);
        s1.add(629);
        subset1.add(629);
        System.out.println(s1+ " " +subset1);



    }
}
