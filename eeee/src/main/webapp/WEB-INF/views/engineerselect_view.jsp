<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table width="600">
	<tr>
		<td colspan="2"> 기술자별 </td>
	</tr>
	<tr>
		<td>
		<form action="engineerselect" method="get">
		<select name="major_id">
			<c:forEach items="${engineer_view}" var="dto">
				<option value="${dto.id}"> ${dto.name} </option>
			</c:forEach>
		</select>
		</td>
		
		<td> <input type="submit" value="전공검색"></td>
		</form>
	</tr>
</table>

</body>
</html>