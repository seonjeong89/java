package chapter06;

public class sec3exam03Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxspeed;
	
	//생성자
	sec3exam03Car(){		
	}
	
	sec3exam03Car(String model){
		this.model = model;
	}
	
	sec3exam03Car(String model, String color){
		this.model = model;
		this.color = color;		
	}
	
	sec3exam03Car(String model, String color, int maxspeed){
		this.model = model;
		this.color = color;		
		this.maxspeed = maxspeed;		
	}	
}
