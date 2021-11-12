package terminated;

import java.util.Random;

public class Exercise52 {
	/*
	 * 로또번호를 생성하는 프로그램을 작성하시오.
	 * (로또 번호는 1 ~ 45번까지 있으며 이 중에서 
	 * 중복되지 않는 6개의 숫자를 추출하여 결과를 
	 * 출력한다.) 
	 */
	public static void main(String[] args) {
		//데이터 선언 부분
		Random random = new Random();		
		int[] numbers = new int[45];
		System.out.println("이번주 로또 번호는?");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i+1;
		}
		for (int i = 0; i < numbers.length; i++) {			
			int temp = numbers[i];
			int ranNum = random.nextInt(45);
			numbers[ranNum] = temp;
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(numbers[i] + " ");		
		}
		
//		Random random = new Random();
//		int[] lotto = new int[6];
//		System.out.println("이번주 로또 번호는?");
//				
//			for(int i = 0; i < lotto.length; i++){
//				   lotto[i] = random.nextInt(45)+1;
//				 for(int j = 0; j < i; j++){
//				   if(lotto[i] == lotto[j]){
//						  i--;
//				   }
//				 }		    				  
//			}		
//			  for(int number : lotto) {
//			  System.out.print(number + " ");  
//			  }
	}
}
