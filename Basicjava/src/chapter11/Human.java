package chapter11;

import java.util.Objects;

public class Human {
	private String name;

	public Human(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Human)) {
			return false;
		}
		Human other = (Human) obj;
		return Objects.equals(name, other.name);
	}

	public static void main(String[] args) {
		Human h1 = new Human("홍길동");
		Human h2 = new Human("홍길순");
		System.out.println(h1.equals(h2));
	}
}
