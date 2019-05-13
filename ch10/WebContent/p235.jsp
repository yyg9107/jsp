<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="true" %>
<%
	Date time = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
%>
<html>
<head>
	<title>세션정보</title>
</head>
<body>
세션ID:<%=session.getId() %> <br>
<%
	time.setTime(session.getCreationTime());
%>
세션 생성 시간 : <%=formatter.format(time) %> <br>
<%
	time.setTime(session.getLastAccessedTime());
%>
최근 접근 시간 : <%=formatter.format(time) %>
</body>
</html>