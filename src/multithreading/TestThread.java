package multithreading;

public class TestThread {
	public static void main(String[] args) {
		int n = 10; // number of threads
		for (int i = 0; i < n; i++) {
			Thread1 t1 = new Thread1();
			// this start method is coming from main Thread class and internally goind to
			// call the run method
			t1.run();
			Thread2 t3 = new Thread2();
			// intialization is little bit different

			/*
			 * when we use multithreading using Runnable interface, we need to create object
			 * of java main Thread class.
			 * inside the constructor of main Thread Class we have to pass the object of our
			 * new buit Thread2 class.
			 */
			Thread t2 = new Thread(new Thread2());
			t2.run(); // this one was commented
			t3.run();
		}
	}
}
/*
 * Why there is two ways to use multithreading in java.
 * Because java doesnot support Multiple inheritance that why Runnable interface
 * is used
 * Suppose we have a class which is extending to another class and that class is
 * extending to another class,
 * this is not supported by java
 * example- let say |class Cat extends MakeSound extends Animal| this is not
 * supported by java
 * |class Thread1 extends JFrame extends Thread| NOT ALLOWED
 * So Runnable interface is used to use the concept of multithreading without
 * extending the Java main Thread class
 */
