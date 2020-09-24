<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>선언부 : 변수 선언</title>
</head>
<body>
	<%! /* 선언부에서 변수와 함수의 선언만 가능하다. 코드추가 불가 */
		double radius = 4.8;
		/* radius = 9; 선언만 가능하다. */
	%>
	<% 
		double result = 0; 
	%>
	<%!
		public double getArea(double rr) {
			return rr * rr * 3.14;
		}
	%>
	<%
		/* 선언부가 아니기 때문에 에러 */
		/* public void test() { } */
	%>
	<%= result %> <br>
	<%= radius %> <br>
	<% result = getArea(radius); %>
	<%= result %> <br>
	<%= radius %> <br>
	반지름 4.8인 원의 넓이는 <%= getArea(radius) %>
</body>
</html>




