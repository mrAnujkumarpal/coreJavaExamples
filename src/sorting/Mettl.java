package sorting;

class CapA{
    static int i=10;
     void m1() {
        System.out.println("From A");
    }
}
class CapB extends CapA{
    static int i=20;
     void m1()    {
        System.out.println("From B");
    }
}

public class Mettl {

    public static void main(String[] args)     {

        CapA a=new CapB();
        a.m1();
        System.out.println(a.i);
        boolean t=true;
        System.out.println("Hello");
        if(t){

            return;
        }
        System.out.println("Bye");
    }
}
