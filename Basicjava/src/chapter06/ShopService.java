package chapter06;

public class ShopService {
	//정적 필드
	private static ShopService abc = new ShopService();
	
	// 생성자
	private ShopService() {}
	
	// 정적 메소드
	static ShopService getInstance() {
		return abc;
	}	
}
