<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%

	//세션 초기화
	session.invalidate();

	//리다이렉트
	response.sendRedirect("./login.jsp");

%>