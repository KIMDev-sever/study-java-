<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	에러가 발생하여 미안하다
	에러타입 : <%=exception.getClass().getName() %>
	에러메세지 :<%=exception.getMessage() %>
	<br>
   HTTP 응답 코드 분류 :   
   100번대 : 처리중
   200번대 : 성공 상태
   300번대 : 페이지 이동(리다이렉션)
   400번대 : 사용자요청 오류
   500번대 : 서버 오류
   <br>
   중요한 응답 코드
   <!-- 200 : 요청을 정상적으로 처리함 -->
    <!-- 307 : 임시로 페이지를 리다이렉트(이동) 함 -->
    <!-- 400 : 클라이언트 요청이 잘못된 구문으로 구성됨. -->
    <!-- 401 : 접근을 허용하지 않음 -->
    <!-- 404 : 요청한 URL을 처리하기 위한 자원(페이지)이 존재하지 않음 -->
    <!-- 405 : 요청한 메소드(GET,POST,PUT,HEAD)전송방식을 지원하지 않음 -->
    <!-- 500 : 서버 내부 에러 발생(JSP Exception) -->
    <!-- 503 : 서버가 일시적으로 서비스를 제공할 수 없음.
               급격한 부하가 걸리거나 서버 공사중일 때 -->
    <br>
    web.xml에서 응답코드에 따른 에러페이지 지정이 가능함.
    url 앞에 반드시 /가 있어야 됨.
    <!-- <error-page> -->
    <!--    <error-code>404</error-code> -->
    <!--    <location>/ex25_404ErrorMessage.jsp</location> -->
    <!-- </error-page> --> 
</body>
</html>