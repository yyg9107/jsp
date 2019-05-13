<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String code = request.getParameter("code");
	String viewPageURI = null;
	code = "A";
	if(code.equals("A")){
		viewPageURI = "/p185_a.jsp";
	}else if(code.equals("B")){
		viewPageURI = "/p185_b.jsp";
	}else if(code.equals("C")){
		viewPageURI = "/p185_c.jsp";
	}
%>

<jsp:forward page="<%= viewPageURI %>"/>