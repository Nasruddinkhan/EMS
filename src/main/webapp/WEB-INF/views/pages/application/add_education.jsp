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
	<link href="${pageContext.request.contextPath}/css/jquery-ui.css" rel="stylesheet">
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



th
{
    background-color: 2b8790;
    color: white;
}
.input-md {
	margin: 0 0 0 0px !important;
	border-radius: 5px;
	border: 1px solid #dddddd;
	box-shadow: 0px 0px 1px 0px rgba(24, 189, 240, 0.3);
	font-size: 16px;
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
<form:form method="post" action="${pageContext.request.contextPath}/application/saveEducation.do"    modelAttribute="educationBean" autocomplete="off">
<form:hidden path="educationId" id="educationId"/>
<input type="hidden" value="${courseTitleStr}" id="courseTitleStr">
	<div class="row">
		<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
			<div class="card">
				<div class="header" style="background: #3299a9">
					<h2>Education</h2>
				</div>
				<div>
					<div class="body row">
						<div class="row">
							<div class="form-group col-md-6">
								<label for="courseTitle">Course Title <font color="red">*</font></label> <form:select path="courseTitle" id="courseTitle" class="form-control input-md">
										<form:option value="">SELECT</form:option>
										<form:options items="${courseTittleList}"
											itemLabel="CODE_DESCRIPTION" itemValue="CODE_TYPE" />
									</form:select>
							</div>
							<div class="form-group col-md-6">
								<label for="subject">Specialization Or Major Subject <font color="red">*</font></label> <form:input path="subject"
									id="subject" class="form-control input-md" />
							</div>
						</div>
						<div class="row">
							<%-- <div class="form-group col-md-6">
								<label for="email">Institute*</label> <form:input  path="institute" id="institute"
									class="institute-control input-md" />
							</div> --%>
							<div class="form-group col-md-6">
								<label for="subject">Institute  <font color="red">*</font></label> <form:input path="institute"
									id="institute" class="form-control input-md" />
							</div>
							<div class="form-group col-md-6">
								<label for="Course Type">Course Type <font color="red">*</font></label> 
									<form:select path="courseType" id="courseType" class="form-control input-md">
										<form:option value="">SELECT</form:option>
										<form:options items="${courseTypeList}"
											itemLabel="CODE_DESCRIPTION" itemValue="CODE_TYPE" />
									</form:select>
							</div>
						</div>
						<div class="row">
							
							<div class="form-group col-md-3">
								<label for="email">Duration <font color="red">*</font></label>  <form:input id="fromDate" placeholder="From Date"  path="fromDate" type="text"
									class="form-control date-picker input-md"/>
							</div>
							
							
							<div class="form-group col-md-3">
								<label for="email">&nbsp;</label> <form:input id="toDate" path="toDate" type="text" placeholder="To Date"
									class="form-control date-picker input-md"/>
							</div>
							<div class="form-group col-md-5">
								<label for="email">Percentage <font color="red">*</font></label> <form:input id="percentage" path="percentage"
									class="form-control input-md"/>
							</div>
							<div class="form-group col-md-1">
								<label for="email">&nbsp;</label>
								<p style="font-size: 30px;">%</p>
							</div>
						</div>
						<div class="row">
							<div class="form-group col-md-5  col-md-offset-3">
								
								<button type="submit" class="btn-lg btn-primary-outline"
									id="saveBtn">Submit</button> 
								<button type="button" class="btn-lg btn-primary-outline"
									id="saveBtn">Reset</button> 
							</div>
						</div>
					</div>
				</div>
					<div class="row">
		<div class="col-sm-12">
			<div class="panel-body" style="padding: 0px;">
				<div class="table-responsive">
				<c:if  test="${!empty detailEducationlist}">
					<table id="dataTables-example"
						class="table table-striped table-bordered table-hover">
						<thead>
							<tr>
							    <th >Sr.No</th>
								<th >CourseTitle</th>
								<th >Major Subject</th>
								<th >Institute</th> 
								<th>Course Type</th>
								<th>Duration</th>
								<th>Percentage</th>
								<th>Action</th>
							</tr>
						</thead>
						<tbody>
							<c:choose>
								<c:when test="${!empty detailEducationlist}">
									<c:forEach items="${detailEducationlist}" var="edlist"  varStatus="status">
										<tr>
										<td>
										${status.count}
										</td>
											<td>${edlist.courseTitle== 'HS001'?'HSC':edlist.courseTitle=='SS001'?'SSC':edlist.courseTitle=='GR001'?'GRADUATION'
											:edlist.courseTitle=='PGR01'?'POST GRADUATION':'OTHER'}</td>
											<td>${edlist.subject}</td>
											<td>${edlist.institute}</td>
											<td>${edlist.courseType=='PT'?'Part Time':'Full Time'}</td>
											<td>${edlist.fromDate} - ${edlist.toDate} </td>
											<td>${edlist.percentage}</td> 
											<td> <a class="btn btn-warning"
												style="font-size: 11px"
												href="#" onclick="editEducationDtl('${edlist.educationId}','${edlist.courseTitle}',
												'${edlist.subject}','${edlist.courseType}','${edlist.fromDate}','${edlist.toDate}',${edlist.percentage},'${edlist.institute}')">
													<span class="glyphicon glyphicon-edit"></span>
											</a></td>
										</tr>
									</c:forEach>
								</c:when>
							</c:choose>
						</tbody>
					</table>
					</c:if>
				</div>
			</div>
		</div>
	</div> 
			</div>
		</div>
	</div>
