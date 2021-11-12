package chapter07;

public class Computer extends Calculator2 {
	public double areaCircle(double radius) {
		System.out.println("이 메소드는 Computer의 객체의 메소드를 호출함");
		return super.areaCircle(radius);
	}
	
	//원의 둘레의 길이
	public double perimeterCircle(double radius) {
		return 2 * Math.PI * radius;
		}
}
