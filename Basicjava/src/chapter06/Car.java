package chapter06;

public class Car {
	//필드
	int gas;
	int speed;
	
	//생성자
	
	//메소드

	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
		
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {			
				System.out.println("달립니다.(gas잔량:" + gas + ", 시속:"
						+ speed + "km/h)");				
				gas -= 1;
				speed +=10;
			} else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ", 시속:"
						+ speed + "km/h)");
				return; //메소드 실행 종료
			}
		}
	}
}
