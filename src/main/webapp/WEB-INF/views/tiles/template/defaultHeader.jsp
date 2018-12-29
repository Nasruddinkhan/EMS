<%@page import="java.nio.channels.SeekableByteChannel"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="true"%>
<%@ page isELIgnored="false"%>
<%@ page
	import="java.util.Map, java.util.List,com.jsoft.ems.bean.MenuModel"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!-- Navigation navbar navbar-default navbar-static-top-->
<style>
@media ( max-width : 360px) {
	body {
		margin-top: 47% !important;
	}
}
@media ( min-width : 360px){
	body {
		margin-top: 42% !important;
	}
}
@media ( min-width : 380px) and ( max-width : 600px){
	body {
		margin-top: 20% !important;
	}
}
@media ( min-width : 768px) and ( max-width : 900px){
	body {
		margin-top: 20% !important;
	}
}
@media  (min-width: 600px) and (max-width: 768px){
	body {
		margin-top: 15% !important;
	}
}
@media (min-width: 768px) and (max-width: 991px) {
 body {
		margin-top: 6% !important;
	}
}

@media (min-width: 992px) and (max-width: 1199px) {
 body {
		margin-top: 4% !important;
	}
}


@media (min-width: 1200px) {
 body {
		margin-top: 4% !important;
	}
}
.jcrop-holder {
    margin-top: -144px !important;
    margin-right: 5px  !important;;
    width: 239px  !important;;
    height: 326px  !important;;
    position: relative  !important;;
    background-color: white  !important;;
    float: right  !important;;
}
</style>
<nav class="navbar navbar-default navbar-fixed-top " role="navigation"
	style="margin-bottom: 0;    box-shadow: 2px 2px 30px #BBB;">
	<div class="navbar-header">
		<button type="button" class="navbar-toggle" data-toggle="collapse"
			data-target=".navbar-collapse">
			<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span>
			<span class="icon-bar"></span> <span class="icon-bar"></span>
		</button>
		<a class="navbar-brand" href="#" style="font-size: 14px;">EMS </a> <a
			class="navbar-brand" href="#" style="font-size: 14px;">Login Time
		</a> <i><a class="navbar-brand" href="#"
			style="color: red; font-size: 14px;"> <fmt:formatDate type="both"
					dateStyle="medium" timeStyle="long"
					value="${sessionScope.loginTime}" pattern="dd-MMM-YY hh:mm:ss a" />
		</a></i>


	</div>
	<!-- /.navbar-header -->

	<ul class="nav navbar-top-links navbar-right">
		<li class="dropdown"><a class="dropdown-toggle"
			data-toggle="dropdown" href="#"> <i class="fa fa-envelope fa-fw"></i>
				<i class="fa fa-caret-down"></i>
		</a>
			<ul class="dropdown-menu dropdown-messages">
				<li><a href="#">
						<div>
							<strong>John Smith</strong> <span class="pull-right text-muted">
								<em>Yesterday</em>
							</span>
						</div>
						<div>.</div>
				</a></li>
				<li class="divider"></li>
				<li><a href="#">
						<div>
							<strong>John Smith</strong> <span class="pull-right text-muted">
								<em>Yesterday</em>
							</span>
						</div>
						<div>Lorem ipsum dolor sit amet, consectetur adipiscing
							elit. Pellentesque eleifend...</div>
				</a></li>
				<li class="divider"></li>
				<li><a href="#">
						<div>
							<strong>John Smith</strong> <span class="pull-right text-muted">
								<em>Yesterday</em>
							</span>
						</div>
						<div>Lorem ipsum dolor sit amet, consectetur adipiscing
							elit. Pellentesque eleifend...</div>
				</a></li>
				<li class="divider"></li>
				<li><a class="text-center" href="#"> <strong>Read
							All Messages</strong> <i class="fa fa-angle-right"></i>
				</a></li>
			</ul> <!-- /.dropdown-messages --></li>
		<!-- /.dropdown -->
		<li class="dropdown"><a class="dropdown-toggle"
			data-toggle="dropdown" href="#"> <i class="fa fa-tasks fa-fw"></i>
				<i class="fa fa-caret-down"></i>
		</a>
			<ul class="dropdown-menu dropdown-tasks">
				<li><a href="#">
						<div>
							<p>
								<strong>Task 1</strong> <span class="pull-right text-muted">40%
									Complete</span>
							</p>
							<div class="progress progress-striped active">
								<div class="progress-bar progress-bar-success"
									role="progressbar" aria-valuenow="40" aria-valuemin="0"
									aria-valuemax="100" style="width: 40%">
									<span class="sr-only">40% Complete (success)</span>
								</div>
							</div>
						</div>
				</a></li>
				<li class="divider"></li>
				<li><a href="#">
						<div>
							<p>
								<strong>Task 2</strong> <span class="pull-right text-muted">20%
									Complete</span>
							</p>
							<div class="progress progress-striped active">
								<div class="progress-bar progress-bar-info" role="progressbar"
									aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"
									style="width: 20%">
									<span class="sr-only">20% Complete</span>
								</div>
							</div>
						</div>
				</a></li>
				<li class="divider"></li>
				<li><a href="#">
						<div>
							<p>
								<strong>Task 3</strong> <span class="pull-right text-muted">60%
									Complete</span>
							</p>
							<div class="progress progress-striped active">
								<div class="progress-bar progress-bar-warning"
									role="progressbar" aria-valuenow="60" aria-valuemin="0"
									aria-valuemax="100" style="width: 60%">
									<span class="sr-only">60% Complete (warning)</span>
								</div>
							</div>
						</div>
				</a></li>
				<li class="divider"></li>
				<li><a href="#">
						<div>
							<p>
								<strong>Task 4</strong> <span class="pull-right text-muted">80%
									Complete</span>
							</p>
							<div class="progress progress-striped active">
								<div class="progress-bar progress-bar-danger" role="progressbar"
									aria-valuenow="80" aria-valuemin="0" aria-valuemax="100"
									style="width: 80%">
									<span class="sr-only">80% Complete (danger)</span>
								</div>
							</div>
						</div>
				</a></li>
				<li class="divider"></li>
				<li><a class="text-center" href="#"> <strong>See
							All Tasks</strong> <i class="fa fa-angle-right"></i>
				</a></li>
			</ul> <!-- /.dropdown-tasks --></li>
		<!-- /.dropdown -->
		<li class="dropdown"><a class="dropdown-toggle"
			data-toggle="dropdown" href="#"> <i class="fa fa-bell fa-fw"></i>
				<i class="fa fa-caret-down"></i>
		</a>
			<ul class="dropdown-menu dropdown-alerts">
				<li><a href="#">
						<div>
							<i class="fa fa-comment fa-fw"></i> New Comment <span
								class="pull-right text-muted small">4 minutes ago</span>
						</div>
				</a></li>
				<li class="divider"></li>
				<li><a href="#">
						<div>
							<i class="fa fa-twitter fa-fw"></i> 3 New Followers <span
								class="pull-right text-muted small">12 minutes ago</span>
						</div>
				</a></li>
				<li class="divider"></li>
				<li><a href="#">
						<div>
							<i class="fa fa-envelope fa-fw"></i> Message Sent <span
								class="pull-right text-muted small">4 minutes ago</span>
						</div>
				</a></li>
				<li class="divider"></li>
				<li><a href="#">
						<div>
							<i class="fa fa-tasks fa-fw"></i> New Task <span
								class="pull-right text-muted small">4 minutes ago</span>
						</div>
				</a></li>
				<li class="divider"></li>
				<li><a href="#">
						<div>
							<i class="fa fa-upload fa-fw"></i> Server Rebooted <span
								class="pull-right text-muted small">4 minutes ago</span>
						</div>
				</a></li>
				<li class="divider"></li>
				<li><a class="text-center" href="#"> <strong>See
							All Alerts</strong> <i class="fa fa-angle-right"></i>
				</a></li>
			</ul> <!-- /.dropdown-alerts --></li>
		<!-- /.dropdown -->
		<li class="dropdown"><a class="dropdown-toggle"
			data-toggle="dropdown" href="#"> <i class="fa fa-user fa-fw"></i>
				<i class="fa fa-caret-down"></i>
		</a>
			<ul class="dropdown-menu dropdown-user">
				<!-- <li><a href="#"><i class="fa fa-user fa-fw"></i> User
						Profile</a></li>
						
				<li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a></li> -->
				<li class="divider"></li>
				<li><a href="#"  href="#" data-toggle="modal"
												data-target="#myModal"><i class="fa fa-user fa-fw"></i> Upload Image</a></li>
				<li class="divider"></li>
				<li><a
					href="${pageContext.request.contextPath}/login/logout.do"><i
						class="fa fa-sign-out fa-fw"></i> Logout</a></li>
			</ul> <!-- /.dropdown-user --></li>
		<!-- /.dropdown -->
	</ul>
	<!-- /.navbar-top-links -->

	<div class="navbar-default sidebar" role="navigation">
		<div class="sidebar-nav navbar-collapse">
			<ul class="nav" id="side-menu">
				<%
					List<MenuModel> menuModel = (List<MenuModel>) session.getAttribute("menuModel");
					Map<Integer, List<MenuModel>> subMenuModel = (Map<Integer, List<MenuModel>>) session
							.getAttribute("subMenuModel");
					if (menuModel != null && menuModel.size() > 0) {
						for (MenuModel menuMdl : menuModel) {
							if (null == menuMdl.getSubMenuArrowIcon() || menuMdl.getSubMenuArrowIcon().isEmpty()) {
				%>
				<li><a
					href="${pageContext.request.contextPath}/<%=menuMdl.getMenuURL() %>.do"><i
						class="<%=menuMdl.getMenuIcon()%>"></i><%=menuMdl.getMenuName()%></a></li>
				<%
					} else {
						%>
						<li><a
							href="${pageContext.request.contextPath}/<%=menuMdl.getMenuURL() %>.do"><i
								class="<%=menuMdl.getMenuIcon()%>"></i><%=menuMdl.getMenuName()%><span class="fa arrow"></span></a>
								<ul class="nav nav-second-level">
								<%
								List<MenuModel> subMenuList = subMenuModel.get(menuMdl.getMenuId());
								if(subMenuList != null && subMenuList.size() > 0){
									for (MenuModel subMenuMdl : subMenuList) {
										%><li><a
										href="${pageContext.request.contextPath}/<%=subMenuMdl.getMenuURL() %>.do"><i
											class="<%=subMenuMdl.getMenuIcon()%>"></i><%=subMenuMdl.getMenuName()%></a></li>
									<% }
								}
								%>
								</ul>
								</li>
						<%
						
							}
						}
					}
				%>

			</ul>
		</div>
		<!-- /.sidebar-collapse -->
	</div>
	<!-- /.navbar-static-side -->
		 <script
		src="${pageContext.request.contextPath}/vendor/jquery/jquery.min.js"></script> 
		<script
		src="${pageContext.request.contextPath}/resources/js/jquery.Jcrop.min.js"></script>
