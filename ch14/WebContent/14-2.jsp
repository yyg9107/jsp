<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String uid 	= request.getParameter("uid");
	String name = request.getParameter("name");
	String hp 	= request.getParameter("hp");
	String pos	= request.getParameter("pos");
	String dep	= request.getParameter("dep");
	
	//데이터베이스 정보
	final String HOST = "jdbc:mysql://192.168.0.161:3306/yyg";
	final String USER = "yyg";
	final String PASS = "1234";
	
	Connection conn=null;
	PreparedStatement psmt=null;
	
	try{
		//1단계 - JDBC드라이버 로드
		Class.forName("com.mysql.jdbc.Driver");
		
		//2단계-db접속
		conn = DriverManager.getConnection(HOST,USER,PASS);
		
		//3단계 - SQL 실행객체 생성 및 데이터 맵핑
		psmt = conn.prepareStatement("INSERT INTO `MEMBER` SET uid=?, name=?, hp=?, pos=?, dep=?, rdate=NOW();");
		psmt.setString(1, uid);
		psmt.setString(2, name);
		psmt.setString(3, hp);
		psmt.setString(4, pos);
		psmt.setInt(5, Integer.parseInt(dep));
		
		//4단계 - sql 실행
		psmt.executeUpdate();
		
		//5단계 -결과셋처리(select일 경우)
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		//6단계
		psmt.close();
		conn.close();
	}
	response.sendRedirect("14-3.jsp");
%>