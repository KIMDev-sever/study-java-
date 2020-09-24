<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="users" scope="request" class="jsp_examples.Users"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- 자바 (bean)
	자바클래스를 new로 객체 (인스턴스)로 만든것
	id : 자바빈(객체) 이름
      scope : 자바빈 객체를 저장할 영역(생존 범위)
            : page(기본값), request, session, application
      class : 패키지이름을 포함한 자바빈 클래스 이름
 -->
 
	<%
		users.setUser_id("hong");
		users.setUser_pw("1234");
	%>
	
	<%= users.getUser_id() %>
	<%= users.getUser_pw() %>
</body>
</html>