<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	������ �߻��Ͽ� �̾��ϴ�
	����Ÿ�� : <%=exception.getClass().getName() %>
	�����޼��� :<%=exception.getMessage() %>
	<br>
   HTTP ���� �ڵ� �з� :   
   100���� : ó����
   200���� : ���� ����
   300���� : ������ �̵�(�����̷���)
   400���� : ����ڿ�û ����
   500���� : ���� ����
   <br>
   �߿��� ���� �ڵ�
   <!-- 200 : ��û�� ���������� ó���� -->
    <!-- 307 : �ӽ÷� �������� �����̷�Ʈ(�̵�) �� -->
    <!-- 400 : Ŭ���̾�Ʈ ��û�� �߸��� �������� ������. -->
    <!-- 401 : ������ ������� ���� -->
    <!-- 404 : ��û�� URL�� ó���ϱ� ���� �ڿ�(������)�� �������� ���� -->
    <!-- 405 : ��û�� �޼ҵ�(GET,POST,PUT,HEAD)���۹���� �������� ���� -->
    <!-- 500 : ���� ���� ���� �߻�(JSP Exception) -->
    <!-- 503 : ������ �Ͻ������� ���񽺸� ������ �� ����.
               �ް��� ���ϰ� �ɸ��ų� ���� �������� �� -->
    <br>
    web.xml���� �����ڵ忡 ���� ���������� ������ ������.
    url �տ� �ݵ�� /�� �־�� ��.
    <!-- <error-page> -->
    <!--    <error-code>404</error-code> -->
    <!--    <location>/ex25_404ErrorMessage.jsp</location> -->
    <!-- </error-page> --> 
</body>
</html>