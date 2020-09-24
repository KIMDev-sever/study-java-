<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>reponse(응답) 페이지이동-redirection</title>
</head>
<body>
	<h2>3초후에 다음 홈페이지로 이동합니다</h2>
	<%
	// Thread.sleep(3000);
	// response.sendRedirect("http://www.google.com");
	
	//GET방식으로 페이지 이동
	//주소줄에 데이타(한글)가 들어가는경우 ->url encode/decode를해야됨
	String name = "홍길동";
	String nameEncode = java.net.URLEncoder.encode(name,"utf-8");
	out.print("<br>");
	out.print("name:"+name);
	out.print("<br>");
	out.print("nameEncode:"+nameEncode);
	response.sendRedirect("http://www.google.com/search?q="+nameEncode);
	
%>
</body>
</html>