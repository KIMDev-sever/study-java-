<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="users" scope="request" class="jsp_examples.Users"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- �ڹ� (bean)
	�ڹ�Ŭ������ new�� ��ü (�ν��Ͻ�)�� �����
	id : �ڹٺ�(��ü) �̸�
      scope : �ڹٺ� ��ü�� ������ ����(���� ����)
            : page(�⺻��), request, session, application
      class : ��Ű���̸��� ������ �ڹٺ� Ŭ���� �̸�
 -->
 
	<%
		users.setUser_id("hong");
		users.setUser_pw("1234");
	%>
	
	<%= users.getUser_id() %>
	<%= users.getUser_pw() %>
</body>
</html>