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
	<script type="text/javascript">alert('�α��� ���̵� ��ȣ�� ����')</script>
	<%
		return;
	   }
	   if(id.equals("hong") && pw.equals("1111")){
		   session.setAttribute("id",id);
		   session.setAttribute("pw",pw);
	%>
	<script type="text/javascript">�α��μ���</script>
	<%

	   }else{
		   %>
		   
		  	<script type="text/javascript">�α��ν���</script>
		   <%
	   }
	%>
</body>
</html>