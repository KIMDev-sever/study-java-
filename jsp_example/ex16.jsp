<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>application ��ü�� �̿��� ���� ���� ��������</title>
</head>
<body>
	��������:<%= application.getServerInfo() %><br>
	���� ������ ����:<%= application.getMajorVersion() %><br>
	���� ���̳� ����:<%= application.getMinorVersion() %>
	<!-- ����:Servlet (Server+Applet(�������α׷�)) -->
	<!-- ������ ��û�� �����ϴ� ������ �������(���α׷�)���� -->
	<!-- jsp�� �̿��� Ŭ���̾�Ʈ�� ��û�� ó���ϴ� servletŬ���� -->
	<!-- ������ �ڹ����α׷� -->
	<!-- �α�(��� �����) -->
	<%
		application.log("�α׸޼��� ���");
	%>
</body>
</html>