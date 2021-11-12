package chapter06;

public class FirstCar{
	String company;
	String model;
	String color;
	int maxSpeed;	
	int speed;	
	public FirstCar() {
	}
	//생성자 주입(injection)
	public FirstCar(String m, String c, int s) {
		model = m;
		color = c;
		speed = s;
		System.out.println(m);
		System.out.println(c);
		System.out.println(s);
	}
}
