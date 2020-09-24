<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>POST 입력폼</title>
</head>
<body>
	<form action="/jsp_examples/ex08.jsp" method="post"> 
		이름 : <input type="text" name="name" size="10" /> <br />
		주소 : <input type="text" name="address" size="30" /> <br />
		좋아하는 동물 : <br />
			<input type="radio" name="pet" value="dog" />강아지 <br />
			<input type="radio" name="pet" value="cat" />고양이 <br />
			<input type="radio" name="pet" value="pig" />애완돼지 <br />
		<br />
		<input type="submit" value="전송" />
	</form>
</body>
</html>



