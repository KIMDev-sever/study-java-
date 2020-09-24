<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%-- request��ü : ���������� ��û�̳� ���������� �ٷ�  --%>
    <%-- ������ Ŭ���̾�Ʈ(��������,�ȵ���̵���,������)�� IP�ּ� --%>
    Ŭ���̾�Ʈ IP = <%= request.getRemoteAddr() %> <br>
    <%-- Ŭ���̾�Ʈ�� ������ ��û������ ����, �˼������� -1��. --%>
    ��û�������� = <%= request.getContentLength() %> <br>
    <%-- ��û������ ���� ���ڵ� ����(charset) --%>
    ��û���� ���ڵ� = <%= request.getCharacterEncoding() %> <br>
    <%-- Ŭ���̾�Ʈ�� ����� �������� Ÿ��(ContentType) --%>
    ��û���� ������Ÿ�� = <%= request.getContentType() %> <br>
    <%-- ��û������ ��� ��������: HTTP 1.0, HTTP 1.1 --%>
    ��û���� �������� = <%= request.getProtocol() %> <br>
    <%-- ��û ���۹��: GET, POST, PUT, DELETE --%>
    ��û���� ���۹�� = <%= request.getMethod() %> <br>
    <%-- Ŭ���̾�Ʈ�� ��û�� ������ URL(��θ�) (��Ʈ)/myexam/ex09.jsp --%>
    ��û URL = <%= request.getRequestURI() %> <br>
    <%-- �� ���ø����̼��� ���ؽ�Ʈ(����) ��� /myexam --%>
    ���ؽ�Ʈ ��� = <%= request.getContextPath() %> <br>
    <%-- ��û�� ������ �̸�(localhost, �����������̸� www.google.com ) --%>
    <%-- ������ Domain : �����ּ�(23.123.23.123) ���ڷ� ��. --%>
    <%-- ������ ���� : �̸����� �� �ּ�(www.google.com)�� ���ڷ� �ٲ���.  --%>
    ���� �̸� = <%= request.getServerName() %> <br>
    <%-- �������� ������ ��Ʈ: ��Ĺ 8080, ��Ʈ���� ����ġ: 80(�⺻��) --%>
    ���� ��Ʈ = <%= request.getServerPort() %> <br>
</body>
</html>