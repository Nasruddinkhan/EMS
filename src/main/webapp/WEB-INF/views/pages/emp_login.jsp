<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <meta http-equiv="refresh" content="3"> -->
<title>EMS</title>
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">

<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-5 col-md-offset-4">
				<div class="login-panel panel panel-default"
					style="border-color: midnightblue;">
					<div class="panel-body" style="box-shadow: 2px -1px 25px grey;">
						<form:form action="${pageContext.request.contextPath}/login.do"
							method="post" modelAttribute="user">
							<legend>Login</legend>
							<div class="imgwrapper"></div>
							<div class="form-group">
								<form:input path="loginId" placeholder="User Name" value="nasruddinkhan44@gmail.com"
									class="required form-control " />
								<form:errors path="loginId" cssClass="error" />
							</div>
							<div class="form-group">
								<form:password path="password" placeholder="password" value="password"
									cssClass="form-control" />
								<form:errors path="password" cssClass="error" />
							</div>
							<div class="checkbox">
								<label> <input name="remember" type="checkbox"
									value="Remember Me">Remember Me
								</label> 
								<label> <a href="${pageContext.request.contextPath}/login/register.do"> <strong>register</strong>
								</a>
								</label>
							</div>
							<div>
								<p style="color: red;" id="errormsg">${Error}</p>
							</div>
							<!-- Change this to a button or input when using this as a form -->
							<input type="submit" value="Submit"
								class="btn_validate formSubmit btn btn-lg btn-success btn-block" />
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>