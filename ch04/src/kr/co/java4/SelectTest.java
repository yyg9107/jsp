package kr.co.java4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectTest {
	public static void main(String[] args) throws Exception {
		//DB 정보
		String host = "jdbc:mysql://192.168.0.161:3306/yyg";
		String user = "yyg";
		String pass = "1234";
		
		//1단계 - JDBC 드라이버 로드
		Class.forName("com.mysql.jdbc.Driver");
		
		//2단계 - 데이터베이스 접속
		Connection conn = DriverManager.getConnection(host,user,pass);
		
		//3단계 - SQL 실행객체 생성
		Statement stmt = conn.createStatement();
		
		//4단계 - SQL 실행
		//executeUpdate()- insert, update,delete
		//executeQuery() - select
		ResultSet rs = stmt.executeQuery("select * from `USER`;");
		
		//5단계 - 결과셋 처리(select일 경우)
		while(rs.next()) {
			String uid = rs.getString(1);
			String name = rs.getString("name");
			int gender = rs.getInt(3);
			String hobby = rs.getString("hobby");
			String addr = rs.getString(5);
			
			System.out.println("====================");
			System.out.println("아이디 : "+uid);
			System.out.println("이름 : "+name);
			System.out.println("성별 : "+gender);
			System.out.println("취미 : "+hobby);
			System.out.println("주소 : "+addr);
			System.out.println("====================");
		}
		
		//6단계 - 데이터베이스 종료
		conn.close();
	}
}
