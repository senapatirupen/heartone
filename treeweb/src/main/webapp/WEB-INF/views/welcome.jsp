<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>treeweb</title>
</head>
<body>
	<hr>
	<form:form action="/treeweb/signUp" method="POST">
		<table>
			<tr>
				<td><input type="submit" value="signUp" />Sign Up</td>
			</tr>
		</table>
	</form:form>
	<hr>
	<form:form action="/treeweb/signIn" method="POST">
		<table>
			<tr>
				<td><input type="submit" value="signIn" />Sign In</td>
			</tr>
		</table>
	</form:form>
	<hr>
    <a href="<c:url value="/user/signUp"/>">Register</a>
</body>
</html>