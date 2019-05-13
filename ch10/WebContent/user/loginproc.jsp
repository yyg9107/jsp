<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	//브라우저에 나타낼게 아니므로 html 태그가 필요 없다
	
	
	// 1단계 - 파라미터 수신
	String uid = request.getParameter("uid");
	String pass = request.getParameter("pass");
	
	// 2단계 - 데이터베이스 처리(생략)

	
	//3단계 - 회원일치 여부 확인
	if(uid.equals("abcd") && pass.equals("1234")){
		// 회원이 맞을 경우
		
		//세션에 회원정보 저장
		session.setAttribute("uid", uid);
		session.setAttribute("pass", pass);
		
		//리다이렉트
		response.sendRedirect("./loginok.jsp");
		
	}else{
		// 회원이 아닐 경우
		//result라는 파라미터를 fail로 넘긴다.
		response.sendRedirect("./login.jsp?result=fail");
		
	}
	
%>