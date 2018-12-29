<%@ page language="java" contentType="text/html;  charset=ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<c:choose>
	<c:when test="${!empty users}">
		<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="cache-control" content="no-cache" />
<meta name="expires" content="0" />
<meta name="pragma" content="no-cache" />
<title><tiles:getAsString name="title" /></title>
<link
	href="${pageContext.request.contextPath}/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/vendor/metisMenu/metisMenu.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/dist/css/sb-admin-2.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/vendor/morrisjs/morris.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link
	href="${pageContext.request.contextPath}/resources/js/fineCrop.css" />
<style type="text/css">
.footer2 {
	position: absolute;
	border-bottom: 1px solid #e7e7e7;
	border-top: 1px solid #e7e7e7;
	border-color: #e7e7e7;
	width: 100%;
	padding: 5px;
	bottom: 0px;
}

.text-center {
	text-align: center;
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
	<div id="wrapper">
		<tiles:insertAttribute name="header" />
		<tiles:insertAttribute name="menu" />
	</div>
	<div id="page-wrapper" style="padding-bottom: 50px;">
		<div class="row">
			<div class="col-md-12 col-sm-12 col-xs-12 col-lg-12">
				<tiles:insertAttribute name="body" />
			</div>
		</div>
	</div>

	<script
		src="${pageContext.request.contextPath}/vendor/bootstrap/js/bootstrap.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/vendor/metisMenu/metisMenu.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/vendor/raphael/raphael.min.js"></script>
	<script src="${pageContext.request.contextPath}/dist/js/sb-admin-2.js"></script>
	<script src="${pageContext.request.contextPath}/dist/js/sb-admin-2.js"></script>

<!-- 	<script type="text/javascript">
	$(window).on('beforeunload', function(){ 
		alert(45454);
	});
	</script> -->
	<tiles:insertAttribute name="footer" />
</body>
		</html>
	</c:when>
	<c:otherwise>
		<c:redirect url="/login.do" />
	</c:otherwise>
</c:choose>