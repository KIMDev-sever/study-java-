<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
table{

border: 1px solid #b5b5b5;

}
table tr td{
font-weight : bold;
color:#b5b5b5;
}
input[type="submit"]{
	background: #3f51b5;
	color:#ffffff;
}</style>
</head>
<body>
<form action="/jsp_examples/login_ok.jsp" method="post">
      <table  border="1" cellpadding="0" cellspacing="0">
         <tr>
            <td>아이디</td>
            <td colspan="3"> <input type="text" name="user_id" size="10"/> </td>
         </tr>
         <tr>
            <td>암호</td>
            <td colspan="3"> <input type="password" name="user_pw" size="10"/> </td>
            </tr>
         <tr>
            <td colspan="3" align="center">
            <input type="submit" value="로그인" />
            </td>
         </tr>
      </table>
    </form>
</body>
</html>