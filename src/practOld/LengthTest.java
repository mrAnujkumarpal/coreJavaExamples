package practOld;

public class LengthTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (string_Lenght_Test("anu sdgdsfg", 5)) {
			System.out.println("Not greater then 5");
		} 	
		
		String ckMacLenMsg= ckMaxLen("anuj kumar pal", 5 , "First Name");
		if(!ckMacLenMsg.isEmpty()){
			System.out.println(ckMacLenMsg);
		}
	}

	protected static boolean string_Lenght_Test(String a, int l) {
		if (a.length() > l) 
			return true;
		else		
			return false;	

	}
	
	protected static String ckMaxLen(String a, int l, String fldnme ) {
		String r="";
		if (a.length() > l)  {
			r= fldnme + " can not be greater " +l+ " Character";
		}
		return r;
	}
	
	// ("First Name length can not be greater 34 character");
	
}
