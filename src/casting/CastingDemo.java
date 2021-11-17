package casting;

class Parent {
    public void property() {
        System.out.println("cash+land+gold");
    }

    public void marry() {
        System.out.println("subbalakshmi"); //overridden
    }

    public void methodOne(int... i) {
        System.out.println("parent class");
    }

}

class Child extends Parent {
    public void marry() {
        System.out.println("3sha/4me/9tara/anushka");
    }

    public void methodOne(int i) {
        System.out.println("child class");
    }
}

public class CastingDemo {
    public static void main(String[] args) {

        Parent p = new Parent();
        p.marry();//subbalakshmi(parent method)
        Child c = new Child();
        c.marry();//Trisha/nayanatara/anushka(child method)
        Parent parent = new Child();
        parent.marry();//Trisha/nayanatara/anushka(child method)
        parent.property();
        parent.methodOne(10);
    }
}
