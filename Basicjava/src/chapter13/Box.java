package chapter13;

// Genenric(제네릭)
public class Box<T> {
	private T value;
	
	public Box(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}		
}
