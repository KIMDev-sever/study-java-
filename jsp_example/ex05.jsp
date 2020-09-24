<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%!
	/* 선언부 : 변수와 함수를 선언함. */
	public int multi(int a, int b){
		return a * b;
	}
%>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>선언부 : 변수와 함수를 선언하는 곳</title>
</head>
<body>
	3 곱하기 5는 <%= multi( 3, 5 ) %>
</body>
</html>