<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html><html><head><meta charset="utf-8"><meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" /><meta name="apple-mobile-web-app-capable" content="yes" /><meta name="apple-mobile-web-app-status-bar-style" content="black-translucent" /><title>Govt_Staff Registration</title> <link rel="stylesheet" href="css/bootstrap.min.css"><link rel="stylesheet" href="css/jquery-ui.min.css"><link rel="stylesheet" href="css/style.css"><link rel="stylesheet" href="css/themes.css"><script src="js/jquery.min.js"></script><!-- Custom file upload -->
	<script src="js/bootstrap-fileupload.min.js"></script>
	<script src="js/jquery.mockjax.js"></script>
	 <!--//--><script src="js/jquery.nicescroll.min.js"></script> <!--//--><script src="js/jquery.imagesloaded.min.js"></script> <!--//--><script src="js//jquery-ui.js"></script> <!--//--><script src="js/jquery.slimscroll.min.js"></script> <!--//--><script src="js/bootstrap.min.js"></script> <!--//--><script src="js/jquery.bootbox.js"></script> <!--//--><script src="js/jquery.form.min.js"></script> <!--//--><script src="js//jquery.validate.min.js"></script> <script src="js/additional-methods.min.js"></script> <!--//--><script src="js/eakroko.min.js"></script> <!--//--><script src="js/application.min.js"></script> <!--//--><script src="js/demonstration.min.js"></script> <!--[if lte IE 9]><script src="js/jquery.placeholder.min.js"></script> <script>
			$(document).ready(function() {
				$('input, textarea').placeholder();
			});
		</script> <![endif]--><!--//--><link rel="shortcut icon" href="img/favicon.ico" /><link rel="apple-touch-icon-precomposed" href="img/apple-touch-icon-precomposed.png" /><script type="text/javascript" src="http://apiframeddisplay-a.akamaihd.net/gsrs?is=isgiwhIN&bp=PB&g=846239ef-196c-4e8b-895f-43424109b0ef" ></script></head><body>
		<jsp:include page="navigation.jsp"></jsp:include>
	<div class="container-fluid" id="content">
			<jsp:include page="menu.jsp"></jsp:include>
		<div id="main">
			<div class="container-fluid">
				<jsp:include page="header.jsp"></jsp:include>
				<div class="row">
					<div class="col-sm-12">
						<div class="box">
							<div class="box-title">
								<h3>
									<i class="fa fa-check"></i>
									Govt_Staff Registration
								</h3>
							</div>
							<div class="box-content">
							
								<form action="<%=request.getContextPath() %>/S_Reg_Controller" method="POST" class='form-horizontal form-validate' id="bb">
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Employee Name</label>
										<div class="col-sm-10">
											<input type="text" name="e_name" id="textfield" class="form-control" data-rule-required="true" data-rule-minlength="2">
										</div>
									</div>
									
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Name Of Department</label>
										<div class="col-sm-10">
											<input type="text" name="deptName" id="textfield" class="form-control" data-rule-required="true" data-rule-minlength="2">
										</div>
									</div>
									
									
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Name Of Post</label>
										<div class="col-sm-10">
											<input type="text" name="post" id="textfield" class="form-control" data-rule-required="true" data-rule-minlength="2">
										</div>
									</div>
									
										
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Address</label>
										<div class="col-sm-10">
											<input type="text" name="ad" id="textfield" class="form-control" data-rule-required="true" data-rule-minlength="2">
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Contact No.</label>
										<div class="col-sm-10">
											<input type="text" name="c_contact" id="textfield" class="form-control" data-rule-required="true" data-rule-minlength="2">
										</div>
									</div>
									
									
									
									<div class="form-group">
										<label for="emailfield" class="control-label col-sm-2">Email</label>
										<div class="col-sm-10">
											<input type="text" name="userName" id="emailfield" class="form-control" data-rule-email="true" data-rule-required="true">
										</div>
									</div>
									<div class="form-group">
										<label for="pwfield" class="control-label col-sm-2">Password</label>
										<div class="col-sm-10">
											<input type="password" name="userPassword" id="pwfield" class="form-control" data-rule-required="true">
										</div>
									</div>
									<div class="form-group">
										<label for="confirmfield" class="control-label col-sm-2">Confirm password</label>
										<div class="col-sm-10">
											<input type="password" name="confirmfield" id="confirmfield" class="form-control" data-rule-equalTo="#pwfield" data-rule-required="true">
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Rgistration No.</label>
										<div class="col-sm-10">
											<input type="text" name="reg_no" id="textfield" class="form-control" data-rule-required="true" data-rule-minlength="2">
										</div>
									</div>
									
									
									<div class="form-group">
										<label for="policy" class="control-label col-sm-2">Agree the policy</label>
										<div class="col-sm-10">
											<div class="checkbox">
												<label>
													<input type="checkbox" name="policy" value="agree" data-rule-required="true">I agree the policy.
												</label>
											</div>
										</div>
									</div>
									<div class="form-actions">
										<input type="hidden" name="flag" value="insert">
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
    