package terminated;

import java.util.Scanner;

public class Exercise25 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("500원 짜리 동전의 갯수: ");    // 문장 출력
	int o = scanner.nextInt();          // 사용자 값 입력 후 저장 500원(o)
	System.out.print("100원 짜리 동전의 갯수: ");    // 문장 출력
	int b = scanner.nextInt();          // 사용자 값 입력 후 저장 100원(b)
	System.out.print("50원 짜리 동전의 갯수: ");    // 문장 출력
	int s = scanner.nextInt();          // 사용자 값 입력 후 저장 50원(s)
	System.out.print("10원 짜리 동전의 갯수: ");    // 문장 출력
	int w = scanner.nextInt();          // 사용자 값 입력 후 저장 10원(w)
	
	int sum = (o*500)+(b*100)+(s*50)+(w*10);              // 총액 합 sum 정의
	
	
	//System.out.println("저금통 안의 동전의 총 액수: " + sum);      // 결과값 출력
	//System.out.printf("저금통 안의 동전의 총 액수: %,d",sum);
	String format = String.format("저금통 안의 동전의 총 액수: %,d",sum);
	System.out.println(format);
}
}