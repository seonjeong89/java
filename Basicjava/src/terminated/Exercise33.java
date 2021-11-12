package terminated;

import java.util.Scanner;

public class Exercise33 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("윤년인지 확인할 연도를 입력하세요: ");
	int year = scanner.nextInt(); // 확인할 연도 입력
	
	String result = ( year%400 == 0 ) ? 
			"윤년입니다."
			: ( ( year%4 == 0 && year%100 != 0 ) ? "윤년입니다." 
					: "윤년이 아닙니다."); 
	// 윤년 인지 여부 판별
	// year 변수가 400의 배수 배수일 경우 ? 뒤의 문장 출력
	// year 변수가 400의 배수가 아닐경우 : 뒤의 문장출력
	// year 변수가 4의 배수이고 100의 배수가 아닐 경우 ? 뒤의 문장 출력
	// year 변수가 4의 배수가 아니거나 100의 배수인 경우 : 뒤의 문장 출력
	System.out.println(year + "년은 " + result); //결과 값 출력
}
}