</form:form>
	<div class="row">
		<div class="form-group col-md-5  col-md-offset-7">
			<button type="button" class="btn-lg btn-primary-outline" id="saveBtn">Save
				& Continues Work Details</button>

		</div>
	</div>
	
 <%-- <script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>  --%>
<%--  <script src="${pageContext.request.contextPath}/external/jquery/jquery.js"></script> --%>
<script src="${pageContext.request.contextPath}/js/jquery-ui.js"></script> 
	<script type="text/javascript">
	 function editEducationDtl(educationId,courseTitle,
		subject,courseType,fromDate,toDate,percentage, institute) {
		console.log(educationId,courseTitle,
				subject,courseType,fromDate,toDate,percentage, institute);
		$('#fromDate').val(fromDate);
		$('#toDate').val(toDate);
		$('#educationId').val(educationId);
		$('#courseTitle').val(courseTitle);
		$('#subject').val(subject);
		$('#courseType').val(courseType);
		$('#percentage').val(percentage);
		$('#institute').val(institute);
		//$('#saveBtn').val('Update');
		 $("#saveBtn").text( 'Update');
		
	}
	/*  $(function() {
		    $('#datepicker').datepicker( {
		        changeMonth: true,
		        changeYear: true,
		        showButtonPanel: true,
		        dateFormat: 'MM yy',
		        onClose: function(dateText, inst) { 
		            $(this).datepicker('setDate', new Date(inst.selectedYear, inst.selectedMonth, 1));
		        }
		    });
		}); */
		
	 $(function() {
		    $('#toDate').datepicker( {
		        changeMonth: true,
		        changeYear: true,
		        /* showButtonPanel: true, */
		        dateFormat: 'yy-mm-dd'
		    });
		    $('#fromDate').datepicker( {
		        changeMonth: true,
		        changeYear: true,
		        /* showButtonPanel: true, */
		        dateFormat: 'yy-mm-dd'
		    });
		});
		$(document).ready(function(){
			var courseTitle = $('#courseTitleStr').val();
			console.log(courseTitle);
		if(!isEmpty(courseTitle)){
			var courTitle = courseTitle.split(':');
			$('#courseTitle option').each(function(){
				for (var i = 0; i < courTitle.length; i++) { 
				    if($(this).val()==courTitle[i]){
				    	$("#courseTitle option[value=" + courTitle[i] + "]").attr('disabled',true);
				    }
				}
			});
		}
		});
		function isEmpty(val){
		    return (val === undefined || val == null || val.length <= 0) ? true : false;
		}
	</script>
	
</body>
</html>