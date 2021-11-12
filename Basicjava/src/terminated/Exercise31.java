package terminated;

import java.util.Scanner;

public class Exercise31 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("첫 번째 숫자를 입력하세요: ");
	int number1 = scanner.nextInt(); // 첫번째 숫자 입력
	System.out.print("두 번째 숫자를 입력하세요: ");
	int number2 = scanner.nextInt(); // 두번째 숫자 입력
	int largenumber = ((number1 + number2) + 
			Math.abs(number1 - number2)) / 2; // 큰 수 정의
	int smallnumber = ((number1 + number2) - 
			Math.abs(number1 - number2)) / 2; // 작은 수 정의
	
	String result = ( number1 == 0 || number2 == 0 ? 
			"잘못 입력하셨습니다. 0이 아닌 숫자를 입력해 주세요."
			: "큰 수를 작은 수로 나눈 몫은 " + largenumber/smallnumber  + "이고,"
			+ "나머지는 " + largenumber%smallnumber + "이다.");
	// 두 숫자 중에 0을 입력하면 ? 뒤의 메시지가 나오고 둘다 0이 아니면 
	// : 뒤의 메시지가 나온다
	System.out.println(result); //결과 값 출력	
}
}
