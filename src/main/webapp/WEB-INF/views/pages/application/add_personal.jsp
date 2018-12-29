<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<c:choose>
	<c:when test="${!empty users}">
		<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link
	href="${pageContext.request.contextPath}/resources/css/view_emp.css"
	rel="stylesheet">
<style type="text/css">
body {
	margin: 0;
	font-family: 'Roboto';
	font-size: 14px;
	background: #455A64;
}

/* fallback */
@font-face {
	font-family: 'Material Icons';
	font-style: normal;
	font-weight: 400;
	src: url(../resources/img/flUhRq6tzZclQEJ-Vdg-IuiaDsNc.woff2)
		format('woff2');
}


.input-md {
	margin: 0 0 0 0px !important;
	border-radius: 5px;
	border: 1px solid #dddddd;
	box-shadow: 0px 0px 1px 0px rgba(24, 189, 240, 0.3);
	font-size: 0.875em;
	color: #444444;
	padding: 7px 12px 7px 12px;
	height: 40px;
}

label {
	margin-bottom: 0px !important;
	font-weight: 700 !important;
}

.btn-primary-outline {
	background-color: #ffffff;
	color: #BBB;
	border: 1px solid #BBB;
	outline-color: #BBB;
}
</style>
</head>
<body>
	<div class="row">
		<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
			<!-- <div class="card">
				<div class="header">
					<h2>Personal</h2>
				</div>
			</div> -->
		</div>
		<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
			<div class="card">
				<div class="header" style="background:  #3299a9">
					<h2>Personal Details</h2>
				</div>
				<div class="body row">
					<form:form autocomplete="on" modelAttribute="personal"
						action="${pageContext.request.contextPath}/application/save_personal.do">
						<form:hidden path="empID" value="${sessionScope.empID}" />
						<div class="row">
							<div class="form-group col-md-4">
								<label for="email">First Name <font color='red'>*</font></label>
								<form:input path="firstName" class="form-control input-md" />
							</div>
							<div class="form-group col-md-4">
								<label for="email">Middle Name:</label>
								<form:input path="middleName" class="form-control input-md" />
							</div>
							<div class="form-group col-md-4">
								<label for="email">Last Name:</label>
								<form:input path="lastName" class="form-control input-md" />
							</div>
						</div>

						<div class="row">
							<div class="form-group col-md-4">
								<label for="email">Father's Name</label>
								<form:input path="fatherFirstName" class="form-control input-md" />
							</div>
							<div class="form-group col-md-4">
								<label for="email">&nbsp;</label>
								<form:input path="fatherMiddleName"
									class="form-control input-md" />
							</div>
							<div class="form-group col-md-4">
								<label for="email">&nbsp;</label>
								<form:input path="fatherLastName" class="form-control input-md" />
							</div>
						</div>
						<div class="row">
							<div class="form-group col-md-4">
								<label for="email">Date Of Birth:</label>
								<form:input path="dateOfBirth" class="form-control input-md" />
							</div>

							<div class="form-group col-md-4">
								<label for="email">Pan no</label>
								<form:input path="panNumber" class="form-control input-md" />
							</div>
							<div class="form-group col-md-4">
								<label for="email">Aadhaar no;</label>
								<form:input path="aadharNumber" class="form-control input-md" />
							</div>

						</div>

						<div class="row">
							<div class="form-group col-md-4">
								<label for="email">Gender</label>
								<form:select path="gender" class="form-control input-md">
									<form:option value="">----SELECT----</form:option>
									<form:option value="M">Male</form:option>
									<form:option value="F">Female</form:option>
								</form:select>
							</div>

							<div class="form-group col-md-4">
								<label for="email">Nationality</label>
								<form:input path="nationality" class="form-control input-md" />
							</div>
							<div class="form-group col-md-4">
								<label for="email">Email</label>
								<form:input path="email" class="form-control input-md" />
							</div>

						</div>

						<div class="row">
							<div class="form-group col-md-4">
								<label for="email">Linked Profile URL</label>
								<form:input path="linkedProfileUrl"
									class="form-control input-md" />
							</div>

							<div class="form-group col-md-4">
								<label for="email">Twitter Profile URL</label>
								<form:input path="twiterProfileUrl"
									class="form-control input-md" />
							</div>
							<div class="form-group col-md-4">
								<label for="email">Facebook Profile URL</label>
								<form:input path="facebookPrifileUrl"
									class="form-control input-md" />
							</div>
						
						</div>

						<div class="row">
							<div class="form-group col-md-6  col-md-offset-3">
								<button type="submit" class="btn-lg btn-primary-outline"
									id="saveBtn">Submit</button>
								<button type="button" class="btn-lg btn-primary-outline"
									id="saveBtn">Reset</button>
							</div>
						</div>
					</form:form>
				</div>
			</div>	
		</div>
		<%-- <div class="col-md-12 col-md-12"
		style="padding-left: 0px; padding-right: 0px;">
		<div class="panel-group wrap" id="accordion" role="tablist"
			aria-multiselectable="true">
			<div class="panel">
				<div class="panel-heading" role="tab" id="headingOne">
					<h4 class="panel-title">
						<a role="button" data-toggle="collapse" data-parent="#accordion"
							href="#collapseOne" aria-expanded="true"
							aria-controls="collapseOne"> Personal Details </a>
					</h4>
				</div>

				<div id="collapseOne" class="panel-collapse collapse in"
					role="tabpanel" aria-labelledby="headingOne">
					<div class="panel-body">
						<form:form autocomplete="on" modelAttribute="personal" action="${pageContext.request.contextPath}/application/save_personal.do">
						<form:hidden path="empID" value="${sessionScope.empID}"/>
							<div class="row">
								<div class="form-group col-md-4">
									<label for="email">First Name <font color='red'>*</font></label>
									<form:input path="firstName" 
										class="form-control input-md"   />
								</div>

								<div class="form-group col-md-4">
									<label for="email">Middle Name:</label>
									<form:input path="middleName" 
										class="form-control input-md" />
								</div>
								<div class="form-group col-md-4">
									<label for="email">Last Name:</label>
									<form:input path="lastName"  
										class="form-control input-md" />
								</div>
							</div>

							<div class="row">


								<div class="form-group col-md-4">
									<label for="email">Father's Name</label>
									<form:input path="fatherFirstName"  
										 class="form-control input-md" />
								</div>
								<div class="form-group col-md-4">
									<label for="email">&nbsp;</label>
									<form:input path="fatherMiddleName"
										 class="form-control input-md" />
								</div>
								<div class="form-group col-md-4">
									<label for="email">&nbsp;</label>
									<form:input path="fatherLastName"
										class="form-control input-md" />
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-4">
									<label for="email">Date Of Birth:</label>
									<form:input path="dateOfBirth"  
										class="form-control input-md" />
								</div>

								<div class="form-group col-md-4">
									<label for="email">Pan no</label>
									<form:input path="panNumber" 
										class="form-control input-md" />
								</div>
								<div class="form-group col-md-4">
									<label for="email">Aadhaar no;</label>
									<form:input path="aadharNumber" 
										class="form-control input-md" />
								</div>

							</div>

							<div class="row">
								<div class="form-group col-md-4">
									<label for="email">Gender</label>
									<form:select path="gender" class="form-control input-md" > 
										<form:option value="">----SELECT----</form:option>
										<form:option value="M">Male</form:option>
										<form:option value="F">Female</form:option>
									</form:select>
								</div>

								<div class="form-group col-md-4">
									<label for="email">Nationality</label>
									<form:input path="nationality" 
										class="form-control input-md" />
								</div>
								<div class="form-group col-md-4">
									<label for="email">Email</label>
									<form:input path="email"  
										class="form-control input-md" />
								</div>

							</div>

							<div class="row">
								<div class="form-group col-md-4">
									<label for="email">Linked Profile URL</label>
									<form:input path="linkedProfileUrl"
										 class="form-control input-md" />
								</div>

								<div class="form-group col-md-4">
									<label for="email">Twitter Profile URL</label>
									<form:input path="twiterProfileUrl"
										 class="form-control input-md" />
								</div>
								<div class="form-group col-md-4">
									<label for="email">Facebook Profile URL</label>
									<form:input path="facebookPrifileUrl"
										 class="form-control input-md" />
								</div>

							</div>
							<div class="row">
								<div class="form-group col-md-6  col-md-offset-3">
									<button type="submit" class="btn-lg btn-primary-outline"
										id="saveBtn">Submit</button>
									<button type="button" class="btn-lg btn-primary-outline"
										id="saveBtn">Reset</button>
								</div>
							</div>
						</form:form>
					</div>
					<!-- end of panel -->
				</div>
				<div class="panel">
					<div class="panel-heading" role="tab" id="headingTwo">
						<h4 class="panel-title">
							<a class="collapsed" role="button" data-toggle="collapse"
								data-parent="#accordion" href="#collapseTwo"
								aria-expanded="false" aria-controls="collapseTwo"> Present
								Address </a>
						</h4>
					</div>
					<div id="collapseTwo" class="panel-collapse collapse"
						role="tabpanel" aria-labelledby="headingTwo">
						<form:form autocomplete="on" modelAttribute="address" action="${pageContext.request.contextPath}/application/save_address.do">
						
						<div class="panel-body">
							<div class="row">
								<div class="form-group col-md-12">
									<label for="email">Address Line 1</label> <form:input path="addressLine1"
										class="form-control input-md"/>
								</div>
								<div class="form-group col-md-12">
									<label for="email">Address Line 2</label> <form:input path="addressLine2"
										class="form-control input-md"/>
								</div>
							</div>

							<div class="row">
								<div class="form-group col-md-6">
									<label for="email">Country</label> <form:input path="country"
										class="form-control input-md"/>
								</div>
								<div class="form-group col-md-6">
									<label for="email">State</label> <form:input path="firstname"
										class="form-control input-md"/>
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-6">
									<label for="email">City</label> <form:input path="city"
										class="form-control input-md"/>
								</div>
								<div class="form-group col-md-6">
									<label for="email">PinCode</label> <form:input path="ptnCode"
										class="form-control input-md"/>
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-6  col-md-offset-3">
									<button type="button" class="btn-lg btn-primary-outline"
										id="saveBtn">Submit</button>
									<button type="button" class="btn-lg btn-primary-outline"
										id="saveBtn">Reset</button>
								</div>
							</div>
						</div>
						</form:form>
					</div>
				
				</div>
			</div>
		</div> --%>
		<div class="row">
			<div class="form-group col-md-5  col-md-offset-7">
				<button type="button" class="btn-lg btn-primary-outline"
					id="saveBtn">Save & Continues Education Details</button>

			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
	
</script>
		</html>
	</c:when>
	<c:otherwise>
		<c:redirect url="/login.do" />
	</c:otherwise>
</c:choose>