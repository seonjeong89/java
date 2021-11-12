package terminated;

public class Exercise46 {
	public static void main(String[] args) {
	 /*
	  * 1. 1부터 100까지의 합을 구할 때, 
	  * 합이 1000이 넘을 때의 숫자를 알아내는 프로그램
	  * 숫자는 45 
	  */
		int i;
		int sum = 0;
		for(i=1; i<=100; i++) {
			sum += i;
			if(sum>1000) {
				System.out.println(sum);
				System.out.println(i);
				break;
			}
		}		
	}
}
