package practOld;

class A{
	
	public void methodX(){
		System.out.println("Parrent" );
	}
}


public class NextGenOverriding {


	private void methodX(){
	
		System.out.println("child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NextGenOverriding o = new NextGenOverriding();
		o.methodX();
		
	}

}
