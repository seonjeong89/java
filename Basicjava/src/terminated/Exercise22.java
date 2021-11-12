package terminated;

import java.util.Scanner;

public class Exercise22 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    System.out.println("행성의 이름은?");          // 행성이름 입력
    String starname = scanner.nextLine();      // 입력 때까지 대기 후 stername으로 저장
    System.out.println("행성과 지구와의 거리는?");    // 행성과 지구와의 거리 입력(km)
    double distance = scanner.nextDouble();     // 대기 후 distance로 저장
    double v = 9.4608e12;                       // 빛이 1년동안 가는 거리(광년)
    
    System.out.println("빛의 속도로 " + starname + " 별까지 가는데 걸리는 시간은 " 
                        + (distance/v) + "광년 이다.");  // 결과값 출력
}
}