</nav>

       <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Upload Photo</h4>
        </div>
        <div class="modal-body">
        <form id="form" enctype="multipart/form-data" method="post">
				<div class="row form-group row">
					<label class="col-sm-2 control-label" for="firstName">Emp
						ID </label>
						<div class="input-group col-sm-4">
							<input id="empId" disabled="disabled"
								value="${sessionScope.empID}" 
								class="form-control" />
					</div>
				</div>
				<div class="row form-group row">
					<label class="col-sm-2 control-label" for="fileUpload">File Upload
						 </label>
						<div class="input-group col-sm-4">
							<input id="file" type="file" name="files" accept="image/gif, image/jpeg, image/png"
								class="form-control" />
								<input type="hidden" id="base64String"/>
								<span id="result" >
					</span>
					</div>
				</div>
				<div class="row form-group row">
				<button id="uploadPht" type="button" class="btn btn-success" style="margin-left: 10%;">Update Photo</button>
 <!--  <button id="cropbutton" type="button" class="btn btn-primary" style="    margin-left: 10%;">Crop</button> -->
 <!--  <button id="scalebutton" type="button" class="btn btn-success">Scale</button> -->
  <!-- <button id="rotatebutton" type="button" class="btn btn-info">Rotate</button> -->
  <input id="rest" type="reset" class="btn btn-info" value="Reset"/>
