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
      String appRealPath = application.getRealPath("/");
      out.println( appRealPath + "<br>" );
      String contextPath = request.getContextPath();
      out.println( contextPath + "<br>" );
      String contextRealPath = request.getServletContext().getRealPath("/");
      out.println( contextRealPath + "<br>" );
   %>
   <br>
   <img alt="샘플이미지" src="./images/image.jpg"  /> <br>
   <!-- IE에서는 동작함. Chrome에서는 미동작(보안정책)  -->
   <img alt="샘플이미지" src="<%= appRealPath %>images\image.jpg"  /> <br>
   <img alt="샘플이미지" src="<%= request.getContextPath() %>/images/image.jpg">
</body>
</html>