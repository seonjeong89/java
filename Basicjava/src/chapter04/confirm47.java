package chapter04;

import java.util.Scanner;

public class confirm47 {
	/*
	 * while 문과 Scanner를 이용해서 키보드로 입력된 데이터로 예금, 출금, 조회, 종료
	 * 기능을 제공하는 코드를 작성해보자.
	 */
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------");
			System.out.print("선택> ");
			
			int menuNum = Integer.parseInt(scanner.next());
			
			switch (menuNum) {
			case 1:
				System.out.print("예금액> ");
				balance += Integer.parseInt(scanner.next());
				break;
			case 2:
				System.out.print("출금액> ");
				int amount = scanner.nextInt();
				if (balance>=amount) {
					balance -= amount;
				} else {
					System.out.print("잔액이 부족합니다");
				}
				break;
			case 3:
				System.out.print("잔고> ");
				System.out.println(balance); 
				break;
			case 4:
				run = false;
				break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}
}
