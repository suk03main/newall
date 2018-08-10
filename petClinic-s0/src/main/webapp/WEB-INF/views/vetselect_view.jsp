<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>verselect - SQL + JAVA </p>
 <form action="vetselect" method="get">
   <select name="specialty_id" >         
     <c:forEach items="${vetselect_view}" var="dto">
       <option value="${dto.id}"> ${dto.name} </option>
     </c:forEach>
   </select>
   <input type="submit" value="전공검색"> &nbsp;&nbsp; 
 </form>
<p>verselect - SQL + JAVA </p>
 <form action="vetselect" method="get">
   <select name="specialty_id" >         
     <c:forEach items="${vetselect_view}" var="dto">
       <option value="${dto.id}"> ${dto.name} </option>
     </c:forEach>
   </select>
   <input type="submit" value="전공검색"> &nbsp;&nbsp; 
 </form>

</body>
</html>