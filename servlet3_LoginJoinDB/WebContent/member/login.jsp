<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<!-- loginForm.jsp -->
<meta charset="EUC-KR">
<title>�α���ȭ��</title>
	<%
		request.setCharacterEncoding("euc-kr");
		
	%>
	<script type="text/javascript">
		
		function checkValue() {
			//eval()�Լ� :���ڿ��� �ڵ�� ��ȯ���ִ� �Լ�
			var inputForm=eval("document.loginInfo");
			if(!inputForm.id.value){
				alert("���̵� �Է����ּ���");
				inputForm.id.focus();
				return false;
			}
			if(!inputForm.id.password.value){
				alert("��й�ȣ�� �Է����ּ���");
				inputForm.password.focus();
				return false;
			}
		}
		function goFirstForm() {
			location.href="../Mainform.do"
		}
	</script>
	<style type="text/css">
      table{
      	 width:600px;
      	 height:400px;
         padding: 60px 0px;
         margin-left:auto; 
         margin-right:auto;
         border:3px solid skyblue;
      }
      
      td{
         border:1px solid skyblue
      }
      
      #title{
         background-color:skyblue;
      }
   </style>
</head>
<body>	
<div id="wrap">
   
      <br><br>
      <b><font size="6" color="gray">
      	<p style="text-align: center;">�α���</p></font></b>
      <br><br><br>
   		<!-- onsubmit �Ӽ�: submit��ư�� �̺��� ĳġ���� js�Լ� ȣ����.
   				�������� ó���� �ڵ尡 ���� ��  -->
      <form name="loginInfo" method="post" action="MemberLoginAction.do" 
            onsubmit="return checkValue()">

         <table>
            <tr>
               <td bgcolor="skyblue">���̵�</td>
               <td><input type="text" name="id" maxlength="50"></td>
            </tr>
            <tr>
               <td bgcolor="skyblue">��й�ȣ</td>
               <td><input type="password" name="password" maxlength="50"></td>
            </tr>
            <tr>
            	<td colspan="2" style="text-align: center;"> 
            		  <input type="submit" value="�α���"/>
         <input type="button" value="���" onclick="goFirstForm()">
            	</td>
            </tr>
         </table>
         <br>
       
      </form>
</body>
</html>