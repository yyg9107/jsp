<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<% 
	
	//수정 데이터 수신
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
	Connection conn = null;
	Statement stmt = null;
	String sql =null;
	try{
		//1단계
		
		Class.forName("com.mysql.jdbc.Driver");
		//2단계
		conn = DriverManager.getConnection(HOST,USER,PASS);
		//3단계
		stmt = conn.createStatement();
		//4단계
		sql = "UPDATE `MEMBER` SET ";
		sql += "`name` = '"+name+"',";
		sql += "`hp` = '"+hp+"',";
		sql += "`pos` = '"+pos+"',";
		sql += "`dep` = '"+dep+"' ";
		sql += "WHERE `uid` = '"+uid+"';";
				
		stmt.executeUpdate(sql);
	//5단계
	}catch(Exception e){
		e.printStackTrace();
	}finally{
	//6단계
		stmt.close();
		conn.close();
	}
	//수정 완료 후 목록으로 이동
	response.sendRedirect("14-3.jsp");
%>