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
      JSP���� ������ �̵��ϴ� ��� 4����
      1. �ڹٽ�ũ��Ʈ �̿�
      <script>location.href = "ex32_dest.jsp"; </script>
      <script>alert('������ �����!'); window.history.back(); </script>
      
      2. response.sendRedirect() �Լ�
      < % response.sendRedirect("ex32_dest.jsp"); %>
      < % response.sendRedirect("http://www.google.com"); %>
      
      3. forward �׼��±�
      <jsp:forward page="ex32_dest.jsp" />
      
      4. html meta �±� 
      <meta http-equiv=refresh content="0;url=ex32_dest.jsp" />
      
    -->
</body>
</html>