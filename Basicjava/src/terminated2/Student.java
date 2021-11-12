package terminated2;

public class Student extends Human {
	//필드
	private String major;  //전공
	
	//생성자
	
	Student(String name, int age, String major){
		super(name,age);
		this.major = major;
	}

	
	
	//메소드
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		return super.toString() + ", 전공: " + major;
	}
}
