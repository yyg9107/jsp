package kr.co.java4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//��¥ : 2019.5.7.
//�̸� : ������
//���� : JDBC ���α׷��� �ǽ�
public class JDBCTest {
	public static void main(String[] args) {
		//DB ����
		String host = "jdbc:mysql://192.168.0.161:3306/yyg";
		String user = "yyg";
		String pass = "1234";
		
		Connection conn = null;
		try {
			
					
			//1�ܰ� - jdbc ����̹� �ε�
			Class.forName("com.mysql.jdbc.Driver");
			
			//2�ܰ� - db ����
			conn =  DriverManager.getConnection(host,user,pass);
			if(conn != null) {
				System.out.println("�����ͺ��̽� ���� ����");
			}
			//3�ܰ� - sql ���� ���� ��ü ����
			//4�ܰ� - sql ����
			//5�ܰ� - resultset ���� ��� ó��(select���� �ش�)
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				//6�ܰ� - db ����
				conn.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}
}
