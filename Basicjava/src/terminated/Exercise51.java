package terminated;

public class Exercise51 {
	/*
	 * 		다음 배열에서 최댓값과 최솟값을 구하시오.
		{38, 94, 16, 3, 76, 94, 82, 47, 59, 8}
	 */
	public static void main(String[] args) {
		// 데이터 입력 부분
		int[] array = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		// 데이터 처리 부분
			for(int score : array) {
				if (score>max) {
					max = score; 
				} else if(score<min) {
					min = score;				
				  }			
			}
			//데이터 출력 부분
		System.out.println("최댓값: " + max);
		System.out.println("최소값: " + min);
	}
}
