package terminated;

import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) {
		/*
		 * 키보드로 학생 수와 각 학생들의 점수를 입력받아서 최고 점수 및 평균 점수를 구하는
		 * 프로그램을 만들어보자. 
		 */
		boolean run = true;
		int studentnum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> " );
			
			int num = Integer.parseInt(scanner.nextLine());
			
			switch (num) {
			case 1:
				System.out.print("학생수> ");
				studentnum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentnum];
				break;
				
			case 2:
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores["+i+"]> ");
				scores[i] = Integer.parseInt(scanner.nextLine());}
				break;
				
			case 3:
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores["+i+"]> " + scores[i]);
				}
				break;
				
			case 4:
				int sum = 0;
				int max = 0;
				for (int i = 0; i < scores.length; i++) {
					if(max<scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
				}
				double avg = (double) sum/studentnum;
				System.out.println("최고 점수 " + max);
				System.out.println("평균 점수 " + avg);
				break;
				
			case 5:
				run = false;
				break;			
			}
			
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
