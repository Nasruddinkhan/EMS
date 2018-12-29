<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="com.jsoft.ems.model.User" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
User users = (User)session.getAttribute("users");
%>
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
	body > img {
    width: 50px;
    height: 50px;
    display: block;
}
#fullsize {
    position: absolute;
}
#fullsize.hidden {
    display: none;
}
	
	</style>
</head>
<body>
	<!-- /.row -->
	<div class="row">
		<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
			<div class="card">
				<div class="header">
					<h2>My Profile</h2>
				</div>
				<div class="body row">
					<div class="card-image">
						<img
							src="${pageContext.request.contextPath}/resources/img/user-profile-bg2.jpg">
					</div>
					<div class="card-content">
						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
							<div class="card-profile-image">
								<img src="${users.encodeStr}" class="circle  responsive-img" id="userImg">
								<p>${users.id} : ${users.firstName}-${users.lastName}</p>
								<div class="clearfix"></div>
								<br>
							</div>
						</div>
						<div class="col-lg-4 col-md-2 col-sm-6 col-xs-12">
							<p>
								Email ID <span> ${users.email}</span>
							</p>
						</div>
						<div class="col-lg-2 col-md-2 col-sm-6 col-xs-12">
							<p>
								Mobile No <span> ${users.mobileNo} </span>
							</p>
						</div>
						<div class="col-lg-2 col-md-2 col-sm-6 col-xs-12">
							<p>
								Pan No <span> ${users.panNo}</span>
							</p>
						</div>
						<div class="col-lg-2 col-md-2 col-sm-6 col-xs-12">
							<p>
								Aadhar No <span> ${users.aadhaarNo}</span>
							</p>
						</div>
						<div class="col-lg-2 col-md-2 col-sm-6 col-xs-12">
							<p>
								DOB<span>${users.dateOfBirth}</span>
							</p>
						</div>
						<div class="col-lg-2 col-md-2 col-sm-6 col-xs-12">
							<p>
								DOJ<span>${users.dateOfBirth}</span>
							</p>
						</div>
						<div class="col-lg-2 col-md-2 col-sm-6 col-xs-12">
							<p>
								Father Name<span>${users.fatherName}</span>
							</p>
						</div>
						<div class="col-lg-2 col-md-2 col-sm-6 col-xs-12">
							<p>
								Mother Name<span>${users.motherName}</span>
							</p>
						</div>
						<div class="col-lg-2 col-md-2 col-sm-6 col-xs-12">
							<p>
								Altername Number<span>${users.alternateNo}</span>
							</p>
						</div>
						<div class="col-lg-2 col-md-2 col-sm-6 col-xs-12">
							<p>
								Gender<span>${users.gender}</span>
							</p>
						</div>
						<div class="col-lg-2 col-md-2 col-sm-6 col-xs-12">
							<p>
								Status<span>${users.status == 'N'?"Inactive":'Active'}</span>
							</p>
						</div>
					</div>
				</div>
			</div>
			<div id="fullsize"></div>
			<!-- <div class="card">
				<div class="card-content">
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
						<h4>Emergency</h4>
					</div>
					<div class="col-lg-3 col-md-2 col-sm-3 col-xs-12">
						<p>
							Mobile No<span>9594758485 </span>
						</p>
					</div>

					<div class="col-lg-4 col-md-3 col-sm-6 col-xs-12">
						<p>
							Person<span> Jalalluddin Khan(Brother) </span>
						</p>
					</div>

					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
						<hr>
						<h4>Professional Details</h4>
					</div>
					<div class="col-lg-1 col-md-2 col-sm-3 col-xs-12">
						<p>
							Id <span> 17 </span>
						</p>
					</div>


					<div class="col-lg-2 col-md-2 col-sm-3 col-xs-12">
						<p>
							Card No <span> 102101002020 </span>
						</p>
					</div>

					<div class="col-lg-2 col-md-2 col-sm-3 col-xs-12">
						<p>
							Joining Date <span> 2017-01-16 </span>
						</p>
					</div>


					<div class="col-lg-2 col-md-2 col-sm-3 col-xs-12">
						<p>
							PF Account<span> 100664878472 </span>
						</p>
					</div>


					<div class="col-lg-2 col-md-2 col-sm-3 col-xs-12">
						<p>
							HR Manager<span> VIJAY K LOKHANDE </span>
						</p>
					</div>


					<div class="col-lg-3 col-md-2 col-sm-3 col-xs-12">
						<p>
							Reporting Manager <span> SRINIVAS CHILIVERI </span>
						</p>
					</div>

				</div>


				<div class="clearfix"></div>

			</div> -->
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<script type="text/javascript">
	var $tooltip = $('#fullsize');
	var $userImg = $('#userImg');
	$('#userImg').on('mouseover', function() {
	    var img = this,
	        $img = $(img),
	        offset = $img.offset();
	    $tooltip.css({
	        'top': offset.top,
	        'left': offset.left
	    })
	    .append($img.clone())
	    .removeClass('hidden');
	});
	$userImg.on('mouseout', function() {
	    $tooltip.empty().addClass('hidden');
	});
	</script>
</body>
		</html>
	</c:when>
	<c:otherwise>
		<c:redirect url="/login.do" />
	</c:otherwise>
</c:choose>