package chapter05;

import java.util.Scanner;

public class Exercise06 {
	/*
	 * 키보드로 학생 수와 각 학생들의 점수를 입력받아서 최고 점수 및 평균 점수를 구하는
	 * 프로그램을 만들어보자. 
	 */
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				//작성 위치
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			} else if(selectNo == 2) {
				//작성 위치
				for (int i = 0; i < scores.length; i++) {				
					System.out.print("scores["+i+"]> ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}				
			} else if(selectNo == 3) {
				//작성 위치
				for (int i = 0; i < scores.length; i++) {				
					System.out.println("scores["+i+"]>" + scores[i]);	
				}
			} else if(selectNo == 4) {
				//작성 위치
				int max = 0;
				int sum = 0;
				for(int score : scores) {
					sum += score;
					if(max<score) {
						max=score;
					}
				}
//				for (int i = 0; i < scores.length; i++) {
//					if (max<scores[i]) {
//						max = scores[i];					
				double avg = (double) sum / studentNum;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);											
			} else if(selectNo == 5) {
				run = false;
			}	
		}
		System.out.println("프로그램 종료");
	}
}