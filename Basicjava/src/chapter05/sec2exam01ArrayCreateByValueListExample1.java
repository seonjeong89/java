package chapter05;

public class sec2exam01ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
		int[] scores = {83, 90, 87}; 
		// scores[0] = 76; 하면 score[0] 값이 바뀜
		
//		System.out.println("scores[0]: " + scores[0]);
//		System.out.println("scores[1]: " + scores[1]);
//		System.out.println("scores[2]: " + scores[2]);
		for(int i = 0; i<scores.length; i++) {
			System.out.println("scores[" + i + "]:" + scores[i]);
		}
		
		int sum = 0;
			for(int i = 0; i<scores.length; i++) {
				sum += scores[i];
			}
			System.out.println("총합 : " + sum);
			double avg = (double) sum / scores.length;
			System.out.println("평균 : " + avg);			
	}
}
