package sorting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class AirPlane{
    public AirPlane() throws IOException{
        System.out.println("Air plane");
        throw  new IOException();
                    }
}
class AirJet extends AirPlane{
    public AirJet() throws IOException{


    }
}
public class Tester {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("hi");
        list.add("hi");
        list.add("how");
        list.add("are");
        list.add("you");
        System.out.println("B4 " + list);
        Collections.fill(list,"hi");
        list.add("dear");
        System.out.println("Af " + list);
        System.out.println("Frequency " + Collections.frequency(list , "hi"));
    }
}
