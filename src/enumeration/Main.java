package enumeration;

public class Main {

	public static void main(String[] args) {
		Color c1 = Color.BLUE;
		System.out.println("Color of enum is " + c1.name());
		System.out.println("Value of enum is "+ c1.getValue());
		
		for (Color color : Color.values())
		{
			System.out.println("Enum values "+ color.name());
			System.out.println("Enum values "+ color.getValue());
		}
		
	}
}
