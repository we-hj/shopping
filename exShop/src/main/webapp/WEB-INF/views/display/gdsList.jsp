<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품목록</title>
</head>
<body>

<c:set var="i" value="1" />
<c:set var="j" value="4" />

<!--
largeCtgr
smallCtgr
stock
-->

<table>
<c:forEach items="${gdslist}" var="list">

	<c:if test="${i%j == 1}"><tr></c:if>
	
		<td>
			${list.img}<br>
			<a href="/display/gdsDetail?n=${list.gdsId}">${list.gdsName}</a><br>
			${list.brand}<br>
			${list.price}
		</td>
		
	<c:if test="${i%j == 0}"></tr></c:if>
	
	<c:set var="i" value="${i+1}" />
	
</c:forEach>
</table>

<hr>
<p><a href="/">home</a></p>

</body>
</html>