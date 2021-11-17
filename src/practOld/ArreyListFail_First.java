package practOld;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArreyListFail_First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> listObject = new ArrayList<String>();
        listObject.add("Alive is awesome");
        listObject.add("Love yourself");

        ListIterator<String> listIteratorObject =  listObject.listIterator();
        System.out.println("ListIterator object output in forward direction:");
        System.out.println("");

       
         while( listIteratorObject.hasNext() )
           System.out.println(listIteratorObject.next());
         
      
        System.out.println("ListIterator object output in backward direction:");
        System.out.println("");

      
         while( listIteratorObject.hasPrevious() )
           System.out.println(listIteratorObject.previous());
               
 
        List<String> iteratorListObject = new ArrayList<String>();
        iteratorListObject.add("Facebook");  
        iteratorListObject.add("Google");
        iteratorListObject.add("Apple");
        
        Iterator<String> javaHungryIterator =  iteratorListObject.iterator();
        System.out.println("Iterator object output in forward direction:");

        while( javaHungryIterator.hasNext() )
         System.out.println(javaHungryIterator.next());
        
 
 }

}
