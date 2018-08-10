<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%@ page isErrorPage = true" %>
..요청 처리 과정에서 에러가 발생하엿습니다.<br>
빠른 시간 내에 문제를 해결하도록 하겟습니다.
<p>
에러 타입: <%= exception.getClass().getName() %></p>
에러메시지:<b><%= exception.getMessage() %></b>
<hr>
<a href= "${pageContext.request.contextPath }">Home</a>

</body>
</html>