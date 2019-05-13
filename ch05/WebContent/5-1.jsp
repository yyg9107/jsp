<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>5-1</title>
</head>
<body>
	<h3>1. out 내장객체</h3>
	<%
		out.print("<ul>");
		out.print("<li>서울</li>");
		out.print("<li>대전</li>");
		out.print("<li>대구</li>");
		out.print("<li>부산</li>");
		out.print("<li>광주</li>");
		out.print("</ul>");
	%>
	<%-- name=홍길동&age=17 파라미터 직접 지정 --%>
	<a href="./5-2.jsp?name=홍길동&age=17">5-2이동</a>
</body>
</html>