<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>브라우저 종류/버전체크</title>
</head>
<body>
	<!-- User Agent 문자열 -->
<!-- 1. Internet Explorer 11
Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; rv:11.0) like Gecko  
 
1-1. Internet Explorer 10
Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.1; WOW64; Trident/6.0)
 
2. Safari
Mozilla/5.0 (Windows NT 6.2; WOW64) AppleWebKit/534.57.2 (KHTML, like Gecko) Version/5.1.7 Safari/534.57.2
 
3. Chrome
Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebK`it/537.36 (KHTML, like Gecko) Chrome/30.0.1599.101 Safari/537.36 
 
4. Opera
Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/30.0.1599.101 Safari/537.36 OPR/17.0.1241.53 
 
4-1. Opera 구버전
Opera/9.80 (Windows NT 6.1; WOW64; U; ko) Presto/2.10.229 Version/11.62
 
 
5. Firefox
Mozilla/5.0 (Windows NT 6.3; WOW64; rv:24.0) Gecko/20100101 Firefox/24.0  -->
 
  
<% 
String browser = "";
String userAgent = request.getHeader("User-Agent");
if (userAgent.indexOf("Trident") > 0 || userAgent.indexOf("MSIE") > 0) { 
    browser = "IE";
} else if (userAgent.indexOf("Opera") > 0) { 
    browser = "Opera";
} else if (userAgent.indexOf("Firefox") > 0) { 
    browser = "Firefox";
} else if (userAgent.indexOf("Safari") > 0) { 
    if (userAgent.indexOf("Chrome") > 0) { 
         browser = "Chrome";
     } else {  browser = "Safari"; 
    }
} 
/* JSP에서 도큐먼트 출력문 out객체 : PHP의 echo문 */
out.print("<br><h4>"+ userAgent + "</h4>");
out.print("<br><h1>"+ browser + "</h1>");
%>
</body>
</html>