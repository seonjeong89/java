package chapter15;

import java.util.List;
import java.util.Scanner;

public class ShoppingMain {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		menu : while (true) {
			System.out.println("========================================================================");
			System.out.println("0. 프로그램 종료 | 1. 회원목록 | 2. 회원상세 | 3. 회원등록 | 4. 회원수정 | 5. 회원삭제");
			System.out.println("========================================================================");
			System.out.print("메뉴를 선택하세요> ");
			int menu = Integer.parseInt(scanner.nextLine());
			switch (menu) {
			case 1:
				MemberDAO dao = new MemberDAO();
				List<MemberVO> list = dao.memberList();
				for (MemberVO vo : list) {
					System.out.printf("%s\t%s\t%s\n", vo.getMemId(), vo.getMemName(), vo.getMemMail());					
				}
				System.out.println();
				break;
			case 2:
				System.out.println();
				System.out.print("조회할 아이디를 입력하세요> ");
				String searchId = scanner.nextLine();
				System.out.println();
				MemberDAO dao1 = new MemberDAO();
				List<MemberVO> list1 = (List<MemberVO>) dao1.getMember(searchId);
				for (MemberVO vo : list1) {
					System.out.println("아이디 : " + vo.getMemId());
					System.out.println("이름 : " + vo.getMemName());
					System.out.println("주민번호 : " + vo.getMemReg());
					System.out.println("생일 : " + vo.getMemBir());
					System.out.println("우편번호 : " + vo.getMemZip());
					System.out.println("주소 : " + vo.getMemAdd());
					System.out.println("집전화번호 : " + vo.getMemHomeTel());
					System.out.println("회사전화번호 : " + vo.getMemComTel());
					System.out.println("핸드폰번호 : " + vo.getMemHp());
					System.out.println("메일 : " + vo.getMemMail());
					System.out.println("직업 : " + vo.getMemJob());
					System.out.println("취미 : " + vo.getMemLike());
					System.out.println("기념 : " + vo.getMemMemorial());
					System.out.println("기념일 : " + vo.getMemMemorialday());
					System.out.println("마일리지 : " + vo.getMemMileage());
					System.out.println("삭제여부 : " + vo.getMemDelete());
				}
				System.out.println();
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 0:
				System.out.println();
				System.out.println("이용해주셔서 감사합니다.");
				scanner.close();
//				System.exit(0);
				break menu;
			}
		}
	}		
}

