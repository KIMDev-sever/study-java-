<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%-- request 객체 : 요청정보 --%>
   <%-- reponse 객체 : 응답정보 --%>
   <%-- out 객체 : 결과 출력시 사용 echo --%>
   <%-- session 객체 : 세션(연결지향) 정보 --%>
   <%-- exception 객체 : 예외처리 --%>

   <%-- pageContext 객체 : JSP 페이지 정보 --%>
   <%-- application 객체 : 웹애플리케이션(브라우저) 정보 --%>
   <%-- config 객체 : JSP 페이지 설정정보 --%>
   <%-- page 객체 : JSP 페이지 구현 자바클래스 객체 --%>
   <% 
   out.println("<h2>JSP프로그래밍</h2>"); // 줄바꿈있음
   out.print("시작합니다"); // 줄바꿈없음
   out.println("!!!");
   
   	out.print("줄바꿈합니다.<br>");
   	out.println("!!!!<br>");
   	
   out.newLine(); // "/n"
   out.println("newLine()됨.");
   %>
</body>
</html>