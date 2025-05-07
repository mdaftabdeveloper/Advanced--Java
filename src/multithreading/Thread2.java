package multithreading;

// we can also use the concept of multithreading by implementing Runnable interface
public class Thread2 implements Runnable{
	// override the run method in the Runnable interface
	@Override
	public void run() {
		try {
			System.out.println("This is thread 2.");
		} catch (Exception e) {
			System.out.println("Exception is caught.."+e);
		}
	}
}
