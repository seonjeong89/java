package chapter13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		list.set(2, "");
		
		int size = list.size();
		System.out.println("총 객체수: " + size);
		System.out.println();
		
		int index = 0;
		for (String str : list) {
			System.out.println(index + ":" + str);
			index++;
		}
		System.out.println();
		
		list.remove(2);
		
		index = 0;
		for (String str : list) {
			System.out.println(index + ":" + str);
			index++;
		}
	}
}
