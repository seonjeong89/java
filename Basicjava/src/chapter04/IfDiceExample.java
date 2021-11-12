package chapter04;

import java.util.Random;

public class IfDiceExample {
public static void main(String[] args) {
	Random random = new Random();
	
	int randomNum = random.nextInt(6)+1;
	
	if(randomNum==1) {
		System.out.println("1번이 나왔습니다.");
	} else if(randomNum==2){
		System.out.println("2번이 나왔습니다.");
	}else if(randomNum==3){
		System.out.println("3번이 나왔습니다.");
	}else if(randomNum==4){
		System.out.println("4번이 나왔습니다.");
	}else if(randomNum==5){
		System.out.println("5번이 나왔습니다.");
	}else if(randomNum==6){
		System.out.println("6번이 나왔습니다.");
	}
}
}