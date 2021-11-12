package terminated3;

public class Triangle extends Shape {
	//필드
		private double side;
		
		//생성자
		public Triangle(double side) {
			this.side = side;
		}
		
		//메소드
		@Override
		public double area() {
			return Math.sqrt(3)/4*side*side;
		}

		@Override
		public double perimeter() {
			return side*3;
		}
		
		public String toString() {
			return String.format("도형의 종류: 삼각형, 둘레: %.2f㎝, 넓이: %.2f㎠",perimeter(),area());
		}
}