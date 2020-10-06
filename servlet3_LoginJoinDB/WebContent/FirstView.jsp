<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<!-- FirstView.jsp -->
	<meta charset="EUC-KR">
	<title>첫화면</title>
</head>
<body>
	<%
		//sessionID : 사용자변수임. 로그인되면 설정해 줌.
		
		//로그인 안되었을 때
		if(session.getAttribute("sessionID") == null) {
	%>
	<br><br><br>
         <br><br><br>
         <img src="img/welcome.jpg">
         <br><br>
			<h1>로그인해주세요.</h1>
	<%		
		}else{ //로그인 되었을 때
	%>
			<h1>로그인되었습니다. 환영합니다!</h1>
			<h3><%= session.getAttribute("sessionID") %>님으로 로그인되었습니다.</h3>
	<%
		} 
	%>

</body>
</html>