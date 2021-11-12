package chapter15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

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
//				Class.forName("oracle.jdbc.driver.OracleDriver");
				DriverManager.registerDriver(new OracleDriver());
				Connection connection2 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","KSJ89","java");
				Statement statement2 = connection2.createStatement();
				// StringBuilder vs StringBuffer
				// 문자를 연결할 때 사용
				StringBuilder builder = new StringBuilder();
				builder.append("SELECT ");
				builder.append("    MEM_ID,");
				builder.append("    MEM_NAME,");
				builder.append("    MEM_REGNO1 || '-' || MEM_REGNO2 MEM_REGNO,");
				builder.append("    TO_CHAR(MEM_BIR,'YYYY\"년\" MM\"월\" DD\"일\"') MEM_BIR,");
				builder.append("    MEM_ZIP,");
				builder.append("    MEM_ADD1 || '' || MEM_ADD2 MEM_ADD,");
				builder.append("    MEM_HOMETEL,");
				builder.append("    MEM_COMTEL,");
				builder.append("    MEM_HP,");
				builder.append("    MEM_MAIL,");
				builder.append("    MEM_JOB,");
				builder.append("    MEM_LIKE,");
				builder.append("    MEM_MEMORIAL,");
				builder.append("    TO_CHAR(MEM_MEMORIALDAY,'YYYY\"년\" MM\"월\" DD\"일\"') MEM_MEMORIALDAY,");
				builder.append("    MEM_MILEAGE,");
				builder.append("    MEM_DELETE ");
				builder.append("FROM ");
				builder.append("    MEMBER ");
				builder.append("    WHERE ");
				builder.append("     MEM_ID = '"+searchId+"' ");
				String sql = builder.toString();
				
				ResultSet resultSet2 = statement2.executeQuery(sql);
				if (resultSet2.next()) {
					String memId = resultSet2.getString("MEM_ID");
					String memName = resultSet2.getString("MEM_NAME");
					String memReg = resultSet2.getString("MEM_REGNO");
					String memBir = resultSet2.getString("MEM_BIR");
					String memZip = resultSet2.getString("MEM_ZIP");
					String memAdd = resultSet2.getString("MEM_ADD");
					String memHomeTel = resultSet2.getString("MEM_HOMETEL");
					String memComTel = resultSet2.getString("MEM_COMTEL");
					String memHp = resultSet2.getString("MEM_HP");
					String memMail = resultSet2.getString("MEM_MAIL");
					String memJob = resultSet2.getString("MEM_JOB");
					String memLike = resultSet2.getString("MEM_LIKE");
					String memMemorial = resultSet2.getString("MEM_MEMORIAL");
					String memMemorialday = resultSet2.getString("MEM_MEMORIALDAY");
					String memMileage = resultSet2.getString("MEM_MILEAGE");
					String memDelete = resultSet2.getString("MEM_DELETE");
					System.out.println("아이디 : " + memId);
					System.out.println("이름 : " + memName);
					System.out.println("주민번호 : " + memReg);
					System.out.println("생일 : " + memBir);
					System.out.println("우편번호 : " + memZip);
					System.out.println("주소 : " + memAdd);
					System.out.println("집전화번호 : " + memHomeTel);
					System.out.println("회사전화번호 : " + memComTel);
					System.out.println("핸드폰번호 : " + memHp);
					System.out.println("메일 : " + memMail);
					System.out.println("직업 : " + memJob);
					System.out.println("취미 : " + memLike);
					System.out.println("기념 : " + memMemorial);
					System.out.println("기념일 : " + memMemorialday);
					System.out.println("마일리지 : " + memMileage);
					System.out.println("삭제여부 : " + memDelete);
				} else {
					System.out.println("조회한 아이디의 정보가 없습니다.");
				}
				resultSet2.close();
				statement2.close();
				connection2.close();
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

