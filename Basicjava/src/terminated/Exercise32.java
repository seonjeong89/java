package terminated;

import java.util.Scanner;

public class Exercise32 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("수도입니까?(수도: 1, 수도아님:0) ");
	int city = scanner.nextInt(); // 수도 여부 입력
	System.out.print("총 인구는?(단위: 만) ");
	int number1 = scanner.nextInt(); // 총인구 입력
	System.out.print("연 소득이 1억 이상인 인구는?(단위: 만) ");
	int number2 = scanner.nextInt(); // 연 소득 1억 이상 인구 입력
	
	String result = ( city == 0 || number1<100 ) ? 
			"메트로폴리스가 아닙니다."
			: ( (number2<50) ? "메트로폴리스가 아닙니다." 
					: "메트로폴리스입니다."); 
	// 메트로 폴리스 인지 여부 판별
	// city 변수가 0이거나 number1이 100이상이 아닐경우 ? 뒤의 문장 출력
	// city 변수가 1이고 number1이 100이상일때 number2가 50이상이 아닐경우
	// ? 뒤의 문장출력
	// number2가 50이상일때 : 뒤의 문장 출력
	System.out.println("이 도시는 " + result); //결과 값 출력
}
}
