package sorting;
class Parent{
    void msg()  {
        System.out.println("Parent");

    }
}

public class TChild  extends  Parent{
    @Override
    void msg()  {
        System.out.println("Child");
    }

    public static void main(String[] args) {
        Parent p = new TChild();

            p.msg();



    }


}
