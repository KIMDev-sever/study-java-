<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//request 정보를 UTF-8 문자 인코딩 함. 한글 깨짐 현상 수정
	request.setCharacterEncoding("UTF-8");
%>
<!-- http 통신 -->
<!-- client ---request-- > server -->
<!-- 		(get,post) -->
<!-- client < -- response > server -->
<!-- 		(html,xml,json) -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POST 요청 파라미터 출력</title>
</head>
<body>
	name 파라미터 :
	<%=request.getParameter("name")%>
	address 파라미터 :
	<%=request.getParameter("address")%>
	pet 파라미터 :
	<%
	String[] values = request.getParameterValues("pet");
	if (values != null) {
		for (int i = 0; i < values.length; i++) {
	%>
	<%= values[i]%>
	<%
		}
	}
	%>
	<!-- 열거형 으로출력 -->
	<% java.util.Enumeration paramEnum = request.getParameterNames();
		while(paramEnum.hasMoreElements()){
			String name=(String)paramEnum.nextElement();
			%>
	<br><%=name %>
	<%
		}
	%>
	<!-- 맵(key- value) 형식으로 출력 -->
	<%
	java.util.Map parameMap=request.getParameterMap();
	String[] nameParam=(String[])parameMap.get("pet");
	if(nameParam !=null){
	%>
	<br>pet :
	<%= nameParam[0] %>

	<%
	}
	%>
</body>
</html>