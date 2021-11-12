package terminated;

import java.util.Scanner;

public class Exercise48 {
	public static void main(String[] args) {
	/*
	 * 3. 사용자로부터 월을 입력 받고 입력 받은 월이
	 * 며칠까지 있는지 출력하는 프로그램
	 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력해 주세요(1~12월): ");
		int month = scanner.nextInt();
		switch(month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.print( month + "월은 31일 있습니다.");
			break;
			case 4: case 6: case 9: case 11:
			System.out.print( month + "월은 30일 있습니다.");
			break;
			case 2:
			System.out.print( month + "월은 28일 있습니다.");
			break;
			default:
			System.out.print( "잘못 입력하셨습니다.");			
		}
	}
}
