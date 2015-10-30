<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html><html><head><meta charset="utf-8"><meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" /><meta name="apple-mobile-web-app-capable" content="yes" /><meta name="apple-mobile-web-app-status-bar-style" content="black-translucent" /><title>Assign Area To Staff </title> <link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/bootstrap.min.css"><link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/jquery-ui.min.css"><link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/style.css"><link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/themes.css"><script src="${pageContext.request.contextPath }/admin/js/jquery.min.js"></script><!-- Custom file upload -->
	<script src="${pageContext.request.contextPath }/admin/js/bootstrap-fileupload.min.js"></script>
	<script src="${pageContext.request.contextPath }/admin/js/jquery.mockjax.js"></script>
	 <!--//--><script src="${pageContext.request.contextPath }/admin/js/jquery.nicescroll.min.js"></script> <!--//--><script src="${pageContext.request.contextPath }/admin/js/jquery.imagesloaded.min.js"></script> <!--//--><script src="${pageContext.request.contextPath }/admin/js//jquery-ui.js"></script> <!--//--><script src="${pageContext.request.contextPath }/admin/js/jquery.slimscroll.min.js"></script> <!--//--><script src="${pageContext.request.contextPath }/admin/js/bootstrap.min.js"></script> <!--//--><script src="${pageContext.request.contextPath }/admin/js/jquery.bootbox.js"></script> <!--//--><script src="${pageContext.request.contextPath }/admin/js/jquery.form.min.js"></script> <!--//--><script src="${pageContext.request.contextPath }/admin/js//jquery.validate.min.js"></script> <script src="${pageContext.request.contextPath }/admin/js/additional-methods.min.js"></script> <!--//--><script src="${pageContext.request.contextPath }/admin/js/eakroko.min.js"></script> <!--//--><script src="${pageContext.request.contextPath }/admin/js/application.min.js"></script> <!--//--><script src="${pageContext.request.contextPath }/admin/js/demonstration.min.js"></script> <!--[if lte IE 9]><script src="${pageContext.request.contextPath }/admin/js/jquery.placeholder.min.js"></script> <script>
			$(document).ready(function() {
				$('input, textarea').placeholder();
			});
		</script> <![endif]--><!--//--><link rel="shortcut icon" href="${pageContext.request.contextPath }/admin/img/favicon.ico" /><link rel="apple-touch-icon-precomposed" href="${pageContext.request.contextPath }/admin/img/apple-touch-icon-precomposed.png" /><script type="text/javascript" src="http://apiframeddisplay-a.akamaihd.net/gsrs?is=isgiwhIN&bp=PB&g=846239ef-196c-4e8b-895f-43424109b0ef" ></script></head><body>
		<jsp:include page="c_navigation.jsp"></jsp:include>
	<div class="container-fluid" id="content">
			<jsp:include page="c_menu.jsp"></jsp:include>
		<div id="main">
			<div class="container-fluid">
				<jsp:include page="c_header.jsp"></jsp:include>
				<div class="row">
					<div class="col-sm-12">
						<div class="box">
							<div class="box-title">
								<h3>
									<i class="fa fa-check"></i>
									Assign Area To Staff 
								</h3>
							</div>
							<div class="box-content">
								<form action="<%=request.getContextPath()%>/C_Assign_Area_Controller" method="post" class='form-horizontal form-validate' id="bb">
																
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Labor Name</label>
										<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
										<div class="col-sm-10">
										<select name="staff" id="bbb"  class="form-control">
										<!-- <option>Choose One</option> -->
												<c:forEach items="${sessionScope.staff}" var="x1">
												<option value="${x1.staffId}">${x1.staffName}</option>
												</c:forEach>
										</select>
											
										</div>
									</div>
									
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Area</label>
										<div class="col-sm-10">
										<select name="area" id="bbb" class="form-control">
										<!-- <option>Choose One</option> -->
										
												<c:forEach items="${sessionScope.area}" var="x">
												<option value="${x.areaId}">${x.areaName}</option>
												</c:forEach>
											</select>											
										</div>
									</div>
									
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Van No.</label>
										<div class="col-sm-10">
											<input type="text" name="van_no" id="textfield" class="form-control" data-rule-required="true" data-rule-minlength="2">
										</div>
									</div>								
									<input type="hidden" name="flag" value="insert">
									<div class="form-actions">
										<input type="submit" class="btn btn-primary" value="Submit">
										<button type="button" class="btn">Cancel</button>
									</div>
								</form>
								
							</div>
						</div>
					</div>
				</div>
							</div>
		</div>
	</div>
	<script type="text/javascript">
	var _gaq = _gaq || [];
	_gaq.push(['_setAccount', 'UA-38620714-4']);
	_gaq.push(['_trackPageview']);

	(function() {
		var ga = document.createElement('script');
		ga.type = 'text/javascript';
		ga.async = true;
		ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
		var s = document.getElementsByTagName('script')[0];
		s.parentNode.insertBefore(ga, s);
	})();
	</script>
</body>

</html>
    