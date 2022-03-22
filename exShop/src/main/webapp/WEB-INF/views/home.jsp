<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<p><a href="/display/gdsList">상품목록</a></p>

<c:if test = "${member_info == null}">
	<p><a href="/member/login">로그인</a></p>
	<p><a href="/member/signUp">회원가입</a></p>
</c:if>

<c:if test = "${member_info != null}">
	<p><a href="/member/logout">로그아웃</a></p>
</c:if>

</body>
</html>
