package terminated;

import java.util.Scanner;

public class Exercise41 {
public static void main(String[] args) {
	/*
	 * 사용자로부터 세 변의 길이를 입력받은 후, 
	 * 입력받은 변의 길이로 삼각형을 입력 받을 수 있는지 판별하는 프로그램을 만들어 보자. 
	 * 삼각형을 판별하는 방법은 가장 긴 변의 길이가 
	 * 다른 두 변의 길이의 합보다 작으면 삼각형을 만들 수 있다.
	 */
	Scanner scanner = new Scanner(System.in);
	//데이터 입력 부분
	System.out.print("삼각형의 첫번째 변의 길이를 입력하세요: ");
	int leg1 = scanner.nextInt();
	System.out.print("삼각형의 두번째 변의 길이를 입력하세요: ");
	int leg2 = scanner.nextInt();
	System.out.print("삼각형의 세번째 변의 길이를 입력하세요: ");
	int leg3 = scanner.nextInt();
	
	//데이터 처리와 출력 부분
	if(leg1>=(leg2+leg3)) {
		System.out.println("삼각형을 만들 수 없습니다.");
		// 첫번째 변이 가장 길 때, 두번째 변 + 세번째 변 보다 같거나 크면 
		// 삼각형을 만들 수 없다.
		// 그렇지 않으면(false), else if문을 실행한다.
	  } else if(leg2>=(leg1+leg3)){
			System.out.println("삼각형을 만들 수 없습니다.");
	    // 두번째 변이 가장 길 때, 첫번째 변 + 세번째 변 보다 같거나 크면 
	    // 삼각형을 만들 수 없다.
		// 그렇지 않으면(false), else if문을 실행한다.
	  } else if(leg3>=(leg1+leg2)){
			System.out.println("삼각형을 만들 수 없습니다.");
		// 세번째 변이 가장 길 때, 첫번째 변 + 두번째 변 보다 같거나 크면 
		// 삼각형을 만들 수 없다.
		// 그렇지 않으면(false), else문을 실행간다.
	  } else {
			System.out.println("삼각형을 만들 수 있습니다.");
		// 위의 세가지 경우가(false)라면 가장 긴 변이 
		// 다른 두 변의 합보다 작은 것이다.
		// 따라서 이 경우는 삼각형을 만들 수 있다.
		}
	}		
}


