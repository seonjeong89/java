package chapter05;

public class Exercise04 {
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int[] array = {1, 5, 3, 8, 2};
		
		//작성 위치
		for(int score : array) {
			if(max<score) {
				max=score;
			}
			if(min>score) {
				min=score;
			}
		}
//		for (int i = 0; i < array.length; i++) {
//			if (min>array[i]) {
//				min = array[i];
//			}
//			max = max<array[i] ? array[i] : max; 			
//		}
//		for (int i = 0; i < 5; i++) {
//			if (max<array[i]) {
//				max = array[i];			
		System.out.println("max: " + max);
		System.out.println("min: " + min);		
		}				
}