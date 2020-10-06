<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<!-- loginForm.jsp -->
<meta charset="EUC-KR">
<title>로그인화면</title>
	<%
		request.setCharacterEncoding("euc-kr");
		
	%>
	<script type="text/javascript">
		
		function checkValue() {
			//eval()함수 :문자열을 코드로 변환해주는 함수
			var inputForm=eval("document.loginInfo");
			if(!inputForm.id.value){
				alert("아이디를 입력해주세요");
				inputForm.id.focus();
				return false;
			}
			if(!inputForm.id.password.value){
				alert("비밀번호를 입력해주세요");
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
      	<p style="text-align: center;">로그인</p></font></b>
      <br><br><br>
   		<!-- onsubmit 속성: submit버튼의 이벤츠 캐치한후 js함수 호출함.
   				전송전에 처리할 코드가 있을 때  -->
      <form name="loginInfo" method="post" action="MemberLoginAction.do" 
            onsubmit="return checkValue()">

         <table>
            <tr>
               <td bgcolor="skyblue">아이디</td>
               <td><input type="text" name="id" maxlength="50"></td>
            </tr>
            <tr>
               <td bgcolor="skyblue">비밀번호</td>
               <td><input type="password" name="password" maxlength="50"></td>
            </tr>
            <tr>
            	<td colspan="2" style="text-align: center;"> 
            		  <input type="submit" value="로그인"/>
         <input type="button" value="취소" onclick="goFirstForm()">
            	</td>
            </tr>
         </table>
         <br>
       
      </form>
</body>
</html>