import java.util.Optional;
interface interface_default {
    void display();
}
class derived_class implements interface_default{

    public void classMethod(){
        System.out.println("Derived class Method");
    }

    @Override
    public void display() {
        System.out.println("Display");
    }
}

public class MethodRef {
    public static void main(String[] args) {
        derived_class obj1 = new derived_class();
        interface_default ref = obj1::classMethod;
        ref.display();
    }
}
