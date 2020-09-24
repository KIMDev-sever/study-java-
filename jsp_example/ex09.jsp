<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%-- request객체 : 웹브라우저의 요청이나 서버정보를 다룸  --%>
    <%-- 접속한 클라이언트(웹브라우저,안드로이드폰,아이폰)의 IP주소 --%>
    클라이언트 IP = <%= request.getRemoteAddr() %> <br>
    <%-- 클라이언트가 전송한 요청정보의 길이, 알수없으면 -1임. --%>
    요청정보길이 = <%= request.getContentLength() %> <br>
    <%-- 요청정보의 문자 인코딩 정보(charset) --%>
    요청정보 인코딩 = <%= request.getCharacterEncoding() %> <br>
    <%-- 클라이언트가 사용한 컨텐츠의 타입(ContentType) --%>
    요청정보 컨텐츠타입 = <%= request.getContentType() %> <br>
    <%-- 요청정보의 통신 프로토콜: HTTP 1.0, HTTP 1.1 --%>
    요청정보 프로토콜 = <%= request.getProtocol() %> <br>
    <%-- 요청 전송방식: GET, POST, PUT, DELETE --%>
    요청정보 전송방식 = <%= request.getMethod() %> <br>
    <%-- 클라이언트가 요청한 서버의 URL(경로만) (루트)/myexam/ex09.jsp --%>
    요청 URL = <%= request.getRequestURI() %> <br>
    <%-- 웹 어플리케이션의 컨텍스트(폴더) 경로 /myexam --%>
    컨텍스트 경로 = <%= request.getContextPath() %> <br>
    <%-- 요청한 서버의 이름(localhost, 서버도메인이름 www.google.com ) --%>
    <%-- 도메인 Domain : 서버주소(23.123.23.123) 숫자로 됨. --%>
    <%-- 도메인 서버 : 이름으로 된 주소(www.google.com)를 숫자로 바꿔줌.  --%>
    서버 이름 = <%= request.getServerName() %> <br>
    <%-- 구동중인 서버의 포트: 톰캣 8080, 비트나미 아파치: 80(기본값) --%>
    서버 포트 = <%= request.getServerPort() %> <br>
</body>
</html>