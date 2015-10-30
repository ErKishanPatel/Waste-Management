<!doctype html>
<html>

<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
	<!-- Apple devices fullscreen -->
	<meta name="apple-mobile-web-app-capable" content="yes" />
	<!-- Apple devices fullscreen -->
	<meta name="apple-mobile-web-app-status-bar-style" content="black-translucent" />

	<title>Registration</title>

	<!-- Bootstrap -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/bootstrap.min.css">
	<!-- icheck -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/all.css">
	<!-- Theme CSS -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/style.css">
	<!-- Color CSS -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/themes.css">


	<!-- jQuery -->
	<script src="${pageContext.request.contextPath }/admin/js/jquery.min.js"></script>

	<!-- Nice Scroll -->
	<script src="${pageContext.request.contextPath }/admin/js/jquery.nicescroll.min.js"></script>
	<!-- Validation -->
	<script src="${pageContext.request.contextPath }/admin/js/jquery.validate.min.js"></script>
	<script src="${pageContext.request.contextPath }/admin/js/additional-methods.min.js"></script>
	<!-- icheck -->
	<script src="${pageContext.request.contextPath }/admin/js/jquery.icheck.min.js"></script>
	<!-- Bootstrap -->
	<script src="${pageContext.request.contextPath }/admin/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath }/admin/js/eakroko.js"></script>

	<!--[if lte IE 9]>
		<script src="${pageContext.request.contextPath }/admin/js/jquery.placeholder.min.js"></script>
		<script>
			$(document).ready(function() {
				$('input, textarea').placeholder();
			});
		</script>
	<![endif]-->


	<!-- Favicon -->
	<link rel="shortcut icon" href="${pageContext.request.contextPath }/admin/img/favicon.ico" />
	<!-- Apple devices Homescreen icon -->
	<link rel="apple-touch-icon-precomposed" href="${pageContext.request.contextPath }/admin/img/apple-touch-icon-precomposed.png" />

</head>

<body class='login'>
	<div class="wrapper">
		<h1>
			<a href="#">
				<img src="${pageContext.request.contextPath }/admin/img/logo-big.png" alt="" class='retina-ready' width="59" height="49">Registration</a>
		</h1>
		<div class="login-body">
			<h2>Company</h2>
			<form action="<%=request.getContextPath()%>/C_Reg_Controller" method="post" class='form-validate' >
				<div class="form-group">
					<div class="email controls">
						<input type="text" name='c_name' placeholder="Company Name" class='form-control' data-rule-required="true" data-rule-minlength="2">
					</div>
				</div>
				
				<div class="form-group">
					<div class="email controls">
						<input type="text" name='add' placeholder="Address" class='form-control' data-rule-required="true" >
					</div>
				</div>
				
				<div class="form-group">
					<div class="email controls">
						<input type="text" name='city' placeholder="City" class='form-control' data-rule-required="true" data-rule-minlength="2">
					</div>
				</div>
				
				<div class="form-group">
					<div class="email controls">
						<input type="text" name="pin" placeholder="Pin" id="digitsfield" class='form-control' data-rule-digits="true" data-rule-required="true" >
					</div>
				</div>
				
				<div class="form-group">
					<div class="email controls">
						<input type="text" name="c_contact" placeholder="Company Contact" id="digitsfield" class='form-control' data-rule-digits="true" data-rule-required="true" >
					</div>
				</div>
				<div class="form-group">
					<div class="email controls">
						<input type="text" name="p_contact" placeholder="Contact Person" id="digitsfield" class='form-control' data-rule-digits="true" data-rule-required="true" >
					</div>
				</div>
				
				
				<div class="form-group">
					<div class="email controls">
						<input type="text" name='userName' placeholder="Email address" id="password" class='form-control' data-rule-required="true" data-rule-email="true">
					</div>
				</div>
				<div class="form-group">
					<div class="pw controls">
						<input type="password" name="userPassword" id="password" placeholder="Password" class='form-control' data-rule-required="true">
					</div>
				</div>
				<div class="form-group">
				<div class="email controls">
				
					<input type="password" name="c_password" placeholder="Confirm Password" id="confirmfield" class="form-control" data-rule-equalTo="#password"  data-rule-required="true">
				</div>
				</div>
				
				<div class="form-group">
					<div class="email controls">
						<input type="text" name='reg_no' placeholder="Registration No." class='form-control' data-rule-required="true" data-rule-minlength="2">
					</div>
				</div>
				<iframe src="fileupload.jsp" width="100%" height="150"> </iframe>
				
				<!-- <div class="form-group">

										<label for="textfield" class="control-label col-sm-2">Upload Document</label>
										<div class="col-sm-10">
										
											<div class="fileinput fileinput-new" data-provides="fileinput">
												<div class="input-group">
													<div class="form-control" data-trigger="fileinput">
														<i class="glyphicon glyphicon-file fileinput-exists"></i>
														<span class="fileinput-filename"></span>
													</div>
													<span class="input-group-addon btn btn-default btn-file">
														<span class="fileinput-new">Upload Document</span>
													<span class="fileinput-exists">Change</span>
													<input type="file" name="...">
													</span>
													<a href="#" class="input-group-addon btn btn-default fileinput-exists" data-dismiss="fileinput">Remove</a>
														
												</div>
											</div>
										</div>
									</div>
									
 -->				<div class="submit">
					<div class="remember">
						<input type="checkbox" name="policy" data-rule-required="true" class='icheck-me' data-skin="square" data-color="blue" id="remember">
						<label for="remember">I agree the policy.</label>
					</div>
					<input type="hidden" name="flag" value="insert">
					
					<input type="submit" class="btn btn-primary" value="Submit">
					
				</div>

	</form>
			<div class="forget">
				<a href="#">
					<span>Thank You..!!</span>
				</a>
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
