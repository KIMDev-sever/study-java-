<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%	

	String id=application.getAttribute("user_id").toString();
	String pass= application.getAttribute("user_pw").toString();
	if(id.equals(request.getParameter("user_id")) && pass.equals(request.getParameter("user_pw"))){
%>	
<script type="text/javascript">
alert('로그인 되었습니다.');
</script>
<% 	
}else{
	%>
<script type="text/javascript">
alert("아이디또는 비밀번호가 다릅니다.");
history.back();
</script>
<% }%>	


