<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- ��Ű�� ���� -->
   <!-- ��Ű : ���������� ����PC�� ���Ϸ� ����Ÿ�� �����ϱ�(��α���) -->
    <!-- ���� : ����(JSP) PC�� ���Ϸ� ����Ÿ�� �����ϱ�(�α���) -->

   <!-- JSESSIONID : ��Ĺ������ ������ �����ϱ� ���� -->
   <!--               ó�� �����ϴ� ���ۿ� �ο��ϴ� Ű -->
   <!-- ��Ĺ������ �߱����� ������ �����ϰ� ������, -->
    <!-- Request ����� JSESSIONID�� ���� ��Ű���� ��Ű�� -->
    <!-- �־��ָ� �ȴ�. -->
    <!-- Response ����� Set-Cookie: JSESSIONID=XXXXXXXX -->
    
    <!-- Client   < ----------- >    Server  -->
    <!--            JSESSIONID�߱�����.(����������.)-->
    <!--  �������ݾƵ� ��������-Reponse.setCookie("JSESSIONID", ��) -->
    <!--  �������� JSESSIONID ��Ű���� ������,              -->
    <!--  ��Ĺ������ ���ο� JSESSIONID�� �߱����� ����(����!) -->
   <!-- �������� ����: ������ ������ �ּ��϶� -->
   <!-- 
   ���̹�Ȩ�ǿ� �α����ϸ�, ����id�߱�
   �ٸ��ǿ� ���̹����� �α��λ��°� ������
   	�������� ����Ǹ� ���� �Ҹ�
    -->
   
   <%
      /* ����ð� ��� */
      java.util.Date time = new java.util.Date();
      java.text.SimpleDateFormat formatter = 
               new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
   %>
   ����ð� : <%= formatter.format(time) %> <br>
   
   <!--  JSESSIONID �� -->
   ���� ID : <%= session.getId() %> <br>
   <%
      time.setTime( session.getCreationTime() ); 
   %>
   ���ǻ����ð� : <%= formatter.format(time) %> <br>

   <%
      time.setTime( session.getLastAccessedTime() ); 
   %>
   ���������ٽð�: <%= formatter.format(time) %>
</body>
</html>