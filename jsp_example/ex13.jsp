<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%-- request ��ü : ��û���� --%>
   <%-- reponse ��ü : �������� --%>
   <%-- out ��ü : ��� ��½� ��� echo --%>
   <%-- session ��ü : ����(��������) ���� --%>
   <%-- exception ��ü : ����ó�� --%>

   <%-- pageContext ��ü : JSP ������ ���� --%>
   <%-- application ��ü : �����ø����̼�(������) ���� --%>
   <%-- config ��ü : JSP ������ �������� --%>
   <%-- page ��ü : JSP ������ ���� �ڹ�Ŭ���� ��ü --%>
   <% 
   out.println("<h2>JSP���α׷���</h2>"); // �ٹٲ�����
   out.print("�����մϴ�"); // �ٹٲ޾���
   out.println("!!!");
   
   	out.print("�ٹٲ��մϴ�.<br>");
   	out.println("!!!!<br>");
   	
   out.newLine(); // "/n"
   out.println("newLine()��.");
   %>
</body>
</html>