<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>주석문과 JSP 예약어</title>
	<!-- 단축키 : CTRL + SHIFT + / -->
	<!-- 주석 2가지 방법 -->
	<!-- 첫번째 주석방법 -->
	<%-- 두번째 주석방법--%>
	
	<%-- <%@ 페이지 지시어(디렉티브) %> --%>
	<%-- <%= 출력문 %> --%>
	<%-- <%! 변수선언,함수 선언 %> --%>
	<%-- <% JSP(자바) 코드 영역 - 스크립트릿 %> --%>
</head>
<body>
	<%
		//순수 자바 코드가 들어감.
		String title = "JSP 프로그래밍을 ";
		String message = "시작합니다.";
		System.out.println(message);
	%>
	<b><%= title %></b> <%= message %>
</body>
</html>



