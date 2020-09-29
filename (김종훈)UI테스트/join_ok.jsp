<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%	
	if(application.getAttribute("user_id").equals("") ||
			application.getAttribute("user_pw").equals("") ||
			application.getAttribute("phone").equals("")||
			application.getAttribute("address").equals("")){
		%>
<script type="text/javascript">
	alert('입력정보가 비어있습니다.');
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
		alert('회원가입이 되었습니다.');
		location.href="login.jsp"
		</script>
	<%
	}else{
		%>
		<script type="text/javascript">
		alert('비밀번호가 맞지않습니다.');
		history.back();
		</script>
		<%
	}

}
%>
