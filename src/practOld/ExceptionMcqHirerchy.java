package practOld;

public class ExceptionMcqHirerchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{ 
		    int x = 0; 
		    int y = 5 / x; 
		    System.out.println(y);
		} catch (ArithmeticException ae) 
		{
		    System.out.println(" Arithmetic Exception " ); 
		} 
		catch (Exception e) 
		{
		    System.out.println("Exception"); 
		} 
		
		System.out.println("finished");
	}

}
