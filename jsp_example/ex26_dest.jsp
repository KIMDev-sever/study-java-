<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<% Calendar calendar=(Calendar) request.getAttribute("time"); %>
	<%= calendar.get(Calendar.HOUR) %>시
	<%= calendar.get(Calendar.MINUTE) %>분
		<%= calendar.get(Calendar.SECOND) %>초
</body>
</html>