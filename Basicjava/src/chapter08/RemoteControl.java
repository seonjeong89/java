package chapter08;

public interface RemoteControl {
		//상수
		int MAX_VOLUME = 10;
		int MIN_VOLUME = 0;
		
		//추상 메소드
		public void turnOn();
		public void turnOff();
		public void setVolume(int volume);	
}
