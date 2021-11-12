package chapter02;

import java.util.Scanner;

public class ScannerExample {
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	System.out.print("정수를 입력하세요: ");
	int value1 = scanner.nextInt();
	System.out.println("글자를 입력하세요: ");
	String message = scanner.next();
	System.out.println("입력된 값: " + value1);
	System.out.println("입력된 메시지: " + message);
}
}