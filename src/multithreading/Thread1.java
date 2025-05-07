package multithreading;

// to implement the properties of multithreading, inherit the Thread class
public class Thread1 extends Thread {
	
	// this run method is going to start the thread
	// run method is defined in the main Thread class
	// this run method is going to override the predefined run method in the main Thread class
	
	@Override
	public void run() {
		try {
			System.out.println("This is thread 1.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
