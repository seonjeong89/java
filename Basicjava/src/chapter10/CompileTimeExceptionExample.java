package chapter10;

public class CompileTimeExceptionExample {
	public static void main(String[] args) throws Exception {	
		findClass();
	}
	
	public static void findClass() throws Exception {
		Class clazz = Class.forName("java.lang.String2");
	}
}