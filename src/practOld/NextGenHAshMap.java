package practOld;

import java.util.HashMap;

public class NextGenHAshMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("a", "A");
		hm.put(new String("a"), "x");

		System.out.println(" size " + hm.size());
	}

}
