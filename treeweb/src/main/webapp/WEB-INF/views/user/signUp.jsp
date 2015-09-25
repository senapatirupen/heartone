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
	<form:form commandName="signUp" action="/treeweb/show" method="POST">
First Name: <form:input path="firstName" name="firstName" />
Middle Name: <form:input path="middleName" name="middleName" />
Last Name: <form:input path="lastName" name="lastName" />
User Name: <form:input path="userName" name="userName" />
Mobile Number: <form:input path="mobileNumber" name="mobileNumber" />
Email Id: <form:input path="emailId" name="emailId" />
Password: <form:input path="password" name="password" />
Re-Password: <form:input path="rePassword" name="rePassword" />
		<form:button>Submit</form:button>
	</form:form>


</body>
</html>