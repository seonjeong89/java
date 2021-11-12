package chapter13;

import java.util.*;

import javax.lang.model.element.Element;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		// jdk 1.4까지
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: " + set.size());
		System.out.println();
		
		// jdk 1.5부터
		System.out.println("jdk 1.5");
		for (String string : set) {
			System.out.println(string);
		}
		
		System.out.println();
		System.out.println("jdk 1.8");
		// jdk 1.8부터
		set.forEach(System.out::println);
	}
}
