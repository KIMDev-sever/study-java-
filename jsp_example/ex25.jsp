<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:forward page="ex25_dest.jsp">
	<jsp:param name="name" value="hong"/>
</jsp:forward>
	<!-- 
      JSP에서 페이지 이동하는 방법 4가지
      1. 자바스크립트 이용
      <script>location.href = "ex32_dest.jsp"; </script>
      <script>alert('권한이 없어요!'); window.history.back(); </script>
      
      2. response.sendRedirect() 함수
      < % response.sendRedirect("ex32_dest.jsp"); %>
      < % response.sendRedirect("http://www.google.com"); %>
      
      3. forward 액션태그
      <jsp:forward page="ex32_dest.jsp" />
      
      4. html meta 태그 
      <meta http-equiv=refresh content="0;url=ex32_dest.jsp" />
      
    -->
</body>
</html>