package terminated;

import java.util.Scanner;

public class Exercise42 {
public static void main(String[] args) {
	/*
	 * 사용자로부터 특정 월을 입력받은 후, 
	 * 입력 받은 월의 계절이 어떤 계절인지 알아내는 
	 * 프로그램을 만들어 보자. 
	 * 3월~5월은 봄, 6월~8월은 여름, 
	 * 9월~11월은 가을, 12월~2월은 겨울을 출력한다.
       실행 결과는 3번 반복되어 있지만 
       1번만 나오도록 작성하시면 됩니다.
	 */
	Scanner scanner = new Scanner(System.in);
	//데이터 입력 부분
	System.out.print("월을 입력하세요(1~12): ");
	int month = scanner.nextInt();
	
	//데이터 처리와 출력 부분
	switch(month) {
	case 3:
	case 4:
	case 5:
		System.out.println(month + "월은 " + "봄입니다.");
		break;
		//3~5를 입력하면 봄을 출력한다.
	case 6:
	case 7:
	case 8:
		System.out.println(month + "월은 " + "여름입니다.");
		break;
		//6~8을 입력하면 여름을 출력한다.
	case 9:
	case 10:
	case 11:
		System.out.println(month + "월은 " + "가을입니다.");
		break;
		//9~11을 입력하면 가을을 출력한다.
	case 12:
	case 1:
	case 2:
		System.out.println(month + "월은 " + "겨울입니다.");	
		break;
		default:
		System.out.println("올바른 숫자를 입력하세요(1~12)");
		//1~12외의 값을 입력하면 겨울을 출력한다.
	}
}
}
