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
.wrap {
	box-shadow: 0px 2px 2px 0px rgba(0, 0, 0, 0.14), 0px 3px 1px -2px
		rgba(0, 0, 0, 0.2), 0px 1px 5px 0px rgba(0, 0, 0, 0.12);
	border-radius: 4px;
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
	
		<div class="card">
			<div class="header" style="background: #3299a9">
				<h2>Address Details</h2>
			</div>
			<div class="body row">
				<form:form autocomplete="on" modelAttribute="address"
					action="${pageContext.request.contextPath}/application/save_address.do" method="post">
					<input type="hidden" value="${addrTitleStr}" id="addrTitleStr">
					<form:hidden path="addressId" id="addressId"/>
					<div class="panel-body">
					<div class="row">
							<div class="form-group col-md-12">
								<label for="status">Address Type</label>
								<form:select path="status" class="form-control input-md" id="status">
								<form:option value="">-----SELECT-----</form:option>
								<form:option value="1">Present Address</form:option>
								<form:option value="2">Local Address</form:option>
								<form:option value="3">Permanent Address</form:option>
								<form:option value="4">Office Address</form:option>
								</form:select>
							</div>
							
						</div>
					
						<div class="row">
							<div class="form-group col-md-12">
								<label for="addressline1">Address Line 1</label>
								<form:input path="addressLine1" class="form-control input-md" />
							</div>
							<div class="form-group col-md-12">
								<label for="addressline2">Address Line 2</label>
								<form:input path="addressLine2" class="form-control input-md" />
							</div>
						</div>

						<div class="row">
							<div class="form-group col-md-6">
								<label for="email">Country</label>
								<form:input path="country" class="form-control input-md" />
							</div>
							<div class="form-group col-md-6">
								<label for="email">State</label>
								<form:input path="state" class="form-control input-md" />
							</div>
						</div>
						<div class="row">
							<div class="form-group col-md-6">
								<label for="email">City</label>
								<form:input path="city" class="form-control input-md" />
							</div>
							<div class="form-group col-md-6">
								<label for="email">PinCode</label>
								<form:input path="pinCode" class="form-control input-md" />
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
					</div>
				</form:form>
			</div>
					<div class="row">
		<div class="col-sm-12">
			<div class="panel-body" style="padding: 0px;">
				<div class="table-responsive">
				<c:if  test="${!empty addrresList}">
					<table id="dataTables-example"
						class="table table-striped table-bordered table-hover">
						<thead>
							<tr>
							    <th >Sr.No</th>
								<th >AddresType</th>
								<th >AddresLine1</th>
								<th >AddresLine2</th> 
								<th>Country</th>
								<th>State</th>
								<th>City</th>
								<th>PinCode</th>
								<th>Action</th>
							</tr>
						</thead>
						<tbody>
							<c:choose>
								<c:when test="${!empty addrresList}">
									<c:forEach items="${addrresList}" var="addlist"  varStatus="row">
										<tr>
										<td>
										${row.count}
										</td>
											<td>
											${addlist.status== '1'?'Present Address':addlist.status=='2'?'Local Address':addlist.status=='3'?'Permanent Address'
											:addlist.status=='4'?'Office Address':'Office Address'}
											</td>
											<td>${addlist.addressLine1}</td>
											<td>${addlist.addressLine2}</td>
											<td>${addlist.country}</td>
											<td>${addlist.state}</td>
											<td>${addlist.city}</td> 
											<td>${addlist.pinCode}</td>
											<td> <a class="btn btn-warning" id="saveBtn"
												style="font-size: 11px"
												href="#" onclick="editAddrDtl('${addlist.addressId}','${addlist.status}',
												'${addlist.addressLine1}','${addlist.addressLine2}','${addlist.country}','${addlist.state}','${addlist.city}','${addlist.pinCode}')">
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
		<script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
		<script type="text/javascript">
		$(document).ready(function(){
			var status = $('#addrTitleStr').val();
		if(!isEmpty(status)){
			var statusStr = status.split(':');
			$('#status option').each(function(){
				for (var i = 0; i < statusStr.length; i++) { 
				    if($(this).val()==statusStr[i]){
				    	$("#status option[value=" + statusStr[i] + "]").attr('disabled',true);
				    }
				}
			});
		}
		});
		function isEmpty(val){
		    return (val === undefined || val == null || val.length <= 0) ? true : false;
		}
		 function editAddrDtl(addressId,status,addressLine1,addressLine2,country,state,city,pinCode){
			$('#addressId').val(addressId);
				$('#status').val(status);
				$('#addressLine1').val(addressLine1);
				$('#addressLine2').val(addressLine2);
				$('#country').val(country);
				$('#state').val(state);
				$('#city').val(city);
				$('#pinCode').val(pinCode);
				$("#saveBtn").text('Update');
			}
		</script>
</body>
</html>