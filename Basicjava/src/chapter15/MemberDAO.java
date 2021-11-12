package chapter15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	public List<MemberVO> memberList() throws Exception {
		List<MemberVO> list = new ArrayList<MemberVO>();
		// 0. 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 1. 드라이버 매니저를 통해 접속
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","KSJ89","java");
		// 2. 작업 공간 만들기
		Statement statement = connection.createStatement();
		// 3. 쿼리 작성 및 실행						
		ResultSet resultSet = statement.executeQuery("SELECT MEM_ID, MEM_NAME, MEM_MAIL FROM MEMBER");
		while (resultSet.next()) {
			String memId = resultSet.getString("mem_id");
			String memName = resultSet.getString("mem_name");
			String memMail = resultSet.getString("mem_mail");
			list.add(new MemberVO(memId, memName, memMail));
		}
		resultSet.close();
		statement.close();
		connection.close();
		System.out.println();
		return list;
	}
	
	public MemberDAO getMember(String searchId) {
		
	}
}
