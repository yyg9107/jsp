<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>3-5</title>
</head>
<body>
		<h3>7. 포워딩</h3>
		<h1>3-7.jsp 페이지 입니다.</h1>
		<%
			//response.sendRedirect("./3-1.jsp");
			pageContext.forward("./3-1.jsp");
			//포워딩은 서버 내부에서 바꿔주기 때문에 주소는 바뀌지 않는다
		%>
</body>
</html>