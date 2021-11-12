package chapter09;

public class SoundableExample {
	public static void main(String[] args) {
//		System.out.println(printSound(new Soundable() {
//			public String sound() {
//				return "멍멍";
//			}
//		}));
		System.out.println(printSound(() -> "멍멍")); //람다 함수
	}
	
	private static String printSound(Soundable s) {
		return s.sound();
	}
}