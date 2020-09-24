<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
String type=request.getParameter("type");
	if(type==null){
		return;
	}
%>
<tr>
<td>
타입
</td>
<td>
<%=type %>
</td>
</tr>
<tr>
<td>
특징
</td>
<td>
<% if(type.equals("A")){%>
	강한내구성
<%} %>
<% if(type.equals("B")){%>
	뛰어난 디자인
<%} %>
</td>
</tr>