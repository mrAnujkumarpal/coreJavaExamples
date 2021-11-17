package sorting.anuj;

import java.util.*;
import java.util.Arrays;
import java.util.function.Consumer;

class Namer{
    final private String firstName,lastName;

    Namer(String fn,String ln) {
        this.firstName = fn;
        this.lastName=ln;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

public class Sorter {

    public static void main(String[] args) {
        Consumer<Namer> printit=e-> System.out.println(e.getFirstName() +" "+e.getLastName());

        List<Namer> names=new ArrayList<>(Arrays.asList(new Namer("Hsrry","smith"),
                new Namer("jone","doe"),new Namer("Mary","Jane"),
        new Namer("Harry","Homeover")));

    }
}
