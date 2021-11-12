package chapter04;

import java.util.Random;

public class random {
public static void main(String[] args) {
	//pseudo Random
	//Random random = new Random(88);
	Random random1 = new Random();
	//괄호 안의 숫자만큼 랜덤 범위 결정
	//int randomNumber = random.nextInt(6)+1; //0부터 5까지
	//random.nextInt(100); // 0부터 99까지
	System.out.println(random1.nextInt(6)+1);
	System.out.println(random1.nextInt(6)+1);
	System.out.println(random1.nextInt(6)+1);
	System.out.println(random1.nextInt(6)+1);
	System.out.println(random1.nextInt(6)+1);
	System.out.println(random1.nextInt(6)+1);
	System.out.println(random1.nextInt(6)+1);
	System.out.println(random1.nextInt(6)+1);
	System.out.println(random1.nextInt(6)+1);
	System.out.println(random1.nextInt(6)+1);
}
}
