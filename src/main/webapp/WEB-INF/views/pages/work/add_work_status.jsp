<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:choose>
	<c:when test="${!empty users}">
		<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
		<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link
	href="${pageContext.request.contextPath}/resources/css/view_emp.css"
	rel="stylesheet">
	  <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin 2 - Bootstrap Admin Theme</title>
  <!-- Bootstrap Core CSS -->
    <link href="${pageContext.request.contextPath}/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="${pageContext.request.contextPath}/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- DataTables CSS -->
    <link href="${pageContext.request.contextPath}/vendor/datatables-plugins/dataTables.bootstrap.css" rel="stylesheet">

    <!-- DataTables Responsive CSS -->
    <link href="${pageContext.request.contextPath}/vendor/datatables-responsive/dataTables.responsive.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="${pageContext.request.contextPath}/dist/css/sb-admin-2.css" rel="stylesheet">
    <!-- Custom Fonts -->
    <link href="${pageContext.request.contextPath}/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<style type="text/css">
.input-group {
	margin-bottom: 0px !important;
	width: 100% !important;
}
.table-responsive {
    overflow-x: hidden !important;;
}
.input-md, .input-sm{
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
						<c:when test="${workRemark.workId> 0}">
							<h2>Update Work Employees</h2>
						</c:when>
						<c:otherwise>
							<h2>Add Work Remark</h2>
						</c:otherwise>
					</c:choose>
				</div>
			</div>
		</div>
	</div>
	<div class="container-fluid ">
		<form:form method="POST"
			action="${pageContext.request.contextPath}/InOutTime/workRemarkSave.do"
			class="form-horizontal" modelAttribute="workRemark">
			<c:choose>
				<c:when test="${workRemark.workId> 0}">
					<form:hidden path="workId"/>
				</c:when>
			</c:choose>
			<div class="row form-group">
				<label class="col-sm-2 control-label" for="Work">Select Date
				</label>
				<div class="col-sm-4">
					<div class="input-group">
						<form:input path="workDate" id="WorkDate" placeholder="Work Date"
							class="form-control input-sm" />
					</div>
				</div>
				<label class="col-sm-2 control-label" for="Work">Spend Hours
				</label>
				<div class="col-sm-4">
					<div class="input-group">
						<form:input path="spendHours" id="spendHours"
							placeholder="Spend Hours" class="form-control input-sm" />
					</div>
				</div>

			</div>
			<div class="row form-group">
				<label class="col-sm-2 control-label" for="Work">Topic</label>
				<div class="col-sm-4">
					<div class="input-group">
								<form:select path="courseMaster.courseId" id="courseId" class="form-control input-sm"  placeholder="Work Date">
						<form:option value="">-----------------------PLEASE SELECT-----------------------	</form:option>
							<form:options items="${courseList}" itemValue="courseId"
								itemLabel="courseName" />
						</form:select>
					</div>
				</div>
				<label class="col-sm-2 control-label" for="WorkDescription">Work
					Description </label>
				<div class="col-sm-4">
					<div class="input-group">
						<form:textarea rows="3" cols="4" path="WorkDescription" id="WorkDescription"
							class="form-control input-sm"></form:textarea>
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
	</c:when>
	<c:otherwise>
		<c:redirect url="/login.do" />
	</c:otherwise>
</c:choose>