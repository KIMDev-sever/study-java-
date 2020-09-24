<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Web.xml 초기화 파라미터 가져오기</title>
</head>
<body>
	<!-- web.xml은 웹애플리케이션의 초기화 구성파일 -->
	<!-- web.xml수정하면,웹서버(웹컨테이터)를 재시작해야됨 (최신톰캣을 자동재시작 -->
	초기화 파라미터 목록:
   <ul>
      <%
         java.util.Enumeration<String> initParamEnum = 
             application.getInitParameterNames();
      
         while( initParamEnum.hasMoreElements() ) {
            String initParamName = initParamEnum.nextElement();
            out.println( initParamName );
      %>
            <li>
               <%= initParamName %> = 
               <%= application.getInitParameter( initParamName )  %>
            </li>
      <%
         }
      %>
      
          
   </ul>
</body>
</html>