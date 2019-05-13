<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String uid = request.getParameter("uid");

	//데이터베이스 정보
	final String HOST = "jdbc:mysql://192.168.0.161:3306/yyg";
	final String USER = "yyg";
	final String PASS = "1234";
	Connection conn = null;
	PreparedStatement psmt=null;
	try{
		//1단계
		Class.forName("com.mysql.jdbc.Driver");
		//2단계
		conn = DriverManager.getConnection(HOST,USER,PASS);
		//3단계
		psmt = conn.prepareStatement("DELETE FROM `MEMBER` WHERE `uid`=?;");
		psmt.setString(1, uid);
		//4단계
		psmt.executeUpdate();
	
		//5단계
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		//6단계
		psmt.close();
		conn.close();
	}
	
	//삭제후 다시 목록으로 이동
	response.sendRedirect("14-3.jsp");
%>