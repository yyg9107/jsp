<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%!
	public int add(int a, int b){
		int c = a + b;
		return c;
	}
	public int sub(int a, int b){
		int c = a - b;
		return c;
	}
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>스크립트릿에서 선언부 사용하기</title>
</head>
<body>
	<%
		int val1 = 3;
		int val2 = 9; 
		int addRe = add(val1,val2);
		int subRe = sub(val1,val2);
	%>
	<%= val1 %> + <%= val2 %> = <%= addRe %>
	<br/>
	<%= val1 %> - <%= val2 %> = <%= subRe %>
	
</body>
</html>