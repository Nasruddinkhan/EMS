<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<style type="text/css">
.txt>thead>tr>th, .txt>tbody>tr>td {
	text-align: center;
}
th
{
    background-color: 2b8790;
    color: white;
}
}
</style>
</head>
<body>
	<!-- /.row -->
	<div class="row">
		<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
			<div class="card">
				<div class="header" style="background: #3299a9">
					<h2>In Out Time</h2>
				</div>
			<div class="body">
				  <div class="table-responsive">    
			  	<c:choose>
								<c:when test="${!empty loginDetails}">
			<table class="table  table-bordered txt">
				<thead>
					<tr>
						<th>Date</th>
						<th>Day</th>
						<th>In Time</th>
						<th>Out Time</th>
						<th>Hours</th>
						<th>Late Mark</th>
						<th>Remark</th>
					</tr>
				</thead>
				<tbody>
				
									<c:forEach items="${loginDetails}" var="loginDetails">
					<tr class="${loginDetails.status} ">
						<td>${loginDetails.date}</td>
						<td>${loginDetails.day}</td>
						<td>${loginDetails.inTime}</td>
						<td>${loginDetails.outTime}</td>
						<td>${loginDetails.hours}</td>
						<td>${loginDetails.lateMark}</td>
						<td>${loginDetails.remark}</td>
					</tr>
</c:forEach>
			
			</table>
			</c:when>
							</c:choose>
			<table align="center">
				<tr>
					<td>
						 <a href="${pageContext.request.contextPath}/InOutTime/inTime.do" class="btn btn-success" role="button"><i class="fa fa-sign-out" aria-hidden="true"></i>Login</a>
					</td>
					<td>
						 <a href="${pageContext.request.contextPath}/InOutTime/outTime.do" class="btn btn-danger" role="button"><i class="fa fa-power-off" aria-hidden="true"></i>LogOut</a>
					</td>
				</tr>
			</table>
			</div>
			</div>
		</div>
		</div>
	</div>
</body>
</html>
</c:when>
	<c:otherwise>
		<c:redirect url="/login.do" />
	</c:otherwise>
</c:choose>