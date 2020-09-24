<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- 쿠키와 세션 -->
   <!-- 쿠키 : 웹브라우저에 로컬PC에 파일로 데이타를 저장하기(비로그인) -->
    <!-- 세션 : 서버(JSP) PC에 파일로 데이타를 저장하기(로그인) -->

   <!-- JSESSIONID : 톰캣서버가 세션을 유지하기 위해 -->
   <!--               처음 접속하는 웹앱에 부여하는 키 -->
   <!-- 톰캣서버가 발급해준 세션을 유지하고 싶으면, -->
    <!-- Request 헤더에 JSESSIONID로 받은 쿠키값을 쿠키로 -->
    <!-- 넣어주면 된다. -->
    <!-- Response 헤더에 Set-Cookie: JSESSIONID=XXXXXXXX -->
    
    <!-- Client   < ----------- >    Server  -->
    <!--            JSESSIONID발급해줌.(세션유지됨.)-->
    <!--  브라우저닫아도 세션유지-Reponse.setCookie("JSESSIONID", 값) -->
    <!--  브라우저에 JSESSIONID 쿠키값이 있으면,              -->
    <!--  톰캣서버는 새로운 JSESSIONID를 발급하지 않음(유지!) -->
   <!-- 세션유지 조건: 동일한 도메인 주소일때 -->
   <!-- 
   네이버홈피에 로그인하면, 세션id발급
   다른탭에 네이버들어가도 로그인상태가 유지됨
   	웹브라우져 종료되면 세션 소멸
    -->
   
   <%
      /* 현재시간 출력 */
      java.util.Date time = new java.util.Date();
      java.text.SimpleDateFormat formatter = 
               new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
   %>
   현재시간 : <%= formatter.format(time) %> <br>
   
   <!--  JSESSIONID 값 -->
   세션 ID : <%= session.getId() %> <br>
   <%
      time.setTime( session.getCreationTime() ); 
   %>
   세션생성시간 : <%= formatter.format(time) %> <br>

   <%
      time.setTime( session.getLastAccessedTime() ); 
   %>
   마지막접근시간: <%= formatter.format(time) %>
</body>
</html>