<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>application 객체를 이용한 서버 정보 가져오기</title>
</head>
<body>
	서버정보:<%= application.getServerInfo() %><br>
	서블릿 메이저 버전:<%= application.getMajorVersion() %><br>
	서블릿 마이너 버전:<%= application.getMinorVersion() %>
	<!-- 서블릿:Servlet (Server+Applet(작은프로그램)) -->
	<!-- 유저의 요청에 응답하는 서버의 작은모듈(프로그램)단위 -->
	<!-- jsp를 이용한 클라이언트의 요청을 처리하는 servlet클래스 -->
	<!-- 구현한 자바프로그램 -->
	<!-- 로그(기록 남기기) -->
	<%
		application.log("로그메세지 기록");
	%>
</body>
</html>