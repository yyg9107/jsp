package kr.co.java4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//��¥ : 2019.5.7.
//�̸� : ������
//���� : Insert ���α׷��� �ǽ�
public class InsertTest {
	public static void main(String[] args) throws Exception{
		
		//DB ����
		String host = "jdbc:mysql://192.168.0.161:3306/yyg";
		String user = "yyg";
		String pass = "1234";
		
		//1�ܰ� - JDBC ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");
		
		//2�ܰ� - DB ����
		Connection conn =  DriverManager.getConnection(host,user,pass);
		
		//3�ܰ� - SQL ���ఴü ����
		Statement stmt =  conn.createStatement();
		
		//4�ܰ� - SQL ����
		String sql = "INSERT INTO `USER` VALUES ('anbek','������',1,'���|����|��ȭ','����');";
		stmt.executeUpdate(sql);
		
		//5�ܰ� - ����� ó��(select�� ���)
		
		
		//6�ܰ� - DB ����
		conn.close();
		System.out.println("������ INSERT �Ϸ� . . .");
		
	}
}
