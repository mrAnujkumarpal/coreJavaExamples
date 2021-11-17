package practOld;

public class NUC_ArithmaticExcp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			int i=10/0;
			System.out.println(i);
		}
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException " + e);
		}catch(RuntimeException ex){
			System.out.println("Runtime exception " + ex);
		}catch (Exception e) {
			System.out.println(" Exception " + e);
		}
	}

}
