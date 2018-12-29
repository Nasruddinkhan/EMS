<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
 .table-responsive { 
     overflow-x: initial !important; 
 } 

/* 
thead { 
   display: table;
   width: calc(100% - 17px);
 } 

tbody { 
   display: block; 
   max-height: 200px; 
   overflow: scroll; 
 } 
 */
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

			<div class="card">
				<div class="header"  style="background: #3299a9">
					<h2>Employees</h2>
				</div>
				<div>
				<div class="row">
		<div class="col-md-12">
			<fieldset class="scheduler-border">
				<legend class="scheduler-border">Search Employee :</legend>
				<form:form modelAttribute="search" action="" class="form-inline"
					role="form" id="searchform">
					<div class="form-group">
						<label for="email">From Date</label>
						<form:input type="text" class="form-control input-sm"
							id="fromDate" path="fromDate" />
					</div>
					<span id="fromspanDate"></span>
					<div class="form-group">
						<label for="email"> To Date </label>
						<form:input type="text" class="form-control input-sm" id="toDate"
							path="toDate" />
					</div>
					<span id="tospanDate"></span>

					<div class="form-group">
						<label for="role"> Role </label>
						<form:select path="userRole" class="form-control input-md">
							<form:option value="">----SELECT----</form:option>
							<form:options items="${roleList}" itemValue="ROLE_ID"
								itemLabel="ROLE_NAME" />
						</form:select>
					</div>

					<button type="submit" class="btn btn-success btn-sm" id="find">
						Find</button>
					<button type="reset" class="btn btn-danger btn-sm" id="clear">
						Clear</button>
					<a class="btn btn-primary btn-sm"
						href="${pageContext.request.contextPath}/employee/showAddEmpPage.do">Add
						Employees</a>
					<%-- 	<a class="btn btn-warning"
												style="font-size: 11px "
												href="${pageContext.request.contextPath}/employee/editEmployeeById/${user.id}.do">
													<span class="glyphicon glyphicon-edit" style="padding: 3px;"> Active</span>
											</a>
											<a class="btn btn-danger"
												style="font-size: 11px"
												href="${pageContext.request.contextPath}/employee/editEmployeeById/${user.id}.do">
													<span class="glyphicon glyphicon-trash" style="padding: 3px;"> In Active</span>
											</a> --%>
				</form:form>
			</fieldset>
		</div>
	</div>
	<div class="row">
		<div class="col-sm-12">
			<div class="panel-body" style="padding: 0px;">
				<div class="table-responsive">
					<table id="dataTables-example"
						class="table table-striped table-bordered table-hover">
						<thead>
							<tr>
							    <th >ID</th>
								<th >Name</th>
								<th >Mobile No</th>
								<th >Email</th>
								 <th >Aadhaar No</th>
								<th >Pan No</th>
								<th >Status</th> 
								<th>Action</th>
								
							</tr>
						</thead>
						<tbody>
							<c:choose>
								<c:when test="${!empty userList}">
									<c:forEach items="${userList}" var="user">
										<tr>
										<td>
										<c:out value="${user.id }"></c:out>
										</td>
											<td><c:out value="${user.firstName} - ${user.lastName}" /></td>
											<td><c:out value="${user.mobileNo}" /></td>
											<td><c:out value="${user.email}" /></td>
											<td><c:out value="${user.aadhaarNo}" /></td>
											<td><c:out value="${user.panNo}" /></td>
											<td><c:out value="${user.status=='N'?'InActive':'Y'}" /></td> 
											 <td><a class="btn btn-primary" style="font-size: 11px"
												onclick="viewStudentDetails()" href="#" data-toggle="modal"
												data-target="#myModal"> <span
													class="glyphicon glyphicon-tags"></span>
											</a>
											 <a class="btn btn-warning"
												style="font-size: 11px"
												href="${pageContext.request.contextPath}/employee/editEmployeeById/${user.id}.do">
													<span class="glyphicon glyphicon-edit"></span>
											</a>
											
											<a class="btn btn-danger"
												style="font-size: 11px"
												href="${pageContext.request.contextPath}/employee/deleteEmployeeById/${user.id}.do"
												onclick="return confirm('Are you sure \n You want to delete this record?')">
													<span class="glyphicon glyphicon-trash"></span>
											</a> 
											
											</td> 
										</tr>
									</c:forEach>
								</c:when>
							</c:choose>
						</tbody>
					</table>
				</div>
			</div>
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
    	$('#dataTables-example').DataTable();
    });
    </script>

	
</body>
</html>