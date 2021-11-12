package chapter05;

import java.util.Arrays;

public class MultiDimensionArrayExample {
	public static void main(String[] args) {
		int[][] score = {{80,90,100},{87,97,57},{4,56,78}};
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(Arrays.toString(score[i]));
		}
		System.out.println();
		// 향상된 for문(forreach문) jdk 1.5 부터 나옴.
		for (int[] is : score) {
			System.out.println(Arrays.toString(is));
		}
	}
}
