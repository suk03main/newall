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

<c:forEach items="${vetselect3}" var="dto2">
	  <tr>
	    <td>${dto2.last_name }, ${dto.first_name }</td>
	  </tr>
 </c:forEach>

</body>
</html>