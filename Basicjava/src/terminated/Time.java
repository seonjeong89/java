package terminated;

public class Time {
	//필드
	private int hour;
	private int minute;
	private int second;
	
	//생성자
	public Time(){		
	}
	
	public Time(int hour,int minute,int second) {
		if(hour>=0 && hour<=23 ) {
			this.hour = hour;
		} else {
			this.hour = 0;
		  } 
	    if(minute>=0 && minute<=59) {
			this.minute = minute;
		} else {
			this.minute = 0;
		  }
	    if(second>=0 && second<=59) {
			this.second = second;
		} else {
			this.second = 0;}
//		toString();
	}
	
	//메소드    
	public String toString(){
		return String.format("%02d:%02d:%02d",hour,minute,second);
			}
}
