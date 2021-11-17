package HCL;

import java.util.HashMap;
import java.util.List;

class Department implements Cloneable{

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}

//Put & petch

final class Employee {
    private final String id;
    private final Department department;
    //transient String age;


    Employee(String id,  Department department) {
        this.id = id;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public Department getDepartment() throws CloneNotSupportedException {
        return  (Department) department.clone();
    }
}

public class ImmutableDemo {

    public static void main(String[] args) {

        HashMap<Employee,String> hm = new HashMap<>();

        //hashCode()--->5
        //equals()-->true;

                //size--1
    }
}
