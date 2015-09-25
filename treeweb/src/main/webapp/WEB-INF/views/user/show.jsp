<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>treeweb</title>
</head>
<body>
User Detail
	<hr>

	<form:form action="/treeweb/signUp" method="POST">
		<table>
			<tr>
				<td><input type="submit" value="signUp" />Sign Up</td>
			</tr>
		</table>
	</form:form>
	<hr>
</body>
</html>