<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import = "java.net.URLEncoder"%>
<%
	String value = "자바";
	String encodedValue = URLEncoder.encode(value,"utf-8");
	response.sendRedirect("./index.jsp?name="+encodedValue);
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	
</body>
</html>