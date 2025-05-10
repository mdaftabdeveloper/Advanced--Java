package stringhandling;

public class StringsMemoryBehaviour {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		// object is created in the heap memory
		String s3 = new String("Hello");
		String s4 = new String("Hello");

		// s1 and s2 refers to the same variable in the string pool memomry
		System.out.println(s1 == s2); // return true as s1 and s2 refer same memroy location

		// s1 is created in string pool and s3 is created in heap memory
		System.out.println(s1 == s3); // return false

		// s3 and s4 are two different objects in different locations inside heap memory
		System.out.println(s3 == s4); // return false

		// intern() is used to refer the string in pool constant
		System.out.println(s1 == s3.intern());// return true

	}

}
