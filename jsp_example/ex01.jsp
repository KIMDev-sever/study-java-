<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!-- JSP 페이지 지시어(Page Directive) -->
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>현재시간</title>
</head>
<body>
	<!-- JSP : Java Server Page의 약자 : 썬마이크로시스템즈->오라클  -->
	<!-- 3대 서버 스크립트 -->
	<!-- ASP : 마이크로소프트(윈도우즈 서버만) -->
	<!-- PHP : 1995년 라스무스 러도프 github에 소스 공개 -->
	<!-- 서버 스크립트 : 용도 - 80% DB데이타핸들링, Request응답, 페이지이동, 세션유지 -->
	
	<!-- JSP실행방법 -->
	<!-- 프로젝트이름 오른쪽클릭 후 Run as > Run on server -->
    <!-- http://localhost:8080/jsp_examples/ex01.jsp -->	
    <!-- 실행환경 : 외장 웹브라우저(크롬) 환경설정->WEB -->

	<%-- JSP 출력문 --%>
	현재시간: <%= new java.util.Date() %>
</body>
</html>