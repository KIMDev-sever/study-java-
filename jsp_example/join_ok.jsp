<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%	
	application.setAttribute("user_id", request.getParameter("user_id"));

	String pw=request.getParameter("user_pw");
	String pwck=request.getParameter("user_pw_check");
	if(pw.equals(pwck)){
		application.setAttribute("user_pw",pw);
	}
	application.setAttribute("phone",request.getParameter("phone"));
	application.setAttribute("address",request.getParameter("address"));

%>
<script type="text/javascript">
	alert('회원가입이 되었습니다.');
	location.href="login.jsp"
</script>