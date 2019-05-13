<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%--
	<jsp:forward> 액션 태그를 실행하면
	생성했던 출력결과는 모두 제거 된다.
 --%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>p170_from.jsp의 제목</title>
</head>
<body>
	이 페이지는 p170_from.jsp가 생성한 것입니다.
	<jsp:forward page="./p179_to.jsp"/>
</body>
</html>