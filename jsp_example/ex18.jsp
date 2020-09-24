<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	 float myFloat=(float)application.getAttribute("hana");
	java.util.Date date =(java.util.Date) application.getAttribute("tom");
	String myString=(String) application.getAttribute("john");
	%>
	myFloat :
	<%=myFloat%>
	date :
	<%=date.getYear()%> . 	<%=date.getMonth()+1 %> . <%=date.getDate() %>
	myString :
	<%=myString%>
</body>
</html>