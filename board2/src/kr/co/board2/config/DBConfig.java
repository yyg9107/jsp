package kr.co.board2.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConfig {
	
	private static String host = "jdbc:mysql://192.168.0.161:3306/yyg";
	private static String user = "yyg";
	private static String pass = "1234";
	
	
	public static Connection getConnection() throws Exception { // static ����� new �������ϰ� ����Ҽ� �ִ�. 
		
		// 1�ܰ� - JDBC ����̺�
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2�ܰ� - �����ͺ��̽�����
		Connection conn = DriverManager.getConnection(host,user,pass);
		
		return conn;
		
	}
}

// ����� �κ��� �̷��� Ŭ������ , �޼��带 �����Ͽ� �����ϸ� ���ϴ�
// �߰������� static�� �����ϸ� new ��ü�� �������� �ʾƵ� 
// �� �� �����Ƿ� ���ϴ�.

// Ư���� host�� id, pass ���� 1�� �ٲ�� ������ �������� 
// ���ƴٴϸ� �����ؾ��ϴ� �̷��� ��Ƽ� �����ϸ� ���ϴ�.
