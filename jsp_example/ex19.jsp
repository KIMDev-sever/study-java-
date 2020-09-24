<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>에외처리</title>
</head>
<body>
<%
      try {
   %>
         <%= request.getParameter("name").toLowerCase() %>
   <%      
      } catch( Exception e ) {
   %>
         name파라미터가 올바르지 않습니다.
   <%
      }
   %>
</body>
</html>