<!--   <button id="hflipbutton" type="button" class="btn btn-warning">H-flip</button>
  <button id="vflipbutton" type="button" class="btn btn-danger">V-flip</button> -->
  
  <br>
  <div id="views"></div>
				</div>
				</form>
			</div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
    <script type="text/javascript">
    var crop_max_width = 400;
    var crop_max_height = 400;
    var jcrop_api;
    var canvas;
    var context;
    var image;
    var prefsize;
    $("#file").change(function() {
      loadImage(this);
    });
    function loadImage(input) {
      if (input.files && input.files[0]) {
        var reader = new FileReader();
        canvas = null;
        reader.onload = function(e) {
          image = new Image();
          image.onload = validateImage;
          image.src = e.target.result;
          $('#base64String').val(e.target.result);
        }
        reader.readAsDataURL(input.files[0]);
      }
    }

    function dataURLtoBlob(dataURL) {
    	console.log("dataURL ["+dataURL+"]");
      var BASE64_MARKER = ';base64,';
      if (dataURL.indexOf(BASE64_MARKER) == -1) {
        var parts = dataURL.split(',');
        var contentType = parts[0].split(':')[1];
        var raw = decodeURIComponent(parts[1]);
        return new Blob([raw], {
          type: contentType
        });
      }
      var parts = dataURL.split(BASE64_MARKER);
      var contentType = parts[0].split(':')[1];
      var raw = window.atob(parts[1]);
      var rawLength = raw.length;
      var uInt8Array = new Uint8Array(rawLength);
      for (var i = 0; i < rawLength; ++i) {
        uInt8Array[i] = raw.charCodeAt(i);
      }
      console.log("uInt8Array ["+uInt8Array+"]");
      return new Blob([uInt8Array], {
        type: contentType
      });
    }

    function validateImage() {
      if (canvas != null) {
        image = new Image();
        image.onload = restartJcrop;
        image.src = canvas.toDataURL('image/jpg');
      } else restartJcrop();
    }
    function restartJcrop() {
      if (jcrop_api != null) {
        jcrop_api.destroy();
      }
      $("#views").empty();
      $("#views").append("<canvas id=\"canvas\">");
      canvas = $("#canvas")[0];
      context = canvas.getContext("2d");
      canvas.width = image.width;
      canvas.height = image.height;
      context.drawImage(image, 0, 0);
      $("#canvas").Jcrop({
        onSelect: selectcanvas,
        onRelease: clearcanvas,
        boxWidth: crop_max_width,
        boxHeight: crop_max_height
      }, function() {
        jcrop_api = this;
      });
      clearcanvas();
    }

    function clearcanvas() {
      prefsize = {
        x: 0,
        y: 0,
        w: canvas.width,
        h: canvas.height,
      };
    }

    function selectcanvas(coords) {
      prefsize = {
        x: Math.round(coords.x),
        y: Math.round(coords.y),
        w: Math.round(coords.w),
        h: Math.round(coords.h)
      };
    }

    /* function applyCrop() {
      canvas.width = prefsize.w;
      canvas.height = prefsize.h;
      context.drawImage(image, prefsize.x, prefsize.y, prefsize.w, prefsize.h, 0, 0, canvas.width, canvas.height);
      validateImage();
    } */

    function applyScale(scale) {
      if (scale == 1) return;
      canvas.width = canvas.width * scale;
      canvas.height = canvas.height * scale;
      context.drawImage(image, 0, 0, canvas.width, canvas.height);
      validateImage();
    }
  /*   function applyRotate() {
      canvas.width = image.height;
      canvas.height = image.width;
      context.clearRect(0, 0, canvas.width, canvas.height);
      context.translate(image.height/2, image.width/2);
      context.rotate(Math.PI / 2);
      context.drawImage(image, -image.width/2, -image.height/2);
      validateImage();
    } */

    function applyHflip() {
      context.clearRect(0, 0, canvas.width, canvas.height);
      context.translate(image.width, 0);
      context.scale(-1, 1);
      context.drawImage(image, 0, 0);
      validateImage();
    }

    function applyVflip() {
      context.clearRect(0, 0, canvas.width, canvas.height);
      context.translate(0, image.height);
      context.scale(1, -1);
      context.drawImage(image, 0, 0);
      validateImage();
    }

 /*    $("#cropbutton").click(function(e) {
    	console.log(" cropbutton");
      applyCrop();
    }); */
   /*  $("#scalebutton").click(function(e) {
      var scale = prompt("Scale Factor:", "1");
      applyScale(scale);
    }); */
   /*  $("#rotatebutton").click(function(e) {
      applyRotate();
    }); */
    $("#hflipbutton").click(function(e) {
      applyHflip();
    });
    $("#vflipbutton").click(function(e) {
      applyVflip();
    });
    
    $('#uploadPht').on('click',function(e){
    	var rootURL = window.location.origin;	
		base_url = rootURL+"<%=request.getContextPath()%>";
		console.log("base_url ["+base_url+"]");
    	        event.preventDefault();
    	        var form = $('#form')[0];
    	        var data = new FormData(form);
    	        console.log("data : ", data);
    	        data.append("empId", $('#empId').val());
    	        data.append("encodeString", $('#base64String').val());
    	        $("#uploadPht").prop("disabled", true);
    	        $.ajax({
    	            type: "POST",
    	            enctype: 'multipart/form-data',
    	            url : base_url + "/fileUpload/upload.do",
    	            data: data,
    	            processData: false,
    	            contentType: false,
    	            cache: false,
    	            timeout: 600000,
    	            success: function (data) {
    	               $("#result").html(data);
    	                console.log("SUCCESS : ", data);
    	                $("#uploadPht").prop("disabled", false);
    	            },
    	            error: function (e) {
    	                $("#result").html(e.responseText);
    	                console.log("ERROR : ", e);
    	                $("#btnSubmit").prop("disabled", false);
    	            }
    	        });

    });
    </script>
  </div>

  