<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>5-3</title>
</head>
<body>
	<h3>3.application 내장객체</h3>
	<%--어플리케이션 객체는 서버정보를 가지고 있는 객체 --%>
	<p>
		서버 정보 : <%= application.getServerInfo() %> <br>
		서버 규약(메이저) : <%= application.getMajorVersion() %> <br>
		서버 규약(마이너) : <%= application.getMinorVersion() %> <br>	
	</p>	
</body>
</html>