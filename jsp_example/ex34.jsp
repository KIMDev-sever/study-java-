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
 String id=(String) session.getAttribute("id");
String pw=(String) session.getAttribute("pw");
%>
<form action="ex34_session_login_ok.jsp" method="post">
      아이디 : <input text="text" name="user_id" > <br />
      암호 : <input text="password" name="user_pw" > <br />
      <input type="submit" >
   </form>
</body>
</html>