<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "c:url value ="j_spring_security_check"/>method = "post">
ID: <input type="text" name="j_username"id="j_username"/>
pw: <input type="text" name="j_password"id="j_password"/>
<input type ="submit" value="전송">
</form>





</body>
</html>