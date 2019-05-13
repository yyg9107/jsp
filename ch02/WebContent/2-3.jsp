<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
	<body>
	<h3>3.반복문</h3>
	<%
	int sum = 0;

	for(int i = 0;i<=10;i++){
		sum+=i;
	}
	%>
	
	<p>1부터 10까지 합 : <%= sum %></p>
	<h4>별삼각형 출력</h4>
	<%
	for(int i=1;i<=10;i++){
		for(int j = 1; j<=i;j++){
			out.print("☆");
		}
		out.print("<br/>");
	}
	
	for(int i=10;i>=0;i--){
		for(int j = 1; j<=i; j++){
			out.print("☆");
		}
		out.print("<br/>");
	}
	%>
	<h4>구구단</h4>
	<table border="1">
	<tr>
		<td>2단</td>
		<td>3단</td>
		<td>4단</td>
		<td>5단</td>
		<td>6단</td>
		<td>7단</td>
		<td>8단</td>
		<td>9단</td>
	</tr>
	<%
	for(int i = 1; i < 10; i++){
		%>
		<tr>
		<%
		for(int j = 2; j < 10; j ++){%>
		<td><%= j %>X<%= i %> = <%= i*j  %></td>
		<%}%></tr>
		<%
	}
	%>
	</table>
	</body>
</html>