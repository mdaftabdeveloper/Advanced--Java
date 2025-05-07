package autoboxing;

/*
 * autoboxing is used to convert the primitive data type to their respective
 * wrapper classes.
 * int -> Integer
 * float -> Float 
 * double -> Double
 * char -> Character
 * and auto unboxing is the vice-versa of it
 */
public class AutoBoxingDemo {
    public static void main(String[] args) {
        int a = 5;
        // autobox
        Integer iObj = Integer.valueOf(a);
        System.out.println(iObj);
        // auto unbox
        int x = iObj;
        System.out.println(x);

        char ch = 'a';
        // autobox
        Character cObj = Character.valueOf(ch);
        System.out.println(cObj);

        // unbox
        char c = cObj;
        System.out.println(c);
    }
}
