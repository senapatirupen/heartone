<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Tree app</title>
<spring:url value="../../resources/js/jquery-2.1.4.min.js"
	var="jqueryMinJs" />
<spring:url value="../../resources/bootstrap/js/bootstrap.min.js"
	var="bootstrapMinJs" />
<spring:url value="../../resources/angularjs/angular.min.js"
	var="angularMinJs" />
<spring:url value="../../resources/angularjs/angular-ui-router.min.js"
	var="angular-ui-routerMinJs" />
<spring:url value="../../resources/css/main.css" var="mainCss" />
<link href="${bootstrapMinCss}" rel="stylesheet">
<link href="${mainCss}" rel="stylesheet">
</head>
<body>
	<div>
		<nav class="navbar navbar-default">
			<div class="container">
				<div class="container page-header" style="margin-top: 0px;">
					<ul class="nav nav-pills pull-right">
						<li role="presentation"><a href="#">24*7 Customer Care</a></li>
						<li role="presentation"><a href="#"><i
								class="glyphicon glyphicon-map-marker"></i>Track Order</a></li>
						<li role="presentation"><a href="#"><i
								class="glyphicon glyphicon-bell"></i></a></li>
						<li role="presentation"><a href="#" data-toggle="modal"
							data-target="#myModal">Sign Up</a></li>
						<li role="presentation"><a href="#">Login</a></li>

					</ul>
					<h1>
						Example page header <small>Subtext for header</small>
					</h1>
				</div>
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
						aria-expanded="false">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<!-- <a class="navbar-brand" href="#">Brand</a> -->
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active"><a ui-sref="home">Home <span
								class="sr-only">(current)</span></a></li>

						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" aria-haspopup="true"
							aria-expanded="false">Plant <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a ui-sref="home.plant">Action</a></li>
								<li><a href="#">Another action</a></li>
								<li><a href="#">Something else here</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="#">Separated link</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="#">One more separated link</a></li>
							</ul></li>

						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" aria-haspopup="true"
							aria-expanded="false">Seed <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="#">Action</a></li>
								<li><a href="#">Another action</a></li>
								<li><a href="#">Something else here</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="#">Separated link</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="#">One more separated link</a></li>
							</ul></li>

						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" aria-haspopup="true"
							aria-expanded="false">Port &amp; Planter <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="#">Action</a></li>
								<li><a href="#">Another action</a></li>
								<li><a href="#">Something else here</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="#">Separated link</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="#">One more separated link</a></li>
							</ul></li>

						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" aria-haspopup="true"
							aria-expanded="false">Pebbles <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="#">Action</a></li>
								<li><a href="#">Another action</a></li>
								<li><a href="#">Something else here</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="#">Separated link</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="#">One more separated link</a></li>
							</ul></li>

						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" aria-haspopup="true"
							aria-expanded="false">Fertilizer <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="#">Action</a></li>
								<li><a href="#">Another action</a></li>
								<li><a href="#">Something else here</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="#">Separated link</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="#">One more separated link</a></li>
							</ul></li>

						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" aria-haspopup="true"
							aria-expanded="false">Soil <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="#">Action</a></li>
								<li><a href="#">Another action</a></li>
								<li><a href="#">Something else here</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="#">Separated link</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="#">One more separated link</a></li>
							</ul></li>
					</ul>
					<form class="navbar-form navbar-right" role="search">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Search">
						</div>
						<button type="submit" class="btn btn-default">Submit</button>
					</form>

				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container -->
			<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
				aria-labelledby="myModalLabel" ng-controller="SignUpController">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
							<h4 class="modal-title" id="myModalLabel">Welcome</h4>
						</div>
						<form>
							<div class="modal-body">
								<div class="form-group">
									<label for="exampleInputEmail1">User Name</label> <input
										type="text" ng-model="user.userName" class="form-control"
										name="userName" placeholder="User Name" />
								</div>
								<div class="form-group">
									<label for="exampleInputEmail1">Mobile Number</label> <input
										type="text" ng-model="user.mobileNumber" name="mobileNumber"
										class="form-control" placeholder="Mobile Number">
								</div>
								<div class="form-group">
									<label for="exampleInputEmail1">DOB</label> <input type="date"
										class="form-control" ng-model="user.dob" name="dob"
										placeholder="DOB">
								</div>
								<div class="form-group">
									<label for="exampleInputEmail1">Email Id</label> <input
										type="email" ng-model="user.emailId" name="emailId"
										class="form-control" placeholder="Email Id">
								</div>
								<div class="form-group">
									<label for="exampleInputPassword1">Password</label> <input
										type="password" class="form-control" ng-model="user.password"
										name="password" placeholder="Password">
								</div>
								<div class="form-group">
									<label for="exampleInputPassword1">Re-Password</label> <input
										type="password" class="form-control"
										ng-model="user.repassword" name="repassword"
										placeholder="Re-Password">
								</div>
							</div>
							<div class="modal-footer">
								<button type="reset" class="btn btn-default">Reset</button>
								<button type="button" class="btn btn-default"
									ng-click="createUser()">Submit</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</nav>
	</div>
	<div>
		<div ui-view="plantcontent">
			<div class="container">
				<section>
					<div class="row">
						<div class="col-lg-4">
							<div class="list-group">
								<a href="#" class="list-group-item active"> Cras justo odio
								</a> <a href="#" class="list-group-item">Dapibus ac facilisis in</a>
								<a href="#" class="list-group-item">Morbi leo risus</a> <a
									href="#" class="list-group-item">Porta ac consectetur ac</a> <a
									href="#" class="list-group-item">Vestibulum at eros</a>
							</div>
						</div>
						<div class="col-lg-4">
							<blockquote>
								<p>Will you find me</p>
								<footer>Tree Willson</footer>
							</blockquote>
						</div>
						<div class="col-lg-4">
							<blockquote>
								<p>Will you find me</p>
								<footer>Tree Willson</footer>
							</blockquote>
						</div>
					</div>
					<!-- end row -->
				</section>
			</div>
		</div>
	</div>
	<div>
		<div class="container page-footer">
			<div class="panel panel-default">
				<!-- Default panel contents -->
				<div class="panel-heading">TeddyGu Quick Connections</div>

				<!-- Table -->
				<table class="table">
					<tr>
						<th><h4>HELP</h4></th>
						<th><h4>TEDDYGU</h4></th>
						<th><h4>KEEP IN TOUCH</h4></th>
						<th><h4>POLICIES</h4></th>
					</tr>
					<tr>
						<td><a href="http://www.google.com/">Payments</a></td>
						<td><a href="http://www.google.com/">Contact Us</a></td>
						<td><a href="http://www.google.com/">Facebook</a></td>
						<td><a href="http://www.google.com/">Terms of use</a></td>
					</tr>
					<tr>
						<td><a href="http://www.google.com/">Saved Cards</a></td>
						<td><a href="http://www.google.com/">About Us</a></td>
						<td><a href="http://www.google.com/">Twitter</a></td>
						<td><a href="http://www.google.com/">Security</a></td>
					</tr>
					<tr>
						<td><a href="http://www.google.com/">Shipping</a></td>
						<td><a href="http://www.google.com/">Careers</a></td>
						<td><a href="http://www.google.com/">Google+</a></td>
						<td><a href="http://www.google.com/">Privacy</a></td>
					</tr>
					<tr>
						<td><a href="http://www.google.com/">Cancellation Returns</a></td>
						<td><a href="http://www.google.com/">Blog</a></td>
						<td><a href="http://www.google.com/">Youtube</a></td>
						<td><a href="http://www.google.com/">Infringement</a></td>
					</tr>
					<tr>
						<td><a href="http://www.google.com/">FAQ</a></td>
						<td><a href="http://www.google.com/">Sell on TeddyGu</a></td>
					</tr>
					<tr>
						<td><a href="http://www.google.com/">Report Infringement</a></td>
						<td><a href="http://www.google.com/">Services</a></td>
					</tr>
				</table>
			</div>
		</div>
	</div>
	<script src="${jqueryMinJs}"></script>
	<script src="${bootstrapMinJs}"></script>
	<script src="${angularMinJs}"></script>
	<script src="${angular-ui-routerMinJs}"></script>
</body>
</html>