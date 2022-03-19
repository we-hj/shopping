<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>

<h2>SIGN UP</h2>

<form method="post">
	<table>
		<tr>
			<td>아이디</td>
			<td><input type="text" name="userId" required="required" /></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="userPw" required="required" /></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="userName" required="required" /></td>
		</tr>
		<tr>
			<td>생년월일</td>
			<td><input type="text" name="birthday" placeholder="yyyy-mm-dd" required="required" /></td>
		</tr>
		<tr>
			<td>성별</td>
			<td>
				<input type="radio" name="gender" value="M" required="required" />남성
				<input type="radio" name="gender" value="F" />여성
			</td>
		</tr>
		<tr>
			<td>이메일</td>
			<td><input type="email" name="email" placeholder="example@email.com" required="required" /></td>
		</tr>
		<tr>
			<td>연락처</td>
			<td><input type="tel" name="phone" placeholder="000-0000-0000" required="required" /></td>
		</tr>
	</table>
	
	<button type="submit">회원가입</button>
</form>

<hr>
<p><a href="/">home</a></p>

</body>
</html>