package terminated1;

public class NewCar {
		//필드
		private double speed;
		private String color;
		private static double MAX_SPEED = killoToMile(200);
		
		//생성자
		NewCar(){		
		}
				
		NewCar(String color){
			this.color = color;
		}
		
		//메소드
		public double getSpeed() {
			if(speed<0){
				speed = 0;
				}
			return mileToKillo(speed);
		}
		public void setSpeed(double speed) {
			this.speed = killoToMile(speed);
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color; 
		}
		
		public boolean speedUp(double speed){
			speed = killoToMile(speed);
			if(MAX_SPEED>=(this.speed+speed) && (this.speed+speed)>0) {
				this.speed += speed;
				return true;				
			}
			return false;
		}
			
		public static double getMaxSpeed() {
			return mileToKillo(MAX_SPEED);
		}		
		
		private static double killoToMile(double distance) {
			return distance/1.6;
		}
		
		private static double mileToKillo(double distance) {
			return distance*1.6;
		}
}