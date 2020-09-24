<%@page import="java.net.URLDecoder"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- 쿠키와 세션 
	웹/앱의 통신이 주로 2가지
	1. 소캣 tcp/ip통신 : 연결지향,채팅,게임
	2.http통신: 비연결지향,웹앱대부분
	클라 --request1 --- > 서버
		<--response1 -- 
		
      클라 --request2 --- > 서버
		<--response2 -- 
접속정보의 연결성을 위해 사용하는것
1.쿠키와 세션
2.application /sesion /request /page객체
3.js에서 glblaVariable 저장소를 사용함 일종의 쿠키
4.get나 post로 데이터를 다른 페이지에 전달
5.forward액션태그로 파라미터 전달

쿠키 :방문흔적을 남김,로컬 파일시스템에 기록을남김

세션 :방문기록및 세션키값을 서버에 남김
하지만 쿠키값을 세션키값을 저장해놓기도함
-->

	<%
		String encodedName = URLEncoder.encode("홍길동", "utf-8");
		Cookie cookie = new Cookie("name", encodedName);
		cookie.setMaxAge(60 * 60 * 24 * 30); //한달
		response.addCookie(cookie);

		String encodedName2 = URLEncoder.encode("이순신", "utf-8");
		Cookie cookie2 = new Cookie("name", encodedName2);
		response.addCookie(cookie);
	%>

	<%=cookie.getName() %>
	<%=cookie.getValue() %>
	<%=cookie2.getName( )%>
	<%=cookie2.getValue() %>
	
	<% 
		String encodedStr=cookie.getValue();
		String decodedStr=URLDecoder.decode(encodedStr,"utf-8");
		
		out.print("<br>");
		out.print("엔코딩값"+encodedStr);
		out.print("<br>");
		out.print("디코딩값"+decodedStr);
		
		Cookie cookie3= new Cookie("name", "변사또"); 
		response.addCookie(cookie3);
		cookie3.setMaxAge(0);
		response.addCookie(cookie3);
	%>
</body>
</html>