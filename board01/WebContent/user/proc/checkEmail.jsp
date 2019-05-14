<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	
	String email = request.getParameter("email");
	   final String HOST = "jdbc:mysql://192.168.0.161:3306/yyg";
	   final String USER = "yyg";
	   final String PASS = "1234";
	
	//1단계
	Class.forName("com.mysql.jdbc.Driver");
	
	//2단계
	Connection conn = DriverManager.getConnection(HOST,USER,PASS);
	
	//3단계
	Statement stmt = conn.createStatement();
	
	//4단계
	ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM `JSP_USER` WHERE email='"+email+"';");
	
	//5단계
	int count = 0;
	if(rs.next()){
		count = rs.getInt(1);
	}
	
	//6단계
	rs.close();
	stmt.close();
	conn.close();
	
	//JSON 데이터 생성 및 전송
	//String json = "{'result' : 1}";
	//라이브러리로 사용
	JSONObject json = new JSONObject();
	json.put("result",count);

	out.print(json);
	
%>