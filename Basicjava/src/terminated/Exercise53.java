package terminated;

import java.util.Random;
import java.util.Scanner;

public class Exercise53 {
/*
 * 인공지능 컴퓨터와 게이머(사람)가 가위바위보 게임을 할 수 있도록 프로그램을 작성하시오.
 */
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		String[] aihand = {"가위", "바위", "보"};
		System.out.print("가위 바위 보를 입력하세요 : ");
		String humanhand = scanner.nextLine();
		System.out.println("게이머 : " + humanhand);
		String ai = aihand[random.nextInt(3)];
		System.out.println("인공지능 컴퓨터 : " + ai);
		if(humanhand.equals(ai)) {
			System.out.println("결과 : 무승부!");
		} else if(humanhand.equals("가위") && ai.equals("보")
				|| humanhand.equals("바위") && ai.equals("가위")
				|| humanhand.equals("보") && ai.equals("바위")) {
			System.out.println("결과 : 게이머 승리!");
		} else {
			System.out.println("결과 : 인공지능 컴퓨터 승리!");
		}
	}
}
