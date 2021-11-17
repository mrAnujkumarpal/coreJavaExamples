import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class Employee {
    Integer id;
    Integer Salary;

    public Employee(Integer id, Integer salary) {
        this.id = id;
        Salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSalary() {
        return Salary;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Salary=" + Salary +
                '}';
    }
}


public class EmployeeSortBySalary {

    public static void main(String[] args) {


        Employee e1 = new Employee(1, 100);
        Employee e2 = new Employee(2, 400);
        Employee e3 = new Employee(3, 500);
        Employee e4 = new Employee(4, 150);
        Employee e5 = new Employee(5, 300);

        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        list.stream()
                .sorted((emp1, emp2)->emp1.getSalary().compareTo(emp2.getSalary()))
                .forEach(System.out::println);
    }
}
