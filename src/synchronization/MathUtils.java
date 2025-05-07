package synchronization;

public class MathUtils {
	
	// here put the 'synchronized' keyword before the method
	// or put the thread sensitive code inside the 'synchronized' block
	
	synchronized void getMultiples(int n) {
		//synchronized (this) {
			for (int i = 1; i<=5; i++) {
				try {
					System.out.println(n * i);
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		//}
		System.out.println("Synchronized..");
	}
	
	/* Or put the synchronized keyword before method
	 * synchronized void getMultiples(int n) {
			for (int i = 1; i<=5; i++) {
				try {
					System.out.println(n * i);
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	   }
	 */
}
