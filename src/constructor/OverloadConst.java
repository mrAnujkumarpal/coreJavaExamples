package constructor;

public class OverloadConst {

    OverloadConst(double d){
        System.out.println("double-argument constructor");
    }
    OverloadConst(int i) {
        this(10.5);
        System.out.println("int-argument constructor");
    }
    OverloadConst() {
        this(10);
        System.out.println("no-argument constructor");
    }
    public static void main(String[] args) {
        OverloadConst t1=new OverloadConst();
        // OverloadConst t2=new OverloadConst(10);
       // OverloadConst t3=new OverloadConst(10.5);
    }
}
