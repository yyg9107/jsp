package kr.co.java4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectTest {
	public static void main(String[] args) throws Exception {
		//DB ����
		String host = "jdbc:mysql://192.168.0.161:3306/yyg";
		String user = "yyg";
		String pass = "1234";
		
		//1�ܰ� - JDBC ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");
		
		//2�ܰ� - �����ͺ��̽� ����
		Connection conn = DriverManager.getConnection(host,user,pass);
		
		//3�ܰ� - SQL ���ఴü ����
		Statement stmt = conn.createStatement();
		
		//4�ܰ� - SQL ����
		//executeUpdate()- insert, update,delete
		//executeQuery() - select
		ResultSet rs = stmt.executeQuery("select * from `USER`;");
		
		//5�ܰ� - ����� ó��(select�� ���)
		while(rs.next()) {
			String uid = rs.getString(1);
			String name = rs.getString("name");
			int gender = rs.getInt(3);
			String hobby = rs.getString("hobby");
			String addr = rs.getString(5);
			
			System.out.println("====================");
			System.out.println("���̵� : "+uid);
			System.out.println("�̸� : "+name);
			System.out.println("���� : "+gender);
			System.out.println("��� : "+hobby);
			System.out.println("�ּ� : "+addr);
			System.out.println("====================");
		}
		
		//6�ܰ� - �����ͺ��̽� ����
		conn.close();
	}
}
