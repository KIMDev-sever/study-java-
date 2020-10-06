<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String contentPage=request.getParameter("contentPage");
	if(contentPage==null){
		contentPage="FirstView.jsp";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>메인화면</title>
<style>
      /* 
      레이아웃 전체 가운데 정렬 태그  
      - margin:0 auto 0 auto;(시계방향으로 위, 오른쪽, 아래, 왼쪽)
      왼쪽, 오른쪽 바깥여백을 auto로 주면 중앙정렬이 된다. 
      
      전체를 감싸주는 태그 #wrap 
      */
      #wrap {
         width: 800px;
         margin: 0 auto 0 auto;
      }
      
      #header {
         text-align: center;
         width: 800px;
         height: 150px;
         background-color: #92FFFF;
         padding: 60px 0px;
      }
      
      #main {
         float: left;
         width: 800px;
         height: 500px;
         background-color: #FFCA6C;
         text-align:center;
         vertical-align: middle;
      }
      #footer {
         clear: left;
         width: 800px;
         height: 60px;
         background-color: #7DFE74;
      }
   </style>
</head>
<body>
	<!-- 여러페이지에서 공통적으로 사용하는 페이지(일부)는 iniclude로 추가한다. 
		동일헤더 동일헤더
		컨텐츠1 컨텐츠 2
	-->
	<div id="wrap">
		<div id="header">
			<jsp:include page="Header.jsp"></jsp:include>
		</div>
		<div id="main">
		<jsp:include page="<%=contentPage %>"></jsp:include>
		</div>
		<div id="footer">
			<br>
			<strong>회원가입게시판 입니다. 주인백.</strong>
		</div>
	</div>
</body>
</html>