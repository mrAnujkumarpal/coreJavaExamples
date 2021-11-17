import java.util.*;

public class MultiListInOne {

    public static void main(String[] args) {

      //  List<String> l1=Arrays.asList("A","B","C","D");


        List<List<String>> al=new ArrayList<>();
        al.add(Arrays.asList("A","B","C","D"));
        al.add(Arrays.asList("E","F","G","H"));
        al.add(Arrays.asList("I","J","K","L"));
        al.add(Arrays.asList("M","N","O","P"));

        al.forEach(System.out::println);
       List<String> singleList=new ArrayList<>();
        for (List<String> l:al) {

        }
    }
}
