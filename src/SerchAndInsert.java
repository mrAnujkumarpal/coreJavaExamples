import java.util.Arrays;







/*select e.name and employee_name, m.name and manager_name,  from Employee e,Employee m on e.id=m.id;
final class Employee {
    private final int id;
    private final String name;
    private final String mob;

    public Employee(int id, String name, String mob) {
        this.id = id;
        this.name = name;
        this.mob = mob;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMob() {
        return mob;
    }
}


class MyCustomArrayList{
//Custom ArrayList
//addElmet();
//getEmelemt();
//size();
//Defeult_Capacity=10;



    int DEFAULT_CAPACITY=10;
    int size=0;
    Employee empObject[];

    MyCustomArrayList(){
        empObject=new Employee[DEFAULT_CAPACITY];
    }
    void addElement(Employee e){
// For dynamic encrease
        empObject[size++]=e;
    }

    Employee getElement(int index){
        return empObject[index];
    }
    int listSize(){
        return size;
    }

}






















public class SerchAndInsert {

    public static int binary_Search(int arr[], int l, int h, int key) {

        if (h >= l) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                return binary_Search(arr, l, mid - 1, key);
            } else {
                return binary_Search(arr, mid + 1, h, key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Employee e1=new Employee(1,"A","1234");
        Employee e2=new Employee(2,"B","5678");

        MyCustomArrayList list = new MyCustomArrayList();


        list.addElement(e1);
        list.addElement(e2);

        System.out.println(list.listSize());





        /*int arr[] = {2, 6, 9, 12, 45};
        Arrays.sort(arr);
        int key = 11;
        int len = arr.length - 1;
        int result = binary_Search(arr, 0, len, key);

        if (result == -1)
            System.out.println(" Key will insert in this index : " + insertKeyInArray(arr, len, key));
        else
            System.out.println("index : " + result);
*/
/*
    }

    private static int insertKeyInArray(int[] oldArr, int len, int key) {
        for (int i = 0; i <= len; i++) {
            if (key < oldArr[i]) {
                return i;
            }
        }
        return len+1;
    }

}
*/