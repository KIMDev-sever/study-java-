<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>reponse(����) �������̵�-redirection</title>
</head>
<body>
	<h2>3���Ŀ� ���� Ȩ�������� �̵��մϴ�</h2>
	<%
	// Thread.sleep(3000);
	// response.sendRedirect("http://www.google.com");
	
	//GET������� ������ �̵�
	//�ּ��ٿ� ����Ÿ(�ѱ�)�� ���°�� ->url encode/decode���ؾߵ�
	String name = "ȫ�浿";
	String nameEncode = java.net.URLEncoder.encode(name,"utf-8");
	out.print("<br>");
	out.print("name:"+name);
	out.print("<br>");
	out.print("nameEncode:"+nameEncode);
	response.sendRedirect("http://www.google.com/search?q="+nameEncode);
	
%>
</body>
</html>