package chapter04;

public class confirm42 {
	/*
	 * for 문을 이용해서 1~100까지 정수 중에서 3의 배수의 총합을 구하는 코드를
	 * 작성해보자 
	 */
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <=100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수의 합: " + sum);
	}
}
