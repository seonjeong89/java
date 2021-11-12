package chapter03.sec02.examcheck;

import java.util.Scanner;

public class check09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 수: ");
		String value1 = scanner.next();
		System.out.print("두 번째 수: ");
		String value2 = scanner.next();
		double value3 = Double.parseDouble(value1);
		double value4 = Double.parseDouble(value2);
		System.out.println("-----------------");
		
		String result = (value3<=0 || value4<=0 ? "무한대" : value3/value4 + "");
		System.out.println(result);
		
		//double result1 = value3/value4;
		//if(result1>0) {
		//	System.out.println("결과:" + result1);
		//}
		//else{
		//	System.out.println("결과: 무한대");
		}
		}