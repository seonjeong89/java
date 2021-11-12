package terminated;

import java.util.Scanner;

public class Exercise24 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위:cm):");    // 문장 출력
	double r = scanner.nextDouble();                 // 사용자 값 입력 후 출력 반지름(r)
	System.out.println("원기둥의 높이를 입력하시오.(단위:cm):"); // 문장 출력
	double h = scanner.nextDouble();    // 사용자 값 입력 후 출력 높이(h)
	double m = r*r*Math.PI;             // 원기둥 밑변의 넓이 m 정의
	double v = m*h;                      // 원기둥 부피 v 정의
	
	System.out.println("원기둥 밑변의 넓이는 " + m +"㎠이고, "
			+ "원기둥의 부피는 " + v + "㎤이다." );      // 결과값 출력	
}
}
