<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>application��ü�� �Ӽ� ����ϱ�</title>
<%
	/*
		GET������� Ű�� ���� �����غ���
		localhost:8080/jsp_examples/ex17.jsp?key=hong&value=1000
	*/
	String key = request.getParameter("key");
	String value = request.getParameter("value");
	out.print("key:" + key + "<br>");
	out.print("value:" + value + "<br>");

	if (key != null && value != null) {
		application.setAttribute(key, value);
	}
	application.setAttribute("hana", 3.14f); //�Ǽ�
	application.setAttribute("tom", new java.util.Date()); //��ü
	application.setAttribute("john","funny"); //���ڿ�
%>
	application��ü �Ӽ� �������� : <%=application.getAttribute("hong") %> <br>
	application��ü �Ӽ� �������� : <%=application.getAttribute("tom") %><br>
	application��ü �Ӽ� �������� : <%=application.getAttribute("john") %><br>
</head>
<body>

</body>
</html>