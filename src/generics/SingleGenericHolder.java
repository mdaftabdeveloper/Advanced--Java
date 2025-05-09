package generics;

public class SingleGenericHolder<T> {

	T object;

	public SingleGenericHolder(T object) {
		this.object = object;
	}

	public T getObject() {
		return object;
	}

	public static void main(String[] args) {
		SingleGenericHolder<Integer> iObjectGenericHolder = new SingleGenericHolder<Integer>(100);
		System.out.println(iObjectGenericHolder.getObject());
		SingleGenericHolder<String> sObjGenericHolder = new SingleGenericHolder<String>("Hariom");
		System.out.println(sObjGenericHolder.getObject());
	}

}
