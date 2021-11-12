package chapter11;

public class SystemTimeExample {
	public static void main(String[] args) {
		long[] array;
		array = new long[10]; 
		int sum = 0;
		long arysum = 0;
		long avg = 0;
		for (int j = 0; j < 10; j++) {
			long time1 = System.nanoTime();
			
			int sum1 = 0;
			for (int i = 0; i <= 1000000; i++) {
				sum1 += i;
			}

			long time2 = System.nanoTime();
			array[j] = (time2-time1);
			
			System.out.println("계산에 " + (time2-time1) + " 나노초가 소요되었습니다.");
			
			sum = sum1;
			sum1 = 0;
		}
		for (int i = 0; i < array.length; i++) {
			arysum += array[i];
		}
		avg = arysum/array.length;
		System.out.println("");
		System.out.println("1~1000000까지의 합: " + sum);
		System.out.println("계산에 걸린 시간 평균: " + avg + "나노초");		
	}
}
