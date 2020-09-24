<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 페이지 지시어로 인한 HTML상단의 공백을 제거함. --%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>서브스크릿( JSP 코드 영역 )</title>
</head>
<body>
	<!-- 연습문제 -->
	<!-- 자바코드로 1부터 10까지의 합을 출력하시오. -->
	<%
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
	%>
	<%-- 표현식 : <%=로 시작함 --%>
	1부터 10까지의 합은 <%= sum %> 입니다.
</body>
</html>



