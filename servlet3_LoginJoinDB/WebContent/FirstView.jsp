<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<!-- FirstView.jsp -->
	<meta charset="EUC-KR">
	<title>ùȭ��</title>
</head>
<body>
	<%
		//sessionID : ����ں�����. �α��εǸ� ������ ��.
		
		//�α��� �ȵǾ��� ��
		if(session.getAttribute("sessionID") == null) {
	%>
	<br><br><br>
         <br><br><br>
         <img src="img/welcome.jpg">
         <br><br>
			<h1>�α������ּ���.</h1>
	<%		
		}else{ //�α��� �Ǿ��� ��
	%>
			<h1>�α��εǾ����ϴ�. ȯ���մϴ�!</h1>
			<h3><%= session.getAttribute("sessionID") %>������ �α��εǾ����ϴ�.</h3>
	<%
		} 
	%>

</body>
</html>