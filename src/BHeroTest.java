import java.util.Hashtable;
import java.util.Vector;

public class BHeroTest {

    public static void main(String[] args) {

        int arr[]=new int[]{1,2,3,4};
        Vector<Integer> v=new Vector<>();
        Hashtable<Integer,String> h=new Hashtable<>();
        v.addElement(arr[2]);
        v.addElement(arr[3]);
        h.put(arr[1],"India" );
        h.put(v.elementAt(1),"4India" );
        System.out.println(arr[0]);
        System.out.println(v.elementAt(1));
        System.out.println(h.get(1));

    }
}
