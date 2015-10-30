<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html>

<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
	<!-- Apple devices fullscreen -->
	<meta name="apple-mobile-web-app-capable" content="yes" />
	<!-- Apple devices fullscreen -->
	<meta name="apple-mobile-web-app-status-bar-style" content="black-translucent" />

	<title>Login</title>

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
			<a href="index.jsp">
				<im.g src="${pageContext.request.contextPath }/admin/img/logo-big.png" alt="" class='retina-ready' width="59" height="49">Login</a>
		</h1>
		<div class="login-body">
			<h2>SIGN IN</h2>
			<form action="<%=request.getContextPath()%>/Loginfilter" method='post' class='form-validate' id="test">
				<div class="form-group">
					<div class="email controls">
						<input type="text" name='userName' placeholder="Email address" class='form-control' data-rule-required="true" data-rule-email="true">
					</div>
				</div>
				<div class="form-group">
					<div class="pw controls">
						<input type="password" name="userPassword" placeholder="Password" class='form-control' data-rule-required="true">
					</div>
				</div>
					<input type="hidden" name="flag" value="login">
				<div class="submit">
					<div class="remember">
						<input type="checkbox" name="remember" class='icheck-me' data-skin="square" data-color="blue" id="remember">
						<label for="remember">Remember me</label>
					</div>
					<input type="submit" value="Sign me in" class='btn btn-primary'>
				</div>
			</form>
			<div class="forget">
				<a href="resetpwd.jsp">
					<span>Forgot password?</span>
				</a>
				<a href="u_reg.jsp">
					<span>Register Now</span>
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
