<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%!
	/* ����� : ������ �Լ��� ������. */
	public int multi(int a, int b){
		return a * b;
	}
%>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>����� : ������ �Լ��� �����ϴ� ��</title>
</head>
<body>
	3 ���ϱ� 5�� <%= multi( 3, 5 ) %>
</body>
</html>