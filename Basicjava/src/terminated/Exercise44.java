package terminated;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		/*
		 * 두 사람이 하는 가위 바위 보 게임을 만들어 보자. 두 사람이 입력한 문자열을 비교하여 누가 이겼는지 출력하는 프로그램이다. 문자열을 읽기
		 * 위해서는 Scanner 클래스의 next() 메소드를 이용하면 된다. 또 자바에서 문자열 비교는 주의를 기울여야 한다. String 타입
		 * 변수와 문자열 비교는 == 이 아닌 equals() 메소드로 비교하여야 한다.
		 */
		Scanner scanner = new Scanner(System.in);
		// 데이터 입력 부분
		System.out.println("가위 바위 보 게임");
		System.out.print("철수: ");
		String cheolsuhand = scanner.next();
		System.out.print("영희: ");
		String yeonghuihand = scanner.next();
		String result = "";

		// 데이터 처리 부분
		if (cheolsuhand.equals(yeonghuihand)) {

			result = "무승부";
			// 철수가 이기는 경우를 입력했을 때 문장 출력

		} else if (cheolsuhand.equals("보") && yeonghuihand.equals("가위")
				|| cheolsuhand.equals("가위") && yeonghuihand.equals("바위")
				|| cheolsuhand.equals("바위") && yeonghuihand.equals("보")) {

			result = "영희 승리!";
			// 영희가 이기는 경우를 입력했을 때 문장 출력

		} else {

			result = "철수 승리!";
//	//비기는 경우를 입력했을 때 문장 출력

// } else if(cheolsuhand.equals("보") && 
//			yeonghuihand.equals("보") ||
//			cheolsuhand.equals("가위") &&
//			yeonghuihand.equals("가위") ||
//			cheolsuhand.equals("바위") && 
//			yeonghuihand.equals("바위")){
//	 
//	 System.out.println("결과: 비겼습니다.");
//	//비기는 경우를 입력했을 때 문장 출력
//	 
		}
		System.out.println("결과: " + result);
	}

}
