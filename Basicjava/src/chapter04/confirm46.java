package chapter04;

public class confirm46 {
	/*
	 * for 문을 이용해서 다음과 같이 *를 출력해보자. * ** *** ****
	 */
	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			for (int j = 4; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
