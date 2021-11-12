package chapter06;

public class FirstCarExample {
	public static void main(String[] args) {
		FirstCar car = new FirstCar();
		System.out.println(car.model);
		System.out.println(car.speed);
		car.model = "소나타";
		System.out.println(car.model);
		FirstCar car2 = new FirstCar();
		System.out.println(car2.model);
		
		new FirstCar("아반떼", "silver", 50);				
	}
}
