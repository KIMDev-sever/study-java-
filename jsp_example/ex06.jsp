<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>����� : ���� ����</title>
</head>
<body>
	<%! /* ����ο��� ������ �Լ��� ���� �����ϴ�. �ڵ��߰� �Ұ� */
		double radius = 4.8;
		/* radius = 9; ���� �����ϴ�. */
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
		/* ����ΰ� �ƴϱ� ������ ���� */
		/* public void test() { } */
	%>
	<%= result %> <br>
	<%= radius %> <br>
	<% result = getArea(radius); %>
	<%= result %> <br>
	<%= radius %> <br>
	������ 4.8�� ���� ���̴� <%= getArea(radius) %>
</body>
</html>




