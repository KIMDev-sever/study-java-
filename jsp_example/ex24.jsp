<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table>
	<tr>
	<td>
		��ǰ��ȣ
	</td>
	<td>
		td0004
	</td>
	</tr>
		<tr>
	<td>
		����
	</td>
	<td>
		2132133
	</td>
	</tr>
	</table>
	
	<jsp:include page="ex24_info.jsp" flush="false">
		<jsp:param name="type" value="A"/>
	</jsp:include>
</body>
</html>