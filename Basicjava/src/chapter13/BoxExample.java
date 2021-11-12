package chapter13;

import java.util.ArrayList;
import java.util.List;

public class BoxExample {
	public static void main(String[] args) {
		Box<Integer> box1 = new Box<Integer>(1);
		Box<String> box2 = new Box<String>("홍길동");
		
		// 타입 추론
		List<String> list = new ArrayList<>();
		list.add("홍길동");
//		list.add(new Member("",""));
		
//		Box box1 = new Box(1);
//		Box box2 = new Box("홍길동");
//		Box box3 = new Box(true);
//		Box box4 = new Box(new Member("홍길동", "hong"));		
	}
}