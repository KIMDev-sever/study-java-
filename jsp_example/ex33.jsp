<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- ex33.jsp  -->
<meta charset="UTF-8">
<title> 세션에 값 삭제(세션종료) </title>

</head>
<body>
<!-- JSP페이지 간의 데이타 전달  -->
   <!-- 1. application 객체 : setAttr/getAttr -->
   <!--    수명: 브라우저 앱이 닫힐 때까지 -->
   <!-- 2. pageContext 객체 : setAttr/getAttr -->
   <!--    수명: 단일페이지에서만 -->
   <!-- 3. request 객체 : setAttr/getAttr-->
   <!--    수명: 단일 요청에 대해서(리다이렉트 하면 사라짐) -->
   <!-- 4. session 객체 : setAttr/getAttr-->
   <!--    수명: 단일 세션 아이디에 까지 -->
   <!-- 5. 주소줄에 Get방식으로 데이타 전달 : GetParameter() -->
   <!--    단점: 정보가 유출됨.  -->
   <!-- 6. 주소줄에 Get방식으로 데이타 전달 : setAttr/getAttr -->
   <!--    수명: request요청에 대해서 리다이렉트 포함
   7.쿠키와 세션
   8.forward 액션 태그 파라미터로 전달
    -->
   
   <!-- 수명에 따른 분류 -->
   <!--  page < request < session < applicatin(servletContext)  -->
   세션을 종료합니다. <br>
   
   <%
      session.invalidate();
   %>
   
</body>
</html>