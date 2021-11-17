package sorting;

class Food extends Exception {
}

class Pizza extends Food {

}

public class IRISPizzaTest {
    public static void main(String[] args) {
        try {
            throw new Pizza();
        } catch (Pizza p) {
            System.out.println("Pizz");
        }catch (Food f) {
            System.out.println("Base");
        }
    }
}
