package sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Employee {

    private String name;

    public Employee(String name) { // constructor
        this.name = name;
    }

    @Override
    public int hashCode(){
        return 1;
    }

    //no equals() method

    @Override
    public String toString() {
        return "Employee[ name=" + name + "] ";
    }

}

public class IRISEmployee {
    public static void main(String...a){

        List<String> fruits= new ArrayList<>();
        fruits.add("mango"); fruits.add ("apple");
        for(String str:fruits){
            fruits.add("banana");
            System.out.println(fruits.size());
        }


        HashMap<Employee, String> hm=new HashMap<Employee, String>();
        hm.put(new Employee("a"), "emp1");
        hm.put(new Employee("b"), "emp2");
        hm.put(new Employee("a"), "emp1 OVERRIDDEN");

        System.out.println("HashMap's data> "+hm);
        System.out.println("HashMap's size> "+hm.size());
        System.out.println(hm.get(new Employee("a")));

    }
}
