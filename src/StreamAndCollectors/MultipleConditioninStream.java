package StreamAndCollectors;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MultipleConditioninStream {

    public static void main(String[] args) {

        Predicate<Integer> evenNum=i->i%2==0;
        Predicate<Integer> high=i->i>1;
        Predicate<Integer> low=i->i<10;

        List<Integer> al = Arrays.asList(1,2,3,4,5,6,7,8,9,20);

      List<Integer>l=  al.stream().filter(evenNum.and(high).and(low)).collect(Collectors.toList());
        System.out.println(l);

       int ll=  al.stream().filter(i->i>1 && i<10 && i%2==0).mapToInt(Integer::intValue).sum();
        System.out.println(ll);
    }
}
