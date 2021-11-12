package terminated;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise101 {
	public static void main(String[] args) {	
		while(true){
			try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("어떤 수로 나누시겠습니까?>> ");
			int num1 = scanner.nextInt();
			System.out.print("어떤 수를 나누시겠습니까?>> ");
			int num2 = scanner.nextInt();
			System.out.println(num1 + "/" + num2 + " = " + num1/num2);
		} 
		  catch (InputMismatchException e) {
			System.out.println( "잘못된 입력입니다. 다시 입력해주세요");
			continue;
		  }
		  catch (ArithmeticException e) {
				System.out.println( "0으로 나눌 수 없습니다. 다시 입력해주세요");
			continue;	
		  }	
			break;
		}
	}
}