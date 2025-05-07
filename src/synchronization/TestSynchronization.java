package synchronization;

public class TestSynchronization {

	// here Thread1 and Thread2 accessing the getMultiples method simultaneously
	/* to make it accessing one by one just put the 'synchronized' keyword before method or put the 
	 * thread sensitive code inside the synchronized block
	 */
	
	public static void main(String[] args) {
		MathUtils obj = new MathUtils();
		
		Thread1 t1 = new Thread1(obj);
		t1.start();
		
		Thread t2 = new Thread(new Thread2(obj));
		t2.start();
	}
}
