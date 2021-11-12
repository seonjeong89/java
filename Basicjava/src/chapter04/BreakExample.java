package chapter04;

import java.util.Random;

public class BreakExample {
public static void main(String[] args) {
	/*
	 * 주사위를 던져서 6이 나오면 반복문을 종료 
	 */
		Random random = new Random();
		/* 브레이크 문
		while(true) {
			int dice = random.nextInt(6)+1;
			System.out.println(dice);
			if (dice == 6) {
				//반복문 종료
				break;
			}
		}
		*/
		while(true) {
			int dice = random.nextInt(6)+1;
			
			if (dice % 2 == 1) {
				//반복문 계속 (밑의 명령문은 무시한다)
				continue;
			}
			System.out.println(dice);
			if (dice == 6) {
				//반복문 종료
				break;
		
			}
		}
		
//		int diceValue = 0;
//		while (diceValue < 6) {
//			diceValue = random.nextInt(6)+1;
//			System.out.println(diceValue);
//		}
		
		
	}
	
		}
