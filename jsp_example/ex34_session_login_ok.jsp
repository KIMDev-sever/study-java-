<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<% String id= request.getParameter("user_id");
	   String pw= request.getParameter("user_pw");
	   
	   if(id == null || pw ==null){
	%>
	<script type="text/javascript">alert('로그인 아이디나 암호가 없어')</script>
	<%
		return;
	   }
	   if(id.equals("hong") && pw.equals("1111")){
		   session.setAttribute("id",id);
		   session.setAttribute("pw",pw);
	%>
	<script type="text/javascript">로그인성공</script>
	<%

	   }else{
		   %>
		   
		  	<script type="text/javascript">로그인실패</script>
		   <%
	   }
	%>
</body>
</html>