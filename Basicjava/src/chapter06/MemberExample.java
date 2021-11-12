package chapter06;

public class MemberExample {
	public static void main(String[] args) {
		Member member = new Member();
		System.out.println(member.name);
		System.out.println(member.age);				
		member.name = "최하얀"; //name 필드값 변경
		member.age = 23;	  //age 필드값 변경
		System.out.println(member.name);
		System.out.println(member.age);		
	}
}
