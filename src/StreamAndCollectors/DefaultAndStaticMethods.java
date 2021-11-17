package StreamAndCollectors;

interface MyInterface{
    default void say(){
        System.out.println("Hello, this is default method");
    }
    void sayMore(String msg);
    static void sayLouder(String msg){
        System.out.println(msg);
    }
}
public class DefaultAndStaticMethods implements MyInterface {
    @Override
    public void sayMore(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        DefaultAndStaticMethods dm = new DefaultAndStaticMethods();
        dm.say();                       // calling default method
        dm.sayMore("Work is worship");      // calling abstract method
        MyInterface.sayLouder("Helloooo...");   // calling static method
    }
}
