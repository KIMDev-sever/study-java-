<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>HTTP통신 헤더 목록 출력</title>
</head>
<body>
	<%
      java.util.Enumeration headerEnum = request.getHeaderNames();
      while( headerEnum.hasMoreElements() ) {
         String headerName = (String)headerEnum.nextElement();
         String headerValue = request.getHeader(headerName);
   %>
         <%= headerName %> : <%= headerValue %> <br>
   <%
      }
   %>
</body>
</html>