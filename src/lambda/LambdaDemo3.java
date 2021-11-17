package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface ArithmaticOperations {

    int sum(int a, int b);
}

public class LambdaDemo3 {
    public static void main(String[] args) {


        int x=5,y=0;
        try{
            try {
                System.out.println(x);
                System.out.println(x / y);
                System.out.println(y);
            }catch (ArithmeticException a){
                System.out.println("Inn 1");
            }
            catch (RuntimeException a){
                System.out.println("Inn 2");
            }
            finally{
                System.out.println("inner finally");
            }
        }catch (Exception e){
            System.out.println("outer catch");
        }


        ArithmaticOperations opr = (a, b) -> a + b;
        // System.out.println(opr.sum(2, 8));


        List<String> al = new ArrayList<>();
        al.add("1");
        al.add("2");
        al.add(0, "3");
        al.add(1, "4");

        //al.forEach(System.out::println);

        Supplier<String> i = () -> "Car";
        Consumer<String> c = n -> System.out.print(n.toLowerCase());
        Consumer<String> d = n -> System.out.print(n.toUpperCase());
        c.andThen(d).accept(i.get());
        System.out.println();
    }
}
