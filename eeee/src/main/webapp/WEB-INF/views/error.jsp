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
..��û ó�� �������� ������ �߻��Ͽ����ϴ�.<br>
���� �ð� ���� ������ �ذ��ϵ��� �ϰٽ��ϴ�.
<p>
���� Ÿ��: <%= exception.getClass().getName() %></p>
�����޽���:<b><%= exception.getMessage() %></b>
<hr>
<a href= "${pageContext.request.contextPath }">Home</a>

</body>
</html>