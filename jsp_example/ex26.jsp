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
	<% Calendar calendar =Calendar.getInstance();
		request.setAttribute("time", calendar);
	%>
	<jsp:forward page="ex26_dest.jsp"></jsp:forward>
</body>
</html>