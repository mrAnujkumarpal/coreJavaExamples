package lambda;

interface Wish{

    void wishMe(String s);

}
public class LambdaDemo2 {
    public static void main(String[] args) {
        Wish morningWish=new Wish(){
            @Override
            public void wishMe(String s) {
                System.out.println("Good "+s);
            }
        };
        morningWish.wishMe("Morning");


        Wish eveningWish=(str)-> System.out.println("Good " + str);
        eveningWish.wishMe("Evening");
    }
}
