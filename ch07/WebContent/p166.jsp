<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Info</title>
</head>
<body>
	include 전 name 파라미터 값 : <%= request.getParameter("name") %>
	<hr>
	<jsp:include page="./p167.jsp" flush="false">
		<jsp:param value="최범균" name="name"/>
	</jsp:include>
	<hr/>
	include 후 name 파라미터 값: <%= request.getParameter("name") %>
</body>
</html>