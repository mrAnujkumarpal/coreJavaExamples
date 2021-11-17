package constructor;

public class FinallyDemp {

    public static void main(String[] args) {
        System.out.println(m1());

       /* try{
            System.out.println("Hello");

        }catch (InterruptedException e){

        }*/
    }

    public static int m1() {
        try {
            System.out.println(10 / 0);
            return 777;
        } catch (NullPointerException e) {
            return 888;
        } finally {

            System.out.println("Finally");
            //return 999;
        }
    }
}

