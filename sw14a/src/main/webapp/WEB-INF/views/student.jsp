<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<p> post 이용
<form action ="student">
Post Student Id:<input type="text"name="id"/>
Post Student pw:<input type="text"name="pw"/>

<input type="submit" value = "전송하기"/>
</form>
student 
<p>Id:${studetnId }</p>
<p>pw:${studetnPw }</p>

</body>
</html>