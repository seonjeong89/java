package terminated;

public class Circle {
	//필드
	private double radius;
	private double x;
	private double y;
	private double area;
	
	//생성자
	
	//메소드	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double radius){
		if(radius > 0) {
			this.radius = radius;
		  return;
		} 
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double getArea() {
		area = Math.PI * radius * radius;
		return area;
	}

	public void setArea() {		 
	}	
}
