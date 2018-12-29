<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link
	href="${pageContext.request.contextPath}/resources/css/view_emp.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<style type="text/css">
label {
   font-weight:normal !important;
}
body  {
    background-image: url("paper.gif");
    background-color: #cccccc;
}
.input-group {
	margin-bottom: 0px !important;
	width: 100% !important;
}.container{
width: 65% !important;
margin-top:  10%;
}
body {
	font-family: Arival ! important;
	font-size: 14px ! important;
	line-height: 1.42857143 ! important;
	color: #5a4444 ! important;
	background-color: #fff ! important;
}
</style>
</head>
<body>

	<form:form method="POST"
		action="${pageContext.request.contextPath}/employee/save.do"
		class="form-horizontal" modelAttribute="user">
		<div class="container ">
			<div class="panel panel-default">
				<div class="panel-body">
				<div class="row">
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<div class="card">
						<div class="header">
							<h2 align="center">Add Employees</h2>
						</div>
					</div>
				</div>
			</div>
					<div class="row form-group">
						<label class="col-sm-2 control-label" for="firstName">First
							Name </label>
						<div class="col-sm-4">
							<div class="input-group">

								<form:input path="firstName" id="firstName"
									placeholder="Enter First Name" class="form-control input-sm required" />
							</div>
						</div>
						<label class="col-sm-2 control-label" for="Last Name">Last
							Name </label>
						<div class="col-sm-4">
							<div class="input-group">
								<form:input path="lastName" id="lastName"
									placeholder="Enter last Name" class="form-control input-sm" />
							</div>
						</div>
					</div>
					<div class="row form-group">
						<label class="col-sm-2 control-label" for="fatherName">Email
							Address </label>
						<div class="col-sm-10">
							<div class="input-group">

								<form:input path="email" id="fatherName"
									placeholder="Enter First Name" class="form-control input-sm" />
							</div>
						</div>
						<%-- <label class="col-sm-2 control-label" for="Mother Name">Mother
							Name </label>
						<div class="col-sm-4">
							<div class="input-group">
								<form:input path="motherName" id="lastName"
									placeholder="Enter Mother Name" class="form-control input-sm" />
							</div>
						</div> --%>
					</div>
					<div class="row form-group">
						<label class="col-sm-2 control-label" for="d.o.b">D.O.B </label>
						<div class="col-sm-4">
							<div class="input-group">
								<form:input path="dateOfBirth" id="dateOfBirth"
									placeholder="Date Of Birth" class="form-control input-sm" />
							</div>
						</div>
						<label class="col-sm-2 control-label" for="D.O.J">D.O.J </label>
						<div class="col-sm-4">
							<div class="input-group">
								<form:input path="doj" id="doj" Placeholder='Date Of Joining' class="form-control input-sm" />
							</div>
						</div>
					</div>
						<div class="row form-group">
						<label class="col-sm-2 control-label" for="password">Password</label>
						<div class="col-sm-4">
							<div class="input-group">
								<form:input path="password" id="pass"
									placeholder="Password" class="form-control input-sm" />
							</div>
						</div>
						<label class="col-sm-2 control-label" for="conformPassword">Conform Password </label>
						<div class="col-sm-4">
							<div class="input-group">
								<form:input path="Password" id="cnfPass" placeholder="Conform Password" class="form-control input-sm" />
							</div>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label"></label>
						<div class="col-sm-2">
							<br>
							<button type="submit" class="btn btn-primary" id="saveBtn">
								Submit</button>
							<br>
						</div>
					</div>
				</div>
			</div>
		</div>
	</form:form>
</body>
</html>