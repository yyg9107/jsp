<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>로그인 ok</title>
</head>
<body>
	<h3>로그인 완료</h3>
	
		<%
			String uid = (String)session.getAttribute("uid"); 
		%>
	<p>
		<%=uid %>님 반갑습니다!<br>
		<a href= "./logout.jsp"> 로그아웃</a>
	</p>
</body>
</html>