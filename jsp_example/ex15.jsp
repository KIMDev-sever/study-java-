<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Web.xml �ʱ�ȭ �Ķ���� ��������</title>
</head>
<body>
	<!-- web.xml�� �����ø����̼��� �ʱ�ȭ �������� -->
	<!-- web.xml�����ϸ�,������(����������)�� ������ؾߵ� (�ֽ���Ĺ�� �ڵ������ -->
	�ʱ�ȭ �Ķ���� ���:
   <ul>
      <%
         java.util.Enumeration<String> initParamEnum = 
             application.getInitParameterNames();
      
         while( initParamEnum.hasMoreElements() ) {
            String initParamName = initParamEnum.nextElement();
            out.println( initParamName );
      %>
            <li>
               <%= initParamName %> = 
               <%= application.getInitParameter( initParamName )  %>
            </li>
      <%
         }
      %>
      
          
   </ul>
</body>
</html>