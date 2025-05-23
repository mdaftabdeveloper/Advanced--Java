package annotations;

import java.lang.reflect.Method;

public class MyClass {
	
	@MyCustomAnnotation (value = 10)
	public void sayHello() {
		System.out.println("My Custom Annotation");
	}
	
	public static void main (String args[]) throws Exception {
		MyClass mc = new MyClass();
		Method medhodVal = mc.getClass().getMethod("sayHello");
		
		MyCustomAnnotation myCustomAnnotation = medhodVal.getAnnotation(MyCustomAnnotation.class);
		System.out.println("Value is "+myCustomAnnotation.value());
	}
}
