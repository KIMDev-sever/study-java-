<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%	

	String id=application.getAttribute("user_id").toString();
	String pass= application.getAttribute("user_pw").toString();
	if(id.equals(request.getParameter("user_id")) && pass.equals(request.getParameter("user_pw"))){
%>	
<script type="text/javascript">
alert('�α��� �Ǿ����ϴ�.');
</script>
<% 	
}else{
	%>
<script type="text/javascript">
alert("���̵�Ǵ� ��й�ȣ�� �ٸ��ϴ�.");
history.back();
</script>
<% }%>	


