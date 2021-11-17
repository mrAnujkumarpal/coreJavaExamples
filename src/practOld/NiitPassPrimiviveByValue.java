package practOld;

public class NiitPassPrimiviveByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=3;
		passMethod(x);
		System.out.println("Finally ===> " + x);
		
	}
	
	public static void passMethod(int p){
		System.out.println("1");
		p=10;
		
	}

}
