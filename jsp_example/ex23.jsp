<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- flush 속성  메모리 버퍼의 내용을 밀어내서 뷰에 출력한다-->
<!-- true : 서버페이지 먼저 출력됨-->
<!-- flase : 메인페이지와 함께 (합처서) 출력-->
	ex23의내용<br>
	<jsp:include page="ex23_subpage.jsp" flush="ture"></jsp:include>
	include이후의 내용
</body>
</html>