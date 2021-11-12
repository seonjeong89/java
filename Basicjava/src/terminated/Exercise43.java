package terminated;

import java.util.Scanner;

public class Exercise43 {
	public static void main(String[] args) {
		/*
		 * 사용자로부터 5과목의 점수를 입력받아 평균을 구하는 프로그램을 작성하여 보자. 평균 점수로 학점을 계산하여 출력한다. (평균 점수는 소숫점
		 * 둘째자리까지만 출력) 평균 점수가 90점 이상이면 A, 80점 이상 90점 미만이면 B, 70점 이상 80점 미만이면 C, 60점 이상
		 * 70점 미만이면 D, 60점 미만이면 F로 계산한다.
		 */
		Scanner scanner = new Scanner(System.in);
		// 데이터 입력 부분

		System.out.println("점수를 입력하세요");
		System.out.print("프로그래밍 기초: ");
		double score1 = scanner.nextDouble();
		System.out.print("데이터베이스: ");
		double score2 = scanner.nextDouble();
		System.out.print("화면 구현: ");
		double score3 = scanner.nextDouble();
		System.out.print("애플리케이션 구현: ");
		double score4 = scanner.nextDouble();
		System.out.print("머신러닝: ");
		double score5 = scanner.nextDouble();

		// 데이터 처리 부분
		double sum = score1 + score2 + score3 + score4 + score5;
		System.out.println("총점: " + sum);
		double average = sum / 5;
		System.out.printf("평균: %.2f\n ", average);

		if (average >= 90) {
			System.out.println("학점 : A");
			// 평균이 90점 이상이면 A를 출력한다.
			// 조건이 false 일때 else if문을 실행한다.
		} else if (average >= 80) {
			System.out.println("학점 : B");
			// 평균이 80점 이상 90점 미만이면 B를 출력한다.
			// 조건이 false 일때 else if문을 실행한다.
		} else if (average >= 70) {
			System.out.println("학점 : C");
			// 평균이 70점 이상 80점 미만이면 C를 출력한다.
			// 조건이 false 일때 else if문을 실행한다.
		} else if (average >= 60) {
			System.out.println("학점 : D");
			// 평균이 60점 이상 70점 미만이면 D를 출력한다.
			// 조건이 false 일때 else if문을 실행한다.
		} else {
			System.out.println("학점 : F");
			// 평균이 60점 미만이면 F를 출력한다.
		}
	}
}
