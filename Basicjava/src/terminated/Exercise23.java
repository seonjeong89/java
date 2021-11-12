package terminated;

import java.util.Scanner;

public class Exercise23 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("첫번째 수를 입력하세요");     // 첫번째 수 입력하라는 문장 출력
	int inputdata1 = scanner.nextInt();        // 첫번째 수 입력 후 inputdata1로 저장
	System.out.print("두번째 수를 입력하세요");     // 두번째 수 입력하라는 문장 출력
	int inputdata2 = scanner.nextInt();        // 두번째 수 입력 후 inputdata2로 저장
	
	//boolean result = inputdata1>inputdata2;    // boolean으로 참, 거짓 비교

	System.out.println("첫번째 수가 두번째 수보다 큰가? " + (inputdata1>inputdata2));  // 결과 값 출력
}
}

