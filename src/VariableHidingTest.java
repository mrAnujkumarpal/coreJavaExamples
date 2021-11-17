class ParentVariable {

    String instanceVariable = "parent variable";

    public void printInstanceVariable() {
        System.out.println("instanceVariable Parent : " + instanceVariable);
    }
}

class ChildVariable extends ParentVariable {

    String instanceVariable = "child variable";

    public void printInstanceVariable() {
        System.out.println("instanceVariable child :  " + instanceVariable ) ;
    }
}


public class VariableHidingTest {

    public static void main(String[] args) {

        ParentVariable obj = new ChildVariable();


        obj.printInstanceVariable();
        System.out.println(obj.instanceVariable);

    }
}
