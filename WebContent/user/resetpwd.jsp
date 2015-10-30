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
	

	<title>Reset Password</title>

	<!-- Bootstrap -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/bootstrap.min.css">
	<!-- icheck -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/all.css">
	<!-- Theme CSS -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/style.css">
	<!-- Color CSS -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/themes.css">


	<!-- jQuery -->
	<script src="${pageContext.request.contextPath }/admin/jquery.min.js"></script>

	<!-- Nice Scroll -->
	<script src="${pageContext.request.contextPath }/admin/jquery.nicescroll.min.js"></script>
	<!-- Validation -->
	<script src="${pageContext.request.contextPath }/admin/jquery.validate.min.js"></script>
	<script src="${pageContext.request.contextPath }/admin/additional-methods.min.js"></script>
	<!-- icheck -->
	<script src="${pageContext.request.contextPath }/admin/jquery.icheck.min.js"></script>
	<!-- Bootstrap -->
	<script src="${pageContext.request.contextPath }/admin/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath }/admin/eakroko.js"></script>

	<!--[if lte IE 9]>
		<script src="${pageContext.request.contextPath }/admin/jquery.placeholder.min.js"></script>
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
		<div class="heading">
                        <h2>Welcome back!</h2>
                        <h5>Log in with your account.</h5>
                    </div>
                    
                     <div id="global-success" style="visibility:hidden;"></div>
					 
					 <div id="global-error" style="visibility:hidden;"></div>
                    
		<div class="login-body">
			<h2>Password Reset</h2>
			<form action="<%=request.getContextPath()%>/Resetpwd_Controller?flag=forgot" method='post' class='form-validate' id="test">
				<div class="form-group">
					<div class="email controls">
						<input type="text" name='userName' placeholder="Email address" class='form-control' data-rule-required="true" data-rule-email="true">
					</div>
				</div>
				<div class="form-group">
					<div class="pw controls">
						
					</div>
				</div>
					<input type="hidden" name="flag" value="login">
				<div class="submit">
					<div class="remember">
						
					</div>
					 <button type="submit" id="button" class="button" name="submitButton">Login</button>
				</div>
			</form>
			<div class="forget">
				<h6>
					 <a href="u_reg.jsp" target="_self" class="redirect">
				Don't have an account? Sign up for free!</a></h6>
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
