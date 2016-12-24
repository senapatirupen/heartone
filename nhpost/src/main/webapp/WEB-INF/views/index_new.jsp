<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>NHPost Website</title>
<spring:url value="/resources/css/style.css" var="mainCss" />
<spring:url value="/resources/css/bcss.css" var="bootStrapCss" />
<spring:url value="/resources/js/jquery-2.1.4.min.js" var="jqueryMinJs" />
	
<script src="${jqueryMinJs}"></script>
<link href="${mainCss}" rel="stylesheet">
<link href="${bootStrapCss}" rel="stylesheet">
<%-- <link href="<c:url value='../../resources/css/style.css' />" rel="stylesheet"></link> --%>
<!-- <script>
$(document).ready(function(){
	$('#body div div').css('float','none');
	//$("#body div div").css("margin","0px 2px")
	 var n = $('#body div div').css("float");
	console.log(n);
});
</script> -->
</head>
<body>
	<div id="header">
		<div class="section">
			<div class="logo">
				<a href="index.html">NHPost</a>
			</div>
			<ul>
				<li class="selected"><a href="<spring:url value="/"/>">home</a></li>
				<li><a href="about.html">about</a></li>
				<li><a href="contact.html">contact</a></li>
			</ul>
		</div>
	</div>
	<div id="body">
		<%-- <form:form action="index_new" method="POST" commandName="NewPost">
			<div id="postContainer" style="margin-top: 1.5%; margin-left: 3.5%;">
				<span class="label-text"><b>Enter Your Post</b></span> 
				<form:label cssClass="label-text" path="postTitle">Title</form:label> 
				<span class="form-input">
						<form:input path="postTitle" cssClass="text simpleTextField"/>
				</span> 
				<form:label cssClass="label-text" path="postText">Post Text</form:label>
					<span class="form-textArea"> 
					<form:textarea path="postText" cssClass="postContainer textArea" />
				</span>
				<span
					style="width: auto; padding-left: 30%; padding-bottom: 4%; text-align: center; float: right; clear: both;">
					<input type="submit" class="btn" style="width: auto;" value="Post" />
				</span>

			</div>

		</form:form> --%>
		<div class='panel panel-primary dialog-panel' style="border: 0px;">
			<div class='panel-body'>
				<form:form cssClass='form-horizontal' role='form' action="index_new" method="POST" commandName="NewPost">
					<div class='form-group' style="width: auto;">
						<!-- <label class='control-label col-md-2 col-md-offset-2'
							style="margin: inherit;" for='id_adults'>Guests</label> -->
						<div class='col-md-8' style="margin: auto;">
							<div class='col-md-2' style="margin: auto; width: 460px;">
								<div class='form-group internal'>
									<form:input path="postTitle" cssClass='form-control col-md-8' id='id_adults'
										placeholder='Title' type='text'/>
								</div>
							</div>
						</div>
					</div>
					<div class='form-group' style="width: auto;">
						<!-- <label class='control-label col-md-2 col-md-offset-2'
							style="margin: inherit; width: auto;" for='id_comments'>Comments</label> -->
						<div class='col-md-6'
							style="margin: auto; width: 584px; padding-top: 2px; padding-left: 10px;">
							<form:textarea path="postText" cssClass='form-control' id='id_comments'
								placeholder='Write your post...(200 chars max)' rows='3'/>
						</div>
					</div>
					<div class='form-group'>
						<div class='col-md-3'
							style="margin-left: 455px; padding-top: 5px; padding-bottom: 5px;">
							<button class='btn btn-default' style='float: right'
								type='submit'>Post</button>
						</div>
					</div>
				</form:form>
			</div>
		</div>
		<%-- <div class='panel panel-primary dialog-panel' style="border: 0px;">
			<div class='panel-body'>
				<form class='form-horizontal' role='form'>
					<div class='form-group' style="width: auto;">
						<!-- <label class='control-label col-md-2 col-md-offset-2'
							style="margin: inherit;" for='id_adults'>Guests</label> -->
						<div class='col-md-8' style="margin: auto;">
							<div class='col-md-2' style="margin: auto; width: 460px;">
								<div class='form-group internal'>
									<input class='form-control col-md-8' id='id_adults'
										placeholder='Title' type='text'>
								</div>
							</div>
						</div>
					</div>
					<div class='form-group' style="width: auto;">
						<!-- <label class='control-label col-md-2 col-md-offset-2'
							style="margin: inherit; width: auto;" for='id_comments'>Comments</label> -->
						<div class='col-md-6'
							style="margin: auto; width: 584px; padding-top: 2px; padding-left: 10px;">
							<textarea class='form-control' id='id_comments'
								placeholder='Write your post...' rows='3'></textarea>
						</div>
					</div>
					<div class='form-group'>
						<div class='col-md-3'
							style="margin-left: 455px; padding-top: 5px; padding-bottom: 5px;">
							<button class='btn btn-default' style='float: right'
								type='submit'>Post</button>
						</div>
					</div>
				</form>
			</div>
		</div> --%>
		<%-- <ul>
			<li><b>Enter Your Post</b> <form:form method="POST" commandName="NewPost"
					action="/index_new/addPost">
					<table>
						<tr>
							<td><form:label path="postTitle">Title</form:label></td>
							<td><form:input path="postTitle" /></td>
						</tr>
						<tr>
							<td><form:label path="postText">Post Text</form:label></td>
							<td><form:textarea path="postText" /></td>
						</tr>
						<tr>
							<td colspan="2"><input type="submit" value="Submit Post" /></td>
						</tr>
					</table>
				</form:form></li>
		</ul> --%>
		<ul>
			<li><b>best hairstylists</b>
				<p>Our website templates are created with inspiration, checked
					for quality and originality and meticulously sliced and coded.
					What’s more, they’re absolutely free!</p></li>
			<%-- <li><b>featured hairstyle</b>
				<p>Our website templates are created with inspiration, checked
					for quality and originality and meticulously sliced and coded.
					What’s more, they’re absolutely free!</p></li>
			<li><b>hair care</b>
				<p>Our website templates are created with inspiration, checked
					for quality and originality and meticulously sliced and coded.
					What’s more, they’re absolutely free!</p></li>
			<li><b>we "hair" you</b>
				<p>Our website templates are created with inspiration, checked
					for quality and originality and meticulously sliced and coded.
					What’s more, they’re absolutely free!</p></li>
			<li><b>we "hair" you</b>
				<p>
					<c:out value="${postValue.postTitle}" />
					and
					<c:out value="${welcome}" />
				</p>
				<p>
					<c:forEach items="${postList}" var="posts">
						<P>
							<c:out value="${posts.postTitle}" />
						</P>
						<p>
							<c:out value="${posts.postText}" />
						</p>
					</c:forEach>
				</p></li> --%>
		</ul>
		<c:if test="${not empty postList}">
			<ul>
				<c:forEach var="posts" items="${postList}">
					<li><b>${posts.postTitle}</b>
						<p>${posts.postText}</p></li>
				</c:forEach>
			</ul>
		</c:if>
	</div>
	<%-- <c:if test="${not empty postList}">
		<ul>
			<c:forEach var="posts" items="${postList}">
				<li><P>${posts.postTitle}</P>
					<p>${posts.postText}</p></li>
			</c:forEach>
		</ul>
	</c:if> --%>

	<div id="footer">
		<div>
			<div class="connect">
				<a href="http://freewebsitetemplates.com/go/twitter/" id="twitter">twitter</a>
				<a href="http://freewebsitetemplates.com/go/facebook/" id="facebook">facebook</a>
				<a href="http://freewebsitetemplates.com/go/googleplus/"
					id="googleplus">googleplus</a> <a
					href="http://pinterest.com/fwtemplates/" id="pinterest">pinterest</a>
			</div>
			<p>&copy; copyright 2016 | all rights reserved.</p>
		</div>
	</div>
	
</body>
</html>