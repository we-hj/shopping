<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>

<h2>LOGIN</h2>

<form method="post">
	<table>
		<tr>
			<td>ID</td>
			<td><input type="text" name="userId" required="required" /></td>
		</tr>
		<tr>
			<td>PW</td>
			<td><input type="password" name="userPw" required="required" /></td>
		</tr>
	</table>
	
	<button type="submit">로그인</button>
</form>

<hr>
<p><a href="/">home</a></p>
<!-- 아이디 찾기 -->
<!-- 비밀번호 찾기 -->
<p><a href="/member/signUp">회원가입</a></p>

</body>
</html>