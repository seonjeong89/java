package terminated;

import java.util.Scanner;

public class Exercise21 {
public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in); 
		System.out.print("가로의 길이는?(단위:m)");    // 문장 출력
		double width = scanner.nextDouble();     // 사용자 값 입력 후 출력 가로(width)
		System.out.print("세로의 길이는?(단위:m)"); // 문장 출력
		double height = scanner.nextDouble();    // 사용자 값 입력 후 출력 세로(height)
		double area = width*height;              // 넓이 area 정의
		double perimeter = ((width+height)*2);   // 둘레 perimeter 정의
		
		System.out.println("직사각형의 넓이: " + area);      // 넓이 area 출력
		System.out.println("직사각형의 둘레: " + perimeter); // 둘레 perimeter 출력
	scanner.close();
}
}