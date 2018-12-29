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
    <!-- DataTables CSS -->
    <link href="${pageContext.request.contextPath}/vendor/datatables-plugins/dataTables.bootstrap.css" rel="stylesheet">
    <!-- DataTables Responsive CSS -->
    <link href="${pageContext.request.contextPath}/vendor/datatables-responsive/dataTables.responsive.css" rel="stylesheet">
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
				<div class="header" style="background: #3299a9">
					<h2>Work Remark</h2>
				</div>
				<div class="body">
			<fieldset class="scheduler-border">
				<legend class="scheduler-border">Search Work Status :</legend>
				<form:form modelAttribute="search" action="" class="form-inline"
					role="form" id="searchform">
					<div class="form-group">
						<label for="email">From Date</label>
						<form:input type="text" class="form-control input-md"
							id="fromDate" path="fromDate" />
					</div>
					<span id="fromspanDate"></span>
					<div class="form-group">
						<label for="email"> To Date </label>
						<form:input type="text" class="form-control input-md" id="toDate"
							path="toDate" />
					</div>
					<span id="tospanDate"></span>
					<button type="submit" class="btn btn-success btn-sm" id="find">
						Find</button>
					<button type="reset" class="btn btn-danger btn-sm" id="clear">
						Clear</button>
					<a class="btn btn-primary btn-sm"
						href="${pageContext.request.contextPath}/InOutTime/addworkRemark.do">Add
						Remarks</a>
				</form:form>
			</fieldset>
			
	<c:choose>
								<c:when test="${!empty workRemarkList}">
	<div class="row">
		<div class="col-sm-12">
			<div class="panel-body" style="padding: 0px;">
				<div class="table-responsive">
					<table id="dataTables-example" 
						class="table table-striped table-bordered table-hover">
						<thead>
							<tr>
								<th>Work ID</th>
								<th>Work Date</th>
								<th>Course</th>
								<th>Work-Desc</th>
								<th>SP-HR</th>
								<th>Action</th>
							</tr>
						</thead>
						<tbody>
									<c:forEach items="${workRemarkList}" var="workRemark">
										<tr>
											<td><c:out value="${workRemark.workId}" /></td>
											<td><c:out value="${workRemark.workDate}" /></td>
											<td><c:out value="${workRemark.courseMaster.courseName}" /></td>
											<td><c:out value="${workRemark.workDescription}" /></td>
											<td><c:out value="${workRemark.spendHours}" /></td>
											<td> <a class="btn btn-warning" style="font-size: 11px"
												href="${pageContext.request.contextPath}/InOutTime/editWorkRemark/${workRemark.workId}.do" >
													<span class="glyphicon glyphicon-edit"></span>
											</a></td>
										</tr>
									</c:forEach>
							
						</tbody>
					</table>
				</div>
			</div>
		</div>
		  </div>
		</c:when>
	</c:choose>
				</div>
			</div>
		</div>
	</div>
	
	 <!-- jQuery -->
 <script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
 <script src="${pageContext.request.contextPath}/vendor/datatables/js/jquery.dataTables.js" charset="utf8"></script>
<%--   <script src="${pageContext.request.contextPath}/vendor/bootstrap/js/bootstrap.min.js"></script>
 --%>  <script src="${pageContext.request.contextPath}/vendor/datatables-plugins/dataTables.bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/vendor/datatables-responsive/dataTables.responsive.js"></script> 
  <script type="text/javascript">
    $(document).ready(function() {
    	$('#dataTables-example').DataTable({
			 "pageLength": 5
		});
    });
  
    </script>
</body>
		</html>
	</c:when>
	<c:otherwise>
		<c:redirect url="/login.do" />
	</c:otherwise>
</c:choose>