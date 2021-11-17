package lambda;

@FunctionalInterface
interface Outlet {

    void outletName();
}


public class LambdaDemo1 {

    public static void main(String[] args) {
        Outlet outlet = new Outlet() {
            @Override
            public void outletName() {
                System.out.println("PIZZA outlet");
            }
        };
        outlet.outletName();


        Outlet chaiOutlet = () -> System.out.println("Chai Outlet");
        chaiOutlet.outletName();
    }
}
