package chapter04;

public class confirm45 {
	/*
	 * for 문을 이용해서 다음과 같이 *를 출력해보자.
	 *  *
	 *  **
	 *  ***
	 *  ****
	 */
	public static void main(String[] args) {
		int a = 1;
		while(a<5) {
		  int b = 1;
		  a++;
			while(b<a) {
			System.out.print("*");
			b++;
			  if(b==a){
				  System.out.println();
			  }
			}			
		}
	}
//	for (int i = 1; i<5; i++) {
//		for (int j = 1; j<=i; j++) {
//			System.out.print("*");
//			if(j==i) {
//				System.out.println();
//			}
//		}
//	}
}

