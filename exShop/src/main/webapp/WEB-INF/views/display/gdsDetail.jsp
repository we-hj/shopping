<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품상세</title>
</head>
<body>

${gds.largeCtgr}/${gds.smallCtgr}
<hr>
${gds.img}<br>
${gds.gdsName}<br>
${gds.brand}<br>
${gds.price}<br>
${gds.stock}<br>
${gds.gdsRegDate}
<hr>
${gds.detail}

<hr>
<p><a href="/">home</a></p>
<p><a href="/display/gdsList">상품목록</a></p>

</body>
</html>