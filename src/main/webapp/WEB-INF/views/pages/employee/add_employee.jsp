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
<style type="text/css">
.input-group {
	margin-bottom: 0px !important;
	width: 100% !important;
}
.input-md, .input-md{
       margin: 0 0 0 0px !important;
       border-radius: 5px;
    border: 1px solid #dddddd;
    box-shadow: 0px 0px 1px 0px rgba(24,189,240,0.3);
    font-size: 0.875em;
    color: #444444;
    padding: 7px 12px 7px 12px;
    height: 40px;
}
</style>
</head>
<body>
	<div class="row">
		<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
			<div class="card">
				<div class="header">
					<c:choose>
						<c:when test="${user.id> 0}">
							<h2>Update Employees</h2>
						</c:when>
						<c:otherwise>
							<h2>Add Employees</h2>
						</c:otherwise>
					</c:choose>
				</div>
			</div>
		</div>
	</div>
	<div class="container-fluid ">
		<form:form method="POST"
			action="${pageContext.request.contextPath}/employee/save.do"
			class="form-horizontal" modelAttribute="user">
			<c:choose>
				<c:when test="${user.id> 0}">
					<form:hidden path="id"/>
					<form:hidden path="address.address_id"/>
					<form:hidden path="password"/>
					<form:hidden path="loginId"/>
					<form:hidden path="encodeStr"/>
				</c:when>
			</c:choose>
			<div class="row form-group">
				<label class="col-sm-2 control-label" for="firstName">First
					Name </label>
				<div class="col-sm-4">
					<div class="input-group">

						<form:input path="firstName" id="firstName"
							placeholder="Enter First Name" class="form-control input-md" />
					</div>
				</div>
				<label class="col-sm-2 control-label" for="Last Name">Last
					Name </label>
				<div class="col-sm-4">
					<div class="input-group">
						<form:input path="lastName" id="lastName"
							placeholder="Enter last Name" class="form-control input-md" />
					</div>
				</div>
			</div>
			<div class="row form-group">
				<label class="col-sm-2 control-label" for="fatherName">Father
					Name </label>
				<div class="col-sm-4">
					<div class="input-group">

						<form:input path="fatherName" id="fatherName"
							placeholder="Enter First Name" class="form-control input-md" />
					</div>
				</div>
				<label class="col-sm-2 control-label" for="Mother Name">Mother
					Name </label>
				<div class="col-sm-4">
					<div class="input-group">
						<form:input path="motherName" id="lastName"
							placeholder="Enter Mother Name" class="form-control input-md" />
					</div>
				</div>
			</div>
			<div class="row form-group">
				<label class="col-sm-2 control-label" for="d.o.b">D.O.B </label>
				<div class="col-sm-4">
					<div class="input-group">
						<form:input path="dateOfBirth" id="dateOfBirth"
							placeholder="Date Of Birth" class="form-control input-md" />
					</div>
				</div>
				<label class="col-sm-2 control-label" for="D.O.J">D.O.J </label>
				<div class="col-sm-4">
					<div class="input-group">
						<form:input path="doj" id="doj" class="form-control input-md" />
					</div>
				</div>
			</div>

			<div class="row form-group">
				<label class="col-sm-2 control-label" for="Email">Email </label>
				<div class="col-sm-4">
					<div class="input-group">
						<form:input path="email" id="email" placeholder="Enter email"
							class="form-control input-md" />
					</div>
				</div>
				<label class="col-sm-2 control-label" for="Mobile No">Mobile
					No </label>
				<div class="col-sm-4">
					<div class="input-group">
						<form:input path="mobileNo" id="mobileNo"
							placeholder="Enter Mobile No" class="form-control input-md" />
					</div>
				</div>
			</div>
			<div class="row form-group">
				<label class="col-sm-2 control-label" for="Roles">Roles </label>
				<div class="col-sm-4">
					<div class="input-group">
						<form:select path="roles" class="form-control input-md">
							<form:option value="">----SELECT----</form:option>
							<form:options items="${roleList}" itemValue="ROLE_ID"
								itemLabel="ROLE_NAME" />
						</form:select>
					</div>
				</div>
				<label class="col-sm-2 control-label" for="Alternate No">Alternate
					No </label>
				<div class="col-sm-4">
					<div class="input-group">
						<form:input path="alternateNo" id="alternateNo"
							placeholder="Enter Mobile No" class="form-control input-md" />
					</div>
				</div>
			</div>
			<div class="row form-group">
				<label class="col-sm-2 control-label" for="pan No">Pan No </label>
				<div class="col-sm-4">
					<div class="input-group">

						<form:input path="panNo" id="panNo" placeholder="Enter First Name"
							class="form-control input-md" />
					</div>
				</div>
				<label class="col-sm-2 control-label" for="aadhaar No">Aadhaar
					No </label>
				<div class="col-sm-4">
					<div class="input-group">
						<form:input path="aadhaarNo" id="aadhaarNo"
							placeholder="Enter last Name" class="form-control input-md" />
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="card">
					<div class="header">
						<h2>Address</h2>
					</div>
				</div>
			</div>
			<div class="row form-group">
				<label class="col-sm-2 control-label" for="state">State </label>
				<div class="col-sm-4">
					<div class="input-group">

						<form:input path="address.state" id="state"
							placeholder="Enter First Name" class="form-control input-md" />
					</div>
				</div>
				<label class="col-sm-2 control-label" for="city">City </label>
				<div class="col-sm-4">
					<div class="input-group">
						<form:input path="address.city" id="city"
							placeholder="Enter last Name" class="form-control input-md" />
					</div>
				</div>
			</div>
			<div class="row form-group">
				<label class="col-sm-2 control-label" for="district">District
				</label>
				<div class="col-sm-4">
					<div class="input-group">

						<form:input path="address.district" id="district"
							placeholder="Enter First Name" class="form-control input-md" />
					</div>
				</div>
				<label class="col-sm-2 control-label" for="pincode">Pincode
				</label>
				<div class="col-sm-4">
					<div class="input-group">
						<form:input path="address.pincode" id="pincode"
							placeholder="Enter last Name" class="form-control input-md" />
					</div>
				</div>
			</div>
			<div class="row form-group">
				<label class="col-sm-2 control-label" for="Address">Address
				</label>
				<div class="col-sm-4">
					<div class="input-group">
						<form:textarea path="address.addres" class="form-control input-md"
							placeholder="Enter First Name" />
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
		</form:form>
		  <!-- Modal -->
  <!-- Modal -->
 
  
</div>
</body>
</html>