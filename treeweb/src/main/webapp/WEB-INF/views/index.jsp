<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>teddygu</title>
</head>
<body>
	<hr>
	<form:form action="/treeweb/welcome" method="POST">
		<table>
			<tr>
				<td><input type="submit" value="welcome page" />Welcome Page</td>
			</tr>
		</table>
	</form:form>
	<hr>
</body>
</html>