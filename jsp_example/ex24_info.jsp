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
Ÿ��
</td>
<td>
<%=type %>
</td>
</tr>
<tr>
<td>
Ư¡
</td>
<td>
<% if(type.equals("A")){%>
	���ѳ�����
<%} %>
<% if(type.equals("B")){%>
	�پ ������
<%} %>
</td>
</tr>