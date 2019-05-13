<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<% 
	String result = request.getParameter("result");

%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>login</title>
	<script>
	var result = "<%=result%>";
	if(result=="fail"){
		alert("회원이 아닙니다.");
	}
	</script>
</head>
<body>
	<h3>로그인</h3>
	<form action="./loginproc.jsp">
		<table border = "1">
			<tr>
				<td>아이디</td>	
				<td><input type="text" name = "uid"></td>
			</tr>
			<tr>
				<td>비밀번호</td>	
				<td><input type="password" name = "pass"></td>
			</tr>
			<tr>
				<td colspan="2" align = "right"><input type="submit" value = "로그인"></td>
			</tr>
		</table>
	</form>
	
	
</body>
</html>