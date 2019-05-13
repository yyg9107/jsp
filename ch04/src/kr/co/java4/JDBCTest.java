package kr.co.java4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//날짜 : 2019.5.7.
//이름 : 윤영근
//내용 : JDBC 프로그래밍 실습
public class JDBCTest {
	public static void main(String[] args) {
		//DB 정보
		String host = "jdbc:mysql://192.168.0.161:3306/yyg";
		String user = "yyg";
		String pass = "1234";
		
		Connection conn = null;
		try {
			
					
			//1단계 - jdbc 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
			
			//2단계 - db 접속
			conn =  DriverManager.getConnection(host,user,pass);
			if(conn != null) {
				System.out.println("데이터베이스 접속 성공");
			}
			//3단계 - sql 쿼리 실행 객체 생성
			//4단계 - sql 실행
			//5단계 - resultset 실행 결과 처리(select문만 해당)
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				//6단계 - db 종료
				conn.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}
}
