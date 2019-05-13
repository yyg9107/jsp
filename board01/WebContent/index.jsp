<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	if(true){
	//로그인 화면 forwarding (로그인이 안되어 있을때)
	pageContext.forward("./user/login.jsp"); 
	}else{
	//로그인 했을때
	pageContext.forward("./list.jsp");
	}

%>
