package terminated;

import java.util.Scanner;

public class Exercise47 {
	public static void main(String[] args) {
	/*
	 * 2. 구구단 중 원하는 단을 입력받아 
	 * 해당 단을 출력하는 프로그램
	 */
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("원하는 구구단 단수를 입력하세요: ");
		 int inputNum = scanner.nextInt();
		 for(int n=1; n<=9; n++ ) {
			 System.out.println(inputNum + " x " + n + " = " + (inputNum*n));			 
		 }
	}
}
