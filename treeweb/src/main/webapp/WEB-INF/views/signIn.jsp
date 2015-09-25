<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>TeddyGu</title>
</head>
<body>
	Hi
	<form:form commandName="signIn" action="/treeweb/welcome" method="POST">
User Name: <form:input path="userName" name="userName" />
Email Id: <form:input path="emailId" name="emailId" />
Password: <form:input path="password" name="password" />
		<form:button>Submit</form:button>
	</form:form>
</body>
</html>