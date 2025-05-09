package generics;

public class DualGenericHolder<T, U> {
	T objT;
	U objU;

	DualGenericHolder(T objT, U objU) {
		this.objT = objT;
		this.objU = objU;
	}

	private void display() {
		System.out.println(objT);
		System.out.println(objU);
	}

	public static void main(String[] args) {
		DualGenericHolder<Integer, String> objectDualGenericHolder = new DualGenericHolder<Integer, String>(100,
				"Hariom");
		objectDualGenericHolder.display();

	}

}
