package chapter06;

public class sec3exam03CarExample {
	public static void main(String[] args) {
		sec3exam03Car car1 = new sec3exam03Car();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		sec3exam03Car car2 = new sec3exam03Car("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		sec3exam03Car car3 = new sec3exam03Car("자가용", "빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		sec3exam03Car car4 = new sec3exam03Car("택시", "검정", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxspeed : " + car4.maxspeed);
		System.out.println();
	}
}
