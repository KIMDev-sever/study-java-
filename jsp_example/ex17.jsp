<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>application객체의 속성 사용하기</title>
<%
	/*
		GET방식으로 키와 값을 전달해보자
		localhost:8080/jsp_examples/ex17.jsp?key=hong&value=1000
	*/
	String key = request.getParameter("key");
	String value = request.getParameter("value");
	out.print("key:" + key + "<br>");
	out.print("value:" + value + "<br>");

	if (key != null && value != null) {
		application.setAttribute(key, value);
	}
	application.setAttribute("hana", 3.14f); //실수
	application.setAttribute("tom", new java.util.Date()); //객체
	application.setAttribute("john","funny"); //문자열
%>
	application객체 속성 가져오기 : <%=application.getAttribute("hong") %> <br>
	application객체 속성 가져오기 : <%=application.getAttribute("tom") %><br>
	application객체 속성 가져오기 : <%=application.getAttribute("john") %><br>
</head>
<body>

</body>
</html>