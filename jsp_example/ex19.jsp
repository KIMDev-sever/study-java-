<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>����ó��</title>
</head>
<body>
<%
      try {
   %>
         <%= request.getParameter("name").toLowerCase() %>
   <%      
      } catch( Exception e ) {
   %>
         name�Ķ���Ͱ� �ùٸ��� �ʽ��ϴ�.
   <%
      }
   %>
</body>
</html>