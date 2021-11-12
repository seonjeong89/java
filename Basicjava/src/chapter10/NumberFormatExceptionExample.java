package chapter10;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		try {			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(result);
		} catch (NumberFormatException e) {
			System.err.println("입력된 데이터는 숫자 형식이 아닙니다.");
		} finally {
			System.out.println("실행 결과 출력");			
		}
	}
}