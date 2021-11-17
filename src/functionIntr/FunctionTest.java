package functionIntr;

class Vehicle {
     public void startVehicle() {
        System.out.println("Vehicle is starting");
    }
    public void wheel() {
        System.out.println("Vehicle has  wheel");
    }
}

class Bike extends Vehicle {

    public void startVehicle() {
        System.out.println("Bike is starting");
    }

}

public class FunctionTest  {

    public static void main(String[] args) {
        Vehicle v=new Bike();
        v.startVehicle();
        v.wheel();
    }


}
