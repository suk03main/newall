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
<form action ="student" method="post">
Post Student Id:<input type="text"name="id"/>
Post Student pw:<input type="text"name="pw"/>

<input type="submit" value = "전송하기"/>
</form>
<p> Get 이용
<form action ="student" method="Get">
Get Student Id:<input type="text"name="id"/>
Get Student pw:<input type="text"name="pw"/>

<input type="submit" value = "전송하기"/>
</form>
student 
<p>Id:${studetnId }</p>
<p>pw:${studetnPw }</p>

</body>
</html>