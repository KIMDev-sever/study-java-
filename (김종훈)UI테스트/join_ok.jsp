<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%	
	if(application.getAttribute("user_id").equals("") ||
			application.getAttribute("user_pw").equals("") ||
			application.getAttribute("phone").equals("")||
			application.getAttribute("address").equals("")){
		%>
<script type="text/javascript">
	alert('�Է������� ����ֽ��ϴ�.');
	history.back();
</script>
<% } else {
	application.setAttribute("user_id", request.getParameter("user_id"));
	String pw=request.getParameter("user_pw");
	String pwck=request.getParameter("user_pw_check");
	application.setAttribute("phone",request.getParameter("phone"));
	application.setAttribute("address",request.getParameter("address"));
	if(pw.equals(pwck)){
		application.setAttribute("user_pw",pw);
		%>
		<script type="text/javascript">
		alert('ȸ�������� �Ǿ����ϴ�.');
		location.href="login.jsp"
		</script>
	<%
	}else{
		%>
		<script type="text/javascript">
		alert('��й�ȣ�� �����ʽ��ϴ�.');
		history.back();
		</script>
		<%
	}

}
%>
