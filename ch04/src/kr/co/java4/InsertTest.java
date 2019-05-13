package kr.co.java4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//날짜 : 2019.5.7.
//이름 : 윤영근
//내용 : Insert 프로그래밍 실습
public class InsertTest {
	public static void main(String[] args) throws Exception{
		
		//DB 정보
		String host = "jdbc:mysql://192.168.0.161:3306/yyg";
		String user = "yyg";
		String pass = "1234";
		
		//1단계 - JDBC 드라이버 로드
		Class.forName("com.mysql.jdbc.Driver");
		
		//2단계 - DB 접속
		Connection conn =  DriverManager.getConnection(host,user,pass);
		
		//3단계 - SQL 실행객체 생성
		Statement stmt =  conn.createStatement();
		
		//4단계 - SQL 실행
		String sql = "INSERT INTO `USER` VALUES ('anbek','김춘추',1,'등산|독서|영화','경주');";
		stmt.executeUpdate(sql);
		
		//5단계 - 결과셋 처리(select일 경우)
		
		
		//6단계 - DB 종료
		conn.close();
		System.out.println("데이터 INSERT 완료 . . .");
		
	}
}
