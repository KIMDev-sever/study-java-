<%@ page 
	language="java" 
	contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.Date"  %>    
    
	<!-- �Խ��� > JSP > ������ ���þ� ����  -->
	<%-- ������ ���þ� --%>
	<%-- contentType: �⺻��(text/html) --%>
	<%--            : JSP������ MIME(ContentType) Ÿ�԰� ���� ���ڵ� Ÿ�� ���� --%>
	<%--            : MIME(Multipurpose Internet Mail Extension) --%>
	<%--            : ���� ������ ������ ���� ���� -> ��Ź��� Ÿ������ --%>
	<%--            : ContentType : text/html, Application/xml, Application/json --%>
	<%--            : Application/x-www-form-urlencode, text/plain, text/xml --%>
	<%--            : multipart/formed-data(����) --%>
	<%--            : charset: UTF-8(�����ڵ�), iso-8859-1(�⺻��,MS�������� �ѱ�MS949, EUC-KR�� Ȯ����) --%>
	<%--              EUC-KR(�ϼ����ѱ�), ASCII(����)     --%>
	<%-- import : �⺻��(����) --%>
	<%--        : �ڹ� Ŭ���� ����Ʈ --%>
	<%-- session : �⺻��(true) --%>
	<%--         : ���� ��� ���� --%>
	<%-- buffer : �⺻��(8kb) --%>
	<%--        : ��¹���(Memory)�� ũ�� ���� --%>
	<%-- autoFlush : �⺻��(true) --%>
	<%--           : ��¹��۰� �� á�� ��� �ڵ����� �������� ���� --%>
	<%-- info : JSP �������� ���� ���� ��� --%>
	<%-- errorPage : JSP ������ ������ �����߻��� ������ ������ ���(error.jsp) --%>
	<%-- isErrorPage : �⺻��(false)
	                   ���� �������� ���� ������ �������� ���� --%>
	<%-- pageEncoding : JSP ������ �ҽ� �ڵ��� ���� ���ڵ��� ������ --%>
	<%-- charset�� pageEncoding�� ������ --%>
	<%-- charset�� ������ ������������ ������ ���� ���ڵ� Ÿ�� --%>
	<%-- pageEncoding�� �ҽ� �ڵ� ��ü�� ���� ���ڵ� Ÿ�� --%>
	
	<%-- isELIgnored : �⺻��(false) --%>
	<%--             : ǥ�����(Expression Language)�� ��� ���� --%>
	<%--             : ��¹��� ����(ǥ����:������ ǥ��) --%>
	
	<%-- deferredSyntaxAllowedAsLiteral: �⺻��(false) --%>
	<%--                               : #{} ���ڰ� ���ڿ� ������ ������ ���� --%>
	
	<%-- trimDirectiveWhitespaces : �⺻��(false) --%>
	<%--                          : ��°������ ���鹮�ڸ� �������� ���� --%>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>������ ���þ� ����</title>
</head>
<body>
	<%
		Date now = new Date(); //����ð�
	%>	
	���� �ð�: <%= now %>
</body>
</html>









