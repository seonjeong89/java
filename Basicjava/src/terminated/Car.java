package terminated;

public class Car {
	//필드
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200;
	
	//생성자
	Car(){		
	}
	Car(String color){
		this.color = color;
	}
	
	//메소드
	public double getSpeed() {
		if(speed<0){
			speed = 0;
			}
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color; 
	}
	
	public boolean speedUp(double speed){
		if(MAX_SPEED<(this.speed+speed) || (this.speed+speed)<0) {
			return false;
		}
			this.speed += speed;
			return true;
	}
		
	public static double getMaxSpeed() {
		return MAX_SPEED;
	}		
}
