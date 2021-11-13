package chapter15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.driver.OracleDriver;

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
	
	public List<MemberVO> getMember(String searchId) throws Exception {
		List<MemberVO> list1 = new ArrayList<MemberVO>();
//		Class.forName("oracle.jdbc.driver.OracleDriver");
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
		builder.append("    MEM_ADD1 || ' ' || MEM_ADD2 MEM_ADD,");
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
			list1.add(new MemberVO(memId, memName, memReg, memBir, memZip, memAdd, 
					memHomeTel, memComTel, memHp, memMail, memJob, memLike,
					memMemorial, memMemorialday, memMileage, memDelete));
		} else {
			System.out.println("조회한 아이디의 정보가 없습니다.");
		}
		resultSet2.close();
		statement2.close();
		connection2.close();		
		return list1;		
	}
}