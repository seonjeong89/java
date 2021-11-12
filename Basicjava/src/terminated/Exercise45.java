package terminated;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {
	public static void main(String[] args) {
		/*
		 * 컴퓨터가 1부터 100 사이의 임의의 정수를 생성하면, 그 수를 맞추는 게임을 만들어보자. 사용자가 추측한 수를 입력하면, 컴퓨터가 생성한
		 * 수보다 큰지 작은지를 알려준다. 사용자가 추측한 수가 컴퓨터가 생성한 수와 같을 때까지 반복한다. 1부터 100까지의 랜덤 숫자는 new
		 * Random().nextInt(100) + 1로 구할 수 있다.
		 */
		// 데이터 입력 부분
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		// 1~100까지 임의의 수 선정
		Scanner scanner = new Scanner(System.in);
		
		// 1~100까지 임의의 값 입력

		// 데이터 처리와 출력 부분

		while (true) {
			System.out.print("1부터 100사이의 정수중 하나를 선택하세요: ");
			int inputNumber = scanner.nextInt();
			// randomNumber와 inputNumber가 같지 않으면
			// while 문을 반복한다.
			// randomNumber와 inputNumber가 같으면
			// while 문을 빠져나온다.
			if (randomNumber > inputNumber) {
				System.out.println("정답은 더 큰 수 입니다.");
				
				// randomNumber가 inputNumber보다 크면
				// 문장을 출력하고 다음 inputNumber를 기다린다.
			} else if (randomNumber < inputNumber) {
				System.out.println("정답은 더 작은 수 입니다.");
				
				// randomNumber가 inputNumber보다 작으면
				// 문장을 출력하고 다음 inputNumber를 기다린다.
			} else {
				System.out.println("정답입니다.");
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
		
		// randomNumber와 inputNumber가 같으면
		// 문장을 출력하고 명령을 종료한다.
	}
}
