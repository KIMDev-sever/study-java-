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
	<!-- ��Ű�� ���� 
	��/���� ����� �ַ� 2����
	1. ��Ĺ tcp/ip��� : ��������,ä��,����
	2.http���: �񿬰�����,���۴�κ�
	Ŭ�� --request1 --- > ����
		<--response1 -- 
		
      Ŭ�� --request2 --- > ����
		<--response2 -- 
���������� ���Ἲ�� ���� ����ϴ°�
1.��Ű�� ����
2.application /sesion /request /page��ü
3.js���� glblaVariable ����Ҹ� ����� ������ ��Ű
4.get�� post�� �����͸� �ٸ� �������� ����
5.forward�׼��±׷� �Ķ���� ����

��Ű :�湮������ ����,���� ���Ͻý��ۿ� ���������

���� :�湮��Ϲ� ����Ű���� ������ ����
������ ��Ű���� ����Ű���� �����س��⵵��
-->

	<%
		String encodedName = URLEncoder.encode("ȫ�浿", "utf-8");
		Cookie cookie = new Cookie("name", encodedName);
		cookie.setMaxAge(60 * 60 * 24 * 30); //�Ѵ�
		response.addCookie(cookie);

		String encodedName2 = URLEncoder.encode("�̼���", "utf-8");
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
		out.print("���ڵ���"+encodedStr);
		out.print("<br>");
		out.print("���ڵ���"+decodedStr);
		
		Cookie cookie3= new Cookie("name", "�����"); 
		response.addCookie(cookie3);
		cookie3.setMaxAge(0);
		response.addCookie(cookie3);
	%>
</body>
</html>