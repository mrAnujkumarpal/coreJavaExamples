package practOld;

public class NUC_Thread extends Thread{

	static int i=1;
	public void run(int i){
		System.out.println("Running " + i++);
	}
	public static void main(String[] args) {
		System.out.println("A");
		NUC_Thread tn=new NUC_Thread();
		tn.run();
		tn.run();
		tn.start();
	}

}
