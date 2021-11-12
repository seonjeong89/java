package chapter03.sec02.exam07;

public class CompareOperatorExample1 {
public static void main(String[] args) {
	int num1 = 10;
	int num2 = 10;
	boolean result1 = (num1 == num2); //true
	boolean result2 = (num1 != num2); //false
	boolean result3 = (num1 <= num2); //true
	System.out.println("result1=" + result1);
	System.out.println("result2=" + result2);
	System.out.println("result3=" + result3);
	
	char char1 = 'A'; // 65
	char char2 = 'B'; // 66
	boolean result4 = (char1 < char2); //true
	System.out.println("result4=" + result4);
	
	String str1 = "A";
	String str2 = "B";
	//boolean result5 = (str1 < str2); // String은 비교연산자 사용 불가
	
	int v2 = 1;
	double v3 = 1.0;
	boolean result6 = (v2 == v3); //true
	System.out.println("result6=" + result6);
	
	double v4 = 0.1;
	float v5 = 0.1f;
	boolean result7 = (v4 == v5); //false
	boolean result8 = ((float)v4 == v5); //true
	boolean result9 = (v4 == (double)v5); //false
	System.out.println("result7=" + result7);
	System.out.println("result8=" + result8);
	System.out.println("result9=" + result9);
}
}
