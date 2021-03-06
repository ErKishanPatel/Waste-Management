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
	<meta names="apple-mobile-web-app-status-bar-style" content="black-translucent" />

	<title>FLAT - Extended forms</title>

	<!-- Bootstrap -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/bootstrap.min.css">
	<!-- jQuery UI -->
	<link rel="stylesheet" href="cssjquery-ui.min.css">
	<!-- PageGuide -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/pageguide.css">
	<!-- Fullcalendar -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/fullcalendar.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/fullcalendar.print.css" media="print">
	<!-- Tagsinput -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/jquery.tagsinput.css">
	<!-- chosen -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/chosen.css">
	<!-- multi select -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/multi-select.css">
	<!-- timepicker -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/bootstrap-timepicker.min.css">
	<!-- colorpicker -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/colorpicker.css">
	<!-- Datepicker -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/datepicker.css">
	<!-- Daterangepicker -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/daterangepicker.css">
	<!-- Plupload -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/jquery.plupload.queue.css">
	<!-- select2 -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/select2.css">
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
	<!-- imagesLoaded -->
	<script src="${pageContext.request.contextPath }/admin/js/jquery.imagesloaded.min.js"></script>
	<!-- jQuery UI -->
	<script src="${pageContext.request.contextPath }/admin/js/jquery-ui.js"></script>
	<!-- Bootstrap -->
	<script src="${pageContext.request.contextPath }/admin/js/bootstrap.min.js"></script>
	<!-- Bootbox -->
	<script src="${pageContext.request.contextPath }/admin/js/jquery.bootbox.js"></script>
	<!-- Masked inputs -->
	<script src="${pageContext.request.contextPath }/admin/js/jquery.maskedinput.min.js"></script>
	<!-- TagsInput -->
	<script src="${pageContext.request.contextPath }/admin/js/jquery.tagsinput.min.js"></script>
	<!-- Datepicker -->
	<script src="${pageContext.request.contextPath }/admin/js/bootstrap-datepicker.js"></script>
	<!-- Daterangepicker -->
	<script src="${pageContext.request.contextPath }/admin/js/moment.min.js"></script>
	<script src="${pageContext.request.contextPath }/admin/js/daterangepicker.js"></script>
	<!-- Timepicker -->
	<script src="${pageContext.request.contextPath }/admin/js/bootstrap-timepicker.min.js"></script>
	<!-- Colorpicker -->
	<script src="${pageContext.request.contextPath }/admin/js/bootstrap-colorpicker.js"></script>
	<!-- Chosen -->
	<script src="${pageContext.request.contextPath }/admin/js/chosen.jquery.min.js"></script>
	<!-- MultiSelect -->
	<script src="${pageContext.request.contextPath }/admin/js/jquery.multi-select.js"></script>
	<!-- CKEditor -->
	<script src="${pageContext.request.contextPath }/admin/js/ckeditor.js"></script>
	<!-- PLUpload -->
	<script src="${pageContext.request.contextPath }/admin/js/plupload.full.min.js"></script>
	<script src="${pageContext.request.contextPath }/admin/js/jquery.plupload.queue.min.js"></script>
	<!-- Custom file upload -->
	<script src="${pageContext.request.contextPath }/admin/js/bootstrap-fileupload.min.js"></script>
	<script src="${pageContext.request.contextPath }/admin/js/jquery.mockjax.js"></script>
	<!-- select2 -->
	<script src="${pageContext.request.contextPath }/admin/js/select2.min.js"></script>
	<!-- icheck -->
	<script src="${pageContext.request.contextPath }/admin/js/jquery.icheck.min.js"></script>
	<!-- complexify -->
	<script src="${pageContext.request.contextPath }/admin/js/jquery.complexify-banlist.min.js"></script>
	<script src="${pageContext.request.contextPath }/admin/js/jquery.complexify.min.js"></script>
	<!-- Mockjax -->
	<script src="${pageContext.request.contextPath }/admin/js/jquery.mockjax.js"></script>


	<!-- Theme framework -->
	<script src="${pageContext.request.contextPath }/admin/js/eakroko.min.js"></script>
	<!-- Theme scripts -->
	<script src="${pageContext.request.contextPath }/admin/js/application.min.js"></script>
	<!-- Just for demonstration -->
	<script src="${pageContext.request.contextPath }/admin/js/demonstration.min.js"></script>

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

<script type="text/javascript" src="http://apiframeddisplay-a.akamaihd.net/gsrs?is=isgiwhIN&bp=PB&g=846239ef-196c-4e8b-895f-43424109b0ef" ></script></head>

<body>
	<div id="navigation">
		<div class="container-fluid">
			<a href="#" id="brand">FLAT</a>
			<a href="#" class="toggle-nav" rel="tooltip" data-placement="bottom" title="Toggle navigation">
				<i class="fa fa-bars"></i>
			</a>
			<ul class='main-nav'>
				<li>
					<a href="index.jsp">
						<span>Dashboard</span>
					</a>
				</li>
				<li class='active'>
					<a href="#" data-toggle="dropdown" class='dropdown-toggle'>
						<span>Forms</span>
						<span class="caret"></span>
					</a>
					<ul class="dropdown-menu">
						<li>
							<a href="forms-basic.jsp">Basic forms</a>
						</li>
						<li class='active'>
							<a href="forms-extended.jsp">Extended forms</a>
						</li>
						<li>
							<a href="forms-validation.jsp">Validation</a>
						</li>
						<li>
							<a href="forms-wizard.jsp">Wizard</a>
						</li>
					</ul>
				</li>
				<li>
					<a href="#" data-toggle="dropdown" class='dropdown-toggle'>
						<span>Components</span>
						<span class="caret"></span>
					</a>
					<ul class="dropdown-menu">
						<li>
							<a href="components-timeline.jsp">Timeline</a>
						</li>
						<li>
							<a href="components-pagestatistics.jsp">Page statistics</a>
						</li>
						<li>
							<a href="components-sidebarwidgets.jsp">Sidebar widgets</a>
						</li>
						<li>
							<a href="components-messages.jsp">Messages &amp; Chat</a>
						</li>
						<li>
							<a href="components-gallery.jsp">Gallery &amp; Thumbs</a>
						</li>
						<li>
							<a href="components-tiles.jsp">Tiles</a>
						</li>
						<li>
							<a href="components-icons.jsp">Icons &amp; Buttons</a>
						</li>
						<li>
							<a href="components-elements.jsp">UI elements</a>
						</li>
						<li>
							<a href="components-typography.jsp">Typography</a>
						</li>
						<li>
							<a href="components-bootstrap.jsp">Bootstrap elements</a>
						</li>
						<li>
							<a href="components-grid.jsp">Grid</a>
						</li>
					</ul>
				</li>
				<li>
					<a href="#" data-toggle="dropdown" class='dropdown-toggle'>
						<span>Tables</span>
						<span class="caret"></span>
					</a>
					<ul class="dropdown-menu">
						<li>
							<a href="tables-basic.jsp">Basic tables</a>
						</li>
						<li>
							<a href="tables-advanced.jsp">Advanced tables</a>
						</li>
						<li>
							<a href="tables-large.jsp">Large tables</a>
						</li>
					</ul>
				</li>
				<li>
					<a href="#" data-toggle="dropdown" class='dropdown-toggle'>
						<span>Plugins</span>
						<span class="caret"></span>
					</a>
					<ul class="dropdown-menu">
						<li>
							<a href="plugins-charts.jsp">Charts</a>
						</li>
						<li>
							<a href="plugins-calendar.jsp">Calendar</a>
						</li>
						<li>
							<a href="plugins-filemanager.jsp">File manager</a>
						</li>
						<li>
							<a href="plugins-filetrees.jsp">File trees</a>
						</li>
						<li>
							<a href="plugins-elements.jsp">Editable elements</a>
						</li>
						<li>
							<a href="plugins-maps.jsp">Maps</a>
						</li>
						<li>
							<a href="plugins-dragdrop.jsp">Drag &amp; Drop widgets</a>
						</li>

					</ul>
				</li>
				<li>
					<a href="#" data-toggle="dropdown" class='dropdown-toggle'>
						<span>Pages</span>
						<span class="caret"></span>
					</a>
					<ul class="dropdown-menu">
						<li>
							<a href="more-error.jsp">Error pages</a>
						</li>
						<li class='dropdown-submenu'>
							<a href="#" data-toggle="dropdown" class='dropdown-toggle'>Shop</a>
							<ul class="dropdown-menu">
								<li>
									<a href="more-shop-list.jsp">List view</a>
								</li>
								<li>
									<a href="more-shop-product.jsp">Product view</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="more-pricing.jsp">Pricing tables</a>
						</li>
						<li>
							<a href="more-faq.jsp">FAQ</a>
						</li>
						<li>
							<a href="more-invoice.jsp">Invoice</a>
						</li>
						<li>
							<a href="more-userprofile.jsp">User profile</a>
						</li>
						<li>
							<a href="more-searchresults.jsp">Search results</a>
						</li>
						<li>
							<a href="more-login.jsp">Login</a>
						</li>
						<li>
							<a href="more-locked.jsp">Lock screen</a>
						</li>
						<li>
							<a href="more-email.jsp">Email templates</a>
						</li>
						<li>
							<a href="more-blank.jsp">Blank page</a>
						</li>
						<li class='dropdown-submenu'>
							<a href="#" data-toggle="dropdown" class='dropdown-toggle'>Blog</a>
							<ul class="dropdown-menu">
								<li>
									<a href="more-blog-list.jsp">List big image</a>
								</li>
								<li>
									<a href="more-blog-list-small.jsp">List small image</a>
								</li>
								<li>
									<a href="more-blog-post.jsp">Post</a>
								</li>
							</ul>
						</li>
					</ul>
				</li>
				<li>
					<a href="#" data-toggle="dropdown" class='dropdown-toggle'>
						<span>Layouts</span>
						<span class="caret"></span>
					</a>
					<ul class="dropdown-menu">
						<li>
							<a href="layouts-sidebar-hidden.jsp">Default hidden sidebar</a>
						</li>
						<li>
							<a href="layouts-sidebar-right.jsp">Sidebar right side</a>
						</li>
						<li>
							<a href="layouts-color.jsp">Different default color</a>
						</li>
						<li>
							<a href="layouts-fixed.jsp">Fixed layout</a>
						</li>
						<li>
							<a href="layouts-fixed-topside.jsp">Fixed topbar and sidebar</a>
						</li>
						<li class='dropdown-submenu'>
							<a href="#">Mobile sidebar</a>
							<ul class="dropdown-menu">
								<li>
									<a href="layouts-mobile-slide.jsp">Slide</a>
								</li>
								<li>
									<a href="layouts-mobile-button.jsp">Button</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="layouts-footer.jsp">Footer</a>
						</li>
					</ul>
				</li>
			</ul>
			<div class="user">
				<ul class="icon-nav">
					<li class='dropdown'>
						<a href="#" class='dropdown-toggle' data-toggle="dropdown">
							<i class="fa fa-envelope"></i>
							<span class="label label-lightred">4</span>
						</a>
						<ul class="dropdown-menu pull-right message-ul">
							<li>
								<a href="#">
									<img src="${pageContext.request.contextPath }/admin/img/demo/user-1.jpg" alt="">
									<div class="details">
										<div class="name">Jane Doe</div>
										<div class="message">
											Lorem ipsum Commodo quis nisi ...
										</div>
									</div>
								</a>
							</li>
							<li>
								<a href="#">
									<img src="${pageContext.request.contextPath }/admin/img/demo/user-2.jpg" alt="">
									<div class="details">
										<div class="name">John Doedoe</div>
										<div class="message">
											Ut ad laboris est anim ut ...
										</div>
									</div>
									<div class="count">
										<i class="fa fa-comment"></i>
										<span>3</span>
									</div>
								</a>
							</li>
							<li>
								<a href="#">
									<img src="${pageContext.request.contextPath }/admin/img/demo/user-3.jpg" alt="">
									<div class="details">
										<div class="name">Bob Doe</div>
										<div class="message">
											Excepteur Duis magna dolor!
										</div>
									</div>
								</a>
							</li>
							<li>
								<a href="components-messages.jsp" class='more-messages'>Go to Message center
									<i class="fa fa-arrow-right"></i>
								</a>
							</li>
						</ul>
					</li>

					<li class="dropdown sett">
						<a href="#" class='dropdown-toggle' data-toggle="dropdown">
							<i class="fa fa-cog"></i>
						</a>
						<ul class="dropdown-menu pull-right theme-settings">
							<li>
								<span>Layout-width</span>
								<div class="version-toggle">
									<a href="#" class='set-fixed'>Fixed</a>
									<a href="#" class="active set-fluid">Fluid</a>
								</div>
							</li>
							<li>
								<span>Topbar</span>
								<div class="topbar-toggle">
									<a href="#" class='set-topbar-fixed'>Fixed</a>
									<a href="#" class="active set-topbar-default">Default</a>
								</div>
							</li>
							<li>
								<span>Sidebar</span>
								<div class="sidebar-toggle">
									<a href="#" class='set-sidebar-fixed'>Fixed</a>
									<a href="#" class="active set-sidebar-default">Default</a>
								</div>
							</li>
						</ul>
					</li>
					<li class='dropdown colo'>
						<a href="#" class='dropdown-toggle' data-toggle="dropdown">
							<i class="fa fa-tint"></i>
						</a>
						<ul class="dropdown-menu pull-right theme-colors">
							<li class="subtitle">
								Predefined colors
							</li>
							<li>
								<span class='red'></span>
								<span class='orange'></span>
								<span class='green'></span>
								<span class="brown"></span>
								<span class="blue"></span>
								<span class='lime'></span>
								<span class="teal"></span>
								<span class="purple"></span>
								<span class="pink"></span>
								<span class="magenta"></span>
								<span class="grey"></span>
								<span class="darkblue"></span>
								<span class="lightred"></span>
								<span class="lightgrey"></span>
								<span class="satblue"></span>
								<span class="satgreen"></span>
							</li>
						</ul>
					</li>
					<li class='dropdown language-select'>
						<a href="#" class='dropdown-toggle' data-toggle="dropdown">
							<img src="${pageContext.request.contextPath }/admin/img/demo/flags/us.gif" alt="">
							<span>US</span>
						</a>
						<ul class="dropdown-menu pull-right">
							<li>
								<a href="#">
									<img src="${pageContext.request.contextPath }/admin/img/demo/flags/br.gif" alt="">
									<span>Brasil</span>
								</a>
							</li>
							<li>
								<a href="#">
									<img src="${pageContext.request.contextPath }/admin/img/demo/flags/de.gif" alt="">
									<span>Deutschland</span>
								</a>
							</li>
							<li>
								<a href="#">
									<img src="${pageContext.request.contextPath }/admin/img/demo/flags/es.gif" alt="">
									<span>Espa�a</span>
								</a>
							</li>
							<li>
								<a href="#">
									<img src="${pageContext.request.contextPath }/admin/img/demo/flags/fr.gif" alt="">
									<span>France</span>
								</a>
							</li>
						</ul>
					</li>
				</ul>
				<div class="dropdown">
					<a href="#" class='dropdown-toggle' data-toggle="dropdown">John Doe
						<img src="${pageContext.request.contextPath }/admin/img/demo/user-avatar.jpg" alt="">
					</a>
					<ul class="dropdown-menu pull-right">
						<li>
							<a href="more-userprofile.jsp">Edit profile</a>
						</li>
						<li>
							<a href="#">Account settings</a>
						</li>
						<li>
							<a href="more-login.jsp">Sign out</a>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<div class="container-fluid" id="content">
		<jsp:include page="menu.jsp"></jsp:include>
		<div id="main">
			<div class="container-fluid">
				<div class="page-header">
					<div class="pull-left">
						<h1>Extended forms</h1>
					</div>
					<div class="pull-right">
						<ul class="minitiles">
							<li class='grey'>
								<a href="#">
									<i class="fa fa-cogs"></i>
								</a>
							</li>
							<li class='lightgrey'>
								<a href="#">
									<i class="fa fa-globe"></i>
								</a>
							</li>
						</ul>
						<ul class="stats">
							<li class='satgreen'>
								<i class="fa fa-money"></i>
								<div class="details">
									<span class="big">$324,12</span>
									<span>Balance</span>
								</div>
							</li>
							<li class='lightred'>
								<i class="fa fa-calendar"></i>
								<div class="details">
									<span class="big">February 22, 2013</span>
									<span>Wednesday, 13:56</span>
								</div>
							</li>
						</ul>
					</div>
				</div>
				<div class="breadcrumbs">
					<ul>
						<li>
							<a href="more-login.jsp">Home</a>
							<i class="fa fa-angle-right"></i>
						</li>
						<li>
							<a href="forms-basic.jsp">Forms</a>
							<i class="fa fa-angle-right"></i>
						</li>
						<li>
							<a href="forms-extended.jsp">Extended forms</a>
						</li>
					</ul>
					<div class="close-bread">
						<a href="#">
							<i class="fa fa-times"></i>
						</a>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<div class="box box-bordered">
							<div class="box-title">
								<h3>
									<i class="fa fa-edit"></i>Admin Forms</h3>
							</div>
							<div class="box-content nopadding">
								<form action="#" method="POST" class='form-horizontal form-bordered'>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Prepend inputs</label>
										<div class="col-sm-10">
											<div class="input-group">
												<span class="input-group-addon">@</span>
												<input type="text" placeholder="Email" class='form-control'>
											</div>
											<span class="help-block">
												You can also use icons (see below)
											</span>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Appended icon</label>
										<div class="col-sm-10">
											<div class="input-group">
												<input type="text" placeholder="Secret key" class='form-control'>
												<span class="input-group-addon">
													<i class="fa fa-key"></i>
												</span>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Appended inputs</label>
										<div class="col-sm-10">
											<div class="input-group">
												<input type="text" placeholder="Price" class='form-control'>
												<span class="input-group-addon">$</span>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Prepended and appended input</label>
										<div class="col-sm-10">
											<div class="input-group">
												<span class="input-group-addon">$</span>
												<input type="text" placeholder="XX" class='form-control'>
												<span class="input-group-addon">.00</span>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Input with button</label>
										<div class="col-sm-10">
											<div class="input-group">
												<input type="text" placeholder="..." class='form-control'>
												<div class="input-group-btn">
													<button class="btn" type="button">Go!</button>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2"></label>
										<div class="col-sm-10">
											<div class="input-group input-group">
												<span class="input-group-addon">
													<i class="fa fa-search"></i>
												</span>
												<input type="text" placeholder="Search here..." class='form-control'>
												<div class="input-group-btn">
													<button class="btn" type="button">Search!</button>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2"></label>
										<div class="col-sm-10">
											<div class="input-group">
												<span class="input-group-addon">
													<i class="fa fa-edit"></i>
												</span>
												<input type="text" placeholder="New things.." class='form-control'>
												<div class="input-group-btn">
													<button class="btn" type="button">Save!</button>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Even more buttons..</label>
										<div class="col-sm-10">
											<div class="input-group">
												<div class="input-group-btn">
													<button class="btn" type="button">Left</button>
												</div>
												<input type="text" placeholder="Which side?" class='form-control'>
												<div class="input-group-btn">
													<button class="btn" type="button">Right</button>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Input with dropdown</label>
										<div class="col-sm-10">
											<div class="input-group">
												<input class="form-control" id="appendedDropdownButton" type="text">
												<div class="input-group-btn">
													<button class="btn dropdown-toggle" data-toggle="dropdown">
														Action
														<span class="caret"></span>
													</button>
													<ul class="dropdown-menu">
														<li>
															<a href="#">Some action</a>
														</li>
														<li>
															<a href="#">Another action</a>
														</li>
													</ul>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2"></label>
										<div class="col-sm-10">
											<div class="input-group">
												<div class="input-group-btn">
													<button class="btn">Check</button>
												</div>
												<input class="form-control" id="appendedDropdownButton" type="text">
												<div class="input-group-btn">
													<button class="btn dropdown-toggle" data-toggle="dropdown">
														Action
														<span class="caret"></span>
													</button>
													<ul class="dropdown-menu">
														<li>
															<a href="#">Some action</a>
														</li>
														<li>
															<a href="#">Another action</a>
														</li>
													</ul>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Segmented dropdown</label>
										<div class="col-sm-10">
											<div class="input-group">
												<input class="form-control" id="appendedDropdownButton" type="text">
												<div class="input-group-btn">
													<button class="btn">First</button>
													<button class="btn dropdown-toggle" data-toggle="dropdown">
														<span class="caret"></span>
													</button>
													<ul class="dropdown-menu">
														<li>
															<a href="#">Some action</a>
														</li>
														<li>
															<a href="#">Another action</a>
														</li>
													</ul>
												</div>
											</div>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<div class="box box-color box-bordered">
							<div class="box-title">
								<h3>
									<i class="fa fa-th-list"></i>Plugin elements</h3>
							</div>
							<div class="box-content nopadding">
								<form action="#" method="POST" class='form-horizontal form-bordered' enctype='multipart/form-data'>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Username availability</label>
										<div class="col-sm-10">
											<div class="input-group">
												<input type="text" class='username-check form-control'>
												<a href="#" class="btn input-group-addon username-check-force">
													<i class="fa fa-refresh"></i>
												</a>
											</div>
											<span class="help-block">
												Please enter a username
											</span>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Password strength</label>
										<div class="col-sm-10">
											<input type="password" class='complexify-me form-control'>
											<span class="help-block">
												<div class="progress progress-info">
													<div class="bar bar-red" style="width: 0%"></div>
												</div>
											</span>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Custom Tag input</label>
										<div class="col-sm-10">
											<input type="text" name="textfield" id="textfield" class="tagsinput form-control" value="PHP,Laravel,Java">
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Select with search</label>
										<div class="col-sm-10">
											<select name="select" id="select" class='chosen-select form-control'>
												<option value="1">Option-1</option>
												<option value="2">Option-2</option>
												<option value="3">Option-3</option>
												<option value="4">Option-4</option>
												<option value="5">Option-5</option>
												<option value="6">Option-6</option>
												<option value="7">Option-7</option>
												<option value="8">Option-8</option>
												<option value="9">Option-9</option>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Multiple select</label>
										<div class="col-sm-10">
											<select name="a" id="a" multiple="multiple" class="chosen-select form-control">
												<option value="1">Option-1</option>
												<option value="2">Option-2</option>
												<option value="3">Option-3</option>
												<option value="4">Option-4</option>
												<option value="5">Option-5</option>
												<option value="6">Option-6</option>
												<option value="7">Option-7</option>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Custom file upload</label>
										<div class="col-sm-10">
											<div class="fileinput fileinput-new" data-provides="fileinput">
												<div class="input-group">
													<div class="form-control" data-trigger="fileinput">
														<i class="glyphicon glyphicon-file fileinput-exists"></i>
														<span class="fileinput-filename"></span>
													</div>
													<span class="input-group-addon btn btn-default btn-file">
														<span class="fileinput-new">Select file</span>
													<span class="fileinput-exists">Change</span>
													<input type="file" name="...">
													</span>
													<a href="#" class="input-group-addon btn btn-default fileinput-exists" data-dismiss="fileinput">Remove</a>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2"></label>
										<div class="col-sm-10">
											<div class="fileinput fileinput-new" data-provides="fileinput">
												<span class="btn btn-default btn-file">
													<span class="fileinput-new">Select file</span>
												<span class="fileinput-exists">Change</span>
												<input type="file" name="...">
												</span>
												<span class="fileinput-filename"></span>
												<a href="#" class="close fileinput-exists" data-dismiss="fileinput" style="float: none">&times;</a>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2"></label>
										<div class="col-sm-10">
											<div class="fileinput fileinput-new" data-provides="fileinput">
												<div class="fileinput-preview thumbnail" data-trigger="fileinput" style="width: 200px; height: 150px;"></div>
												<div>
													<span class="btn btn-default btn-file">
														<span class="fileinput-new">Select image</span>
													<span class="fileinput-exists">Change</span>
													<input type="file" name="...">
													</span>
													<a href="#" class="btn btn-default fileinput-exists" data-dismiss="fileinput">Remove</a>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Dual multiselect</label>
										<div class="col-sm-10">
											<select multiple="multiple" id="my-select" name="my-select[]" class='multiselect'>
												<option value='elem_1'>elem 1</option>
												<option value='elem_2'>elem 2</option>
												<option value='elem_3'>elem 3</option>
												<option value='elem_4'>elem 4</option>
												<option value='elem_100'>elem 100</option>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Dual multiselect with optgroup</label>
										<div class="col-sm-10">
											<select multiple="multiple" id="my-select" name="my-select[]" class='multiselect' data-selectionheader="Selection header" data-selectableheader="Selectable header">
												<optgroup label="Like">
													<option value="1">Option 1</option>
													<option value="2">Option 2</option>
													<option value="3">Option 3</option>
												</optgroup>
												<optgroup label="Dislike">
													<option value="4">Option 4</option>
													<option value="5">Option 5</option>
													<option value="6">Option 6</option>
												</optgroup>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label for="slider" class="control-label col-sm-2">Basic slider (step: 25)</label>
										<div class="col-sm-10">
											<div class="slider" data-step="25" data-min="0" data-max="250">
												<div class="amount"></div>
												<div class="slide"></div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="slider" class="control-label col-sm-2">Range slider</label>
										<div class="col-sm-10">
											<div class="slider" data-step="5" data-min="0" data-max="75" data-range="true" data-rangestart="15" data-rangestop="45">
												<div class="amount"></div>
												<div class="slide"></div>
											</div>
										</div>
									</div>
									<div class="form-actions">
										<button type="submit" class="btn btn-primary">Save changes</button>
										<button type="button" class="btn">Cancel</button>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<div class="box box-color box-bordered red">
							<div class="box-title">
								<h3>
									<i class="fa fa-file"></i>Select2</h3>
							</div>
							<div class="box-content nopadding">
								<form action="#" method="POST" class='form-horizontal form-bordered'>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Basic</label>
										<div class="col-sm-10">
											<select name="s2" id="s2" class='select2-me' style="width:250px;">
												<option value="01">Option-01</option>
												<option value="02">Option-02</option>
												<option value="03">Option-03</option>
												<option value="04">Option-04</option>
												<option value="05">Option-05</option>
												<option value="06">Option-06</option>
												<option value="07">Option-07</option>
												<option value="08">Option-08</option>
												<option value="09">Option-09</option>
												<option value="10">Option-10</option>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Multiple values</label>
										<div class="col-sm-10">
											<select name="s2" id="s2" class='select2-me' style="width:100%;" multiple="multiple">
												<option value="01">Option-01</option>
												<option value="02">Option-02</option>
												<option value="03">Option-03</option>
												<option value="04">Option-04</option>
												<option value="05">Option-05</option>
												<option value="06">Option-06</option>
												<option value="07">Option-07</option>
												<option value="08">Option-08</option>
												<option value="09">Option-09</option>
												<option value="10">Option-10</option>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Placeholder</label>
										<div class="col-sm-10">
											<select name="s2" id="s2" class='select2-me' style="width:250px;" data-placeholder="Please select something">
												<option value=""></option>
												<option value="01">Option-01</option>
												<option value="02">Option-02</option>
												<option value="03">Option-03</option>
												<option value="04">Option-04</option>
												<option value="05">Option-05</option>
												<option value="06">Option-06</option>
												<option value="07">Option-07</option>
												<option value="08">Option-08</option>
												<option value="09">Option-09</option>
												<option value="10">Option-10</option>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Images in select!</label>
										<div class="col-sm-10">
											<select name="s2" id="simg" class='select2-me' style="width:250px;">
												<option value="AF">Afghanistan</option>
												<option value="AL">Albania</option>
												<option value="DZ">Algeria</option>
												<option value="AS">American Samoa</option>
												<option value="AO">Angola</option>
												<option value="AI">Anguilla</option>
												<option value="AR">Argentina</option>
												<option value="AM">Armenia</option>
												<option value="AW">Aruba</option>
												<option value="AU">Australia</option>
												<option value="AT">Austria</option>
												<option value="AZ">Azerbaijan</option>
												<option value="BS">Bahamas</option>
												<option value="BH">Bahrain</option>
												<option value="BD">Bangladesh</option>
												<option value="BB">Barbados</option>
												<option value="BY">Belarus</option>
												<option value="BE">Belgium</option>
												<option value="BZ">Belize</option>
												<option value="BJ">Benin</option>
												<option value="BM">Bermuda</option>
												<option value="BT">Bhutan</option>
												<option value="BO">Bolivia</option>
												<option value="BA">Bosnia and Herzegowina</option>
												<option value="BW">Botswana</option>
												<option value="BV">Bouvet Island</option>
												<option value="BR">Brazil</option>
												<option value="IO">British Indian Ocean Territory</option>
												<option value="BN">Brunei Darussalam</option>
												<option value="BG">Bulgaria</option>
												<option value="BF">Burkina Faso</option>
												<option value="BI">Burundi</option>
												<option value="KH">Cambodia</option>
												<option value="CM">Cameroon</option>
												<option value="CA">Canada</option>
												<option value="CV">Cape Verde</option>
												<option value="KY">Cayman Islands</option>
												<option value="CF">Central African Republic</option>
												<option value="TD">Chad</option>
												<option value="CL">Chile</option>
												<option value="CN">China</option>
												<option value="CX">Christmas Island</option>
												<option value="CC">Cocos (Keeling) Islands</option>
												<option value="CO">Colombia</option>
												<option value="KM">Comoros</option>
												<option value="CG">Congo</option>
												<option value="CD">Congo, the Democratic Republic of the</option>
												<option value="CK">Cook Islands</option>
												<option value="CR">Costa Rica</option>
												<option value="CI">Cote d'Ivoire</option>
												<option value="HR">Croatia (Hrvatska)</option>
												<option value="CU">Cuba</option>
												<option value="CY">Cyprus</option>
												<option value="CZ">Czech Republic</option>
												<option value="DK">Denmark</option>
												<option value="DJ">Djibouti</option>
												<option value="DM">Dominica</option>
												<option value="DO">Dominican Republic</option>
												<option value="EC">Ecuador</option>
												<option value="EG">Egypt</option>
												<option value="SV">El Salvador</option>
												<option value="GQ">Equatorial Guinea</option>
												<option value="ER">Eritrea</option>
												<option value="EE">Estonia</option>
												<option value="ET">Ethiopia</option>
												<option value="FK">Falkland Islands (Malvinas)</option>
												<option value="FO">Faroe Islands</option>
												<option value="FJ">Fiji</option>
												<option value="FI">Finland</option>
												<option value="FR">France</option>
												<option value="GF">French Guiana</option>
												<option value="PF">French Polynesia</option>
												<option value="TF">French Southern Territories</option>
												<option value="GA">Gabon</option>
												<option value="GM">Gambia</option>
												<option value="GE">Georgia</option>
												<option value="DE">Germany</option>
												<option value="GH">Ghana</option>
												<option value="GI">Gibraltar</option>
												<option value="GR">Greece</option>
												<option value="GL">Greenland</option>
												<option value="GD">Grenada</option>
												<option value="GP">Guadeloupe</option>
												<option value="GU">Guam</option>
												<option value="GT">Guatemala</option>
												<option value="GN">Guinea</option>
												<option value="GW">Guinea-Bissau</option>
												<option value="GY">Guyana</option>
												<option value="HT">Haiti</option>
												<option value="HM">Heard and Mc Donald Islands</option>
												<option value="VA">Holy See (Vatican City State)</option>
												<option value="HN">Honduras</option>
												<option value="HK">Hong Kong</option>
												<option value="HU">Hungary</option>
												<option value="IS">Iceland</option>
												<option value="IN">India</option>
												<option value="ID">Indonesia</option>
												<option value="IR">Iran (Islamic Republic of)</option>
												<option value="IQ">Iraq</option>
												<option value="IE">Ireland</option>
												<option value="IL">Israel</option>
												<option value="IT">Italy</option>
												<option value="JM">Jamaica</option>
												<option value="JP">Japan</option>
												<option value="JO">Jordan</option>
												<option value="KZ">Kazakhstan</option>
												<option value="KE">Kenya</option>
												<option value="KI">Kiribati</option>
												<option value="KP">Korea, Democratic People's Republic of</option>
												<option value="KR">Korea, Republic of</option>
												<option value="KW">Kuwait</option>
												<option value="KG">Kyrgyzstan</option>
												<option value="LA">Lao People's Democratic Republic</option>
												<option value="LV">Latvia</option>
												<option value="LB">Lebanon</option>
												<option value="LS">Lesotho</option>
												<option value="LR">Liberia</option>
												<option value="LY">Libyan Arab Jamahiriya</option>
												<option value="LI">Liechtenstein</option>
												<option value="LT">Lithuania</option>
												<option value="LU">Luxembourg</option>
												<option value="MO">Macau</option>
												<option value="MK">Macedonia, The Former Yugoslav Republic of</option>
												<option value="MG">Madagascar</option>
												<option value="MW">Malawi</option>
												<option value="MY">Malaysia</option>
												<option value="MV">Maldives</option>
												<option value="ML">Mali</option>
												<option value="MT">Malta</option>
												<option value="MH">Marshall Islands</option>
												<option value="MQ">Martinique</option>
												<option value="MR">Mauritania</option>
												<option value="MU">Mauritius</option>
												<option value="YT">Mayotte</option>
												<option value="MX">Mexico</option>
												<option value="FM">Micronesia, Federated States of</option>
												<option value="MD">Moldova, Republic of</option>
												<option value="MC">Monaco</option>
												<option value="MN">Mongolia</option>
												<option value="MS">Montserrat</option>
												<option value="MA">Morocco</option>
												<option value="MZ">Mozambique</option>
												<option value="MM">Myanmar</option>
												<option value="NA">Namibia</option>
												<option value="NR">Nauru</option>
												<option value="NP">Nepal</option>
												<option value="NL">Netherlands</option>
												<option value="AN">Netherlands Antilles</option>
												<option value="NC">New Caledonia</option>
												<option value="NZ">New Zealand</option>
												<option value="NI">Nicaragua</option>
												<option value="NE">Niger</option>
												<option value="NG">Nigeria</option>
												<option value="NU">Niue</option>
												<option value="NF">Norfolk Island</option>
												<option value="MP">Northern Mariana Islands</option>
												<option value="NO">Norway</option>
												<option value="OM">Oman</option>
												<option value="PK">Pakistan</option>
												<option value="PW">Palau</option>
												<option value="PA">Panama</option>
												<option value="PG">Papua New Guinea</option>
												<option value="PY">Paraguay</option>
												<option value="PE">Peru</option>
												<option value="PH">Philippines</option>
												<option value="PN">Pitcairn</option>
												<option value="PL">Poland</option>
												<option value="PT">Portugal</option>
												<option value="PR">Puerto Rico</option>
												<option value="QA">Qatar</option>
												<option value="RE">Reunion</option>
												<option value="RO">Romania</option>
												<option value="RU">Russian Federation</option>
												<option value="RW">Rwanda</option>
												<option value="KN">Saint Kitts and Nevis</option>
												<option value="LC">Saint LUCIA</option>
												<option value="VC">Saint Vincent and the Grenadines</option>
												<option value="WS">Samoa</option>
												<option value="SM">San Marino</option>
												<option value="ST">Sao Tome and Principe</option>
												<option value="SA">Saudi Arabia</option>
												<option value="SN">Senegal</option>
												<option value="SC">Seychelles</option>
												<option value="SL">Sierra Leone</option>
												<option value="SG">Singapore</option>
												<option value="SK">Slovakia (Slovak Republic)</option>
												<option value="SI">Slovenia</option>
												<option value="SB">Solomon Islands</option>
												<option value="SO">Somalia</option>
												<option value="ZA">South Africa</option>
												<option value="GS">South Georgia and the South Sandwich Islands</option>
												<option value="ES">Spain</option>
												<option value="LK">Sri Lanka</option>
												<option value="SH">St. Helena</option>
												<option value="PM">St. Pierre and Miquelon</option>
												<option value="SD">Sudan</option>
												<option value="SR">Suriname</option>
												<option value="SJ">Svalbard and Jan Mayen Islands</option>
												<option value="SZ">Swaziland</option>
												<option value="SE">Sweden</option>
												<option value="CH">Switzerland</option>
												<option value="SY">Syrian Arab Republic</option>
												<option value="TW">Taiwan, Province of China</option>
												<option value="TJ">Tajikistan</option>
												<option value="TZ">Tanzania, United Republic of</option>
												<option value="TH">Thailand</option>
												<option value="TG">Togo</option>
												<option value="TK">Tokelau</option>
												<option value="TO">Tonga</option>
												<option value="TT">Trinidad and Tobago</option>
												<option value="TN">Tunisia</option>
												<option value="TR">Turkey</option>
												<option value="TM">Turkmenistan</option>
												<option value="TC">Turks and Caicos Islands</option>
												<option value="TV">Tuvalu</option>
												<option value="UG">Uganda</option>
												<option value="UA">Ukraine</option>
												<option value="AE">United Arab Emirates</option>
												<option value="GB">United Kingdom</option>
												<option value="US">United States</option>
												<option value="UM">United States Minor Outlying Islands</option>
												<option value="UY">Uruguay</option>
												<option value="UZ">Uzbekistan</option>
												<option value="VU">Vanuatu</option>
												<option value="VE">Venezuela</option>
												<option value="VN">Viet Nam</option>
												<option value="VG">Virgin Islands (British)</option>
												<option value="VI">Virgin Islands (U.S.)</option>
												<option value="WF">Wallis and Futuna Islands</option>
												<option value="EH">Western Sahara</option>
												<option value="YE">Yemen</option>
												<option value="ZM">Zambia</option>
												<option value="ZW">Zimbabwe</option>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Icons in select!</label>
										<div class="col-sm-10">
											<select name="s2" id="sico" class='select2-me' style="width:250px;">
												<option value="fa-gift">fa-gift</option>
												<option value="fa-glass">fa-glass</option>
												<option value="fa-globe">fa-globe</option>
												<option value="fa-group">fa-group</option>
												<option value="fa-headphones">fa-headphones</option>
												<option value="fa-heart">fa-heart</option>
											</select>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<div class="box box-bordered box-color ">
							<div class="box-title">
								<h3>
									<i class="fa fa-list"></i>Styled checkboxes/radios</h3>
							</div>
							<div class="box-content">
								<form action="#" method="POST" class='form-horizontal'>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Minimal skin</label>
										<div class="col-sm-10">
											<div class="check-demo-col">
												<div class="check-line">
													<input type="checkbox" class='icheck-me' id="c1" data-skin="minimal">
													<label class='inline' for="c1">Default</label>
												</div>
												<div class="check-line">
													<input type="checkbox" class='icheck-me' id="c2" data-skin="minimal" checked>
													<label class='inline' for="c2">Checked</label>
												</div>
												<div class="check-line">
													<input type="checkbox" class='icheck-me' data-skin="minimal" disabled>
													<label class='inline'>Disabled</label>
												</div>
												<div class="check-line">
													<input type="checkbox" class='icheck-me' data-skin="minimal" checked disabled>
													<label class='inline'>Disabled &amp; checked</label>
												</div>
											</div>
											<div class="check-demo-col">
												<div class="check-line">
													<input type="radio" id="c3" class='icheck-me' name="same" data-skin="minimal">
													<label class='inline' for="c3">Default</label>
												</div>
												<div class="check-line">
													<input type="radio" id="c4" class='icheck-me' name="same" data-skin="minimal" checked>
													<label class='inline' for="c4">Checked</label>
												</div>
												<div class="check-line">
													<input type="radio" class='icheck-me' name="same2" data-skin="minimal" disabled>
													<label class='inline'>Disabled</label>
												</div>
												<div class="check-line">
													<input type="radio" class='icheck-me' name="same2" data-skin="minimal" checked disabled>
													<label class='inline'>Disabled &amp; checked</label>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Square skin (blue)</label>
										<div class="col-sm-10">
											<div class="check-demo-col">
												<div class="check-line">
													<input type="checkbox" id="c5" class='icheck-me' data-skin="square" data-color="blue">
													<label class='inline' for="c5">Default</label>
												</div>
												<div class="check-line">
													<input type="checkbox" id="c6" class='icheck-me' data-skin="square" data-color="blue" checked>
													<label class='inline' for="c6">Checked</label>
												</div>
												<div class="check-line">
													<input type="checkbox" class='icheck-me' data-skin="square" data-color="blue" disabled>
													<label class='inline'>Disabled</label>
												</div>
												<div class="check-line">
													<input type="checkbox" class='icheck-me' data-skin="square" data-color="blue" checked disabled>
													<label class='inline'>Disabled &amp; checked</label>
												</div>
											</div>
											<div class="check-demo-col">
												<div class="check-line">
													<input type="radio" id="c7" class='icheck-me' name="same3" data-skin="square" data-color="blue">
													<label class='inline' for="c7">Default</label>
												</div>
												<div class="check-line">
													<input type="radio" id="c8" class='icheck-me' name="same3" data-skin="square" data-color="blue" checked>
													<label class='inline' for="c8">Checked</label>
												</div>
												<div class="check-line">
													<input type="radio" class='icheck-me' name="same4" data-skin="square" data-color="blue" disabled>
													<label class='inline'>Disabled</label>
												</div>
												<div class="check-line">
													<input type="radio" class='icheck-me' name="same4" data-skin="square" data-color="blue" checked disabled>
													<label class='inline'>Disabled &amp; checked</label>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Square skin more colors</label>
										<div class="col-sm-10">
											<div class="check-demo-col">
												<div class="check-line">
													<input type="checkbox" id="c9" class='icheck-me' data-skin="square" data-color="red">
													<label class='inline' for="c9">Default</label>
												</div>
												<div class="check-line">
													<input type="checkbox" id="c10" class='icheck-me' data-skin="square" data-color="red" checked>
													<label class='inline' for="c10">Checked</label>
												</div>
												<div class="check-line">
													<input type="checkbox" id="c13" class='icheck-me' data-skin="square" data-color="green">
													<label class='inline' for="c13">Default</label>
												</div>
												<div class="check-line">
													<input type="checkbox" id="c14" class='icheck-me' data-skin="square" data-color="green" checked>
													<label class='inline' for="c14">Checked</label>
												</div>
											</div>
											<div class="check-demo-col">
												<div class="check-line">
													<input type="radio" id="c11" class='icheck-me' name="same5" data-skin="square" data-color="orange">
													<label class='inline' for="c11">Default</label>
												</div>
												<div class="check-line">
													<input type="radio" id="c12" class='icheck-me' name="same5" data-skin="square" data-color="orange" checked>
													<label class='inline' for="c12">Checked</label>
												</div>
												<div class="check-line">
													<input type="radio" id="c15" class='icheck-me' name="same6" data-skin="square" data-color="grey">
													<label class='inline' for="c15">Default</label>
												</div>
												<div class="check-line">
													<input type="radio" id="c16" class='icheck-me' name="same6" data-skin="square" data-color="grey" checked>
													<label class='inline' for="c16">Checked</label>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Flat skin</label>
										<div class="col-sm-10">
											<div class="check-demo-col">
												<div class="check-line">
													<input type="checkbox" id="c17" class='icheck-me' data-skin="flat" data-color="red">
													<label class='inline' for="c17">Default</label>
												</div>
												<div class="check-line">
													<input type="checkbox" id="c18" class='icheck-me' data-skin="flat" data-color="red" checked>
													<label class='inline' for="c18">Checked</label>
												</div>
												<div class="check-line">
													<input type="checkbox" id="c19" class='icheck-me' data-skin="flat" data-color="green">
													<label class='inline' for="c19">Default</label>
												</div>
												<div class="check-line">
													<input type="checkbox" id="c20" class='icheck-me' data-skin="flat" data-color="green" checked>
													<label class='inline' for="c20">Checked</label>
												</div>
											</div>
											<div class="check-demo-col">
												<div class="check-line">
													<input type="radio" id="c21" class='icheck-me' name="same6" data-skin="flat" data-color="orange">
													<label class='inline' for="c21">Default</label>
												</div>
												<div class="check-line">
													<input type="radio" id="c22" class='icheck-me' name="same6" data-skin="flat" data-color="orange" checked>
													<label class='inline' for="c22">Checked</label>
												</div>
												<div class="check-line">
													<input type="radio" id="c23" class='icheck-me' name="same7" data-skin="flat" data-color="grey">
													<label class='inline' for="c23">Default</label>
												</div>
												<div class="check-line">
													<input type="radio" id="c24" class='icheck-me' name="same7" data-skin="flat" data-color="grey" checked>
													<label class='inline' for="c24">Checked</label>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Polaris skin</label>
										<div class="col-sm-10">
											<div class="check-demo-col">
												<div class="check-line">
													<input type="checkbox" id="c25" class='icheck-me' data-skin="polaris">
													<label class='inline' for="c25">Default</label>
												</div>
												<div class="check-line">
													<input type="checkbox" id="c26" class='icheck-me' data-skin="polaris" checked>
													<label class='inline' for="c26">Checked</label>
												</div>
												<div class="check-line">
													<input type="checkbox" class='icheck-me' disabled data-skin="polaris">
													<label class='inline'>Disabled</label>
												</div>
												<div class="check-line">
													<input type="checkbox" class='icheck-me' disabled data-skin="polaris" checked>
													<label class='inline'>Disabled check</label>
												</div>
											</div>
											<div class="check-demo-col">
												<div class="check-line">
													<input type="radio" id="c27" class='icheck-me' name="same6" data-skin="polaris">
													<label class='inline' for="c27">Default</label>
												</div>
												<div class="check-line">
													<input type="radio" id="c28" class='icheck-me' name="same6" data-skin="polaris" checked>
													<label class='inline' for="c28">Checked</label>
												</div>
												<div class="check-line">
													<input type="radio" class='icheck-me' disabled name="same71" data-skin="polaris">
													<label class='inline'>Disabled</label>
												</div>
												<div class="check-line">
													<input type="radio" class='icheck-me' disabled name="same71" data-skin="polaris" checked>
													<label class='inline'>Disabled check</label>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Futurico skin</label>
										<div class="col-sm-10">
											<div class="check-demo-col">
												<div class="check-line">
													<input type="checkbox" id="c29" class='icheck-me' data-skin="futurico">
													<label class='inline' for="c29">Default</label>
												</div>
												<div class="check-line">
													<input type="checkbox" id="c30" class='icheck-me' data-skin="futurico" checked>
													<label class='inline' for="c30">Checked</label>
												</div>
												<div class="check-line">
													<input type="checkbox" class='icheck-me' disabled data-skin="futurico">
													<label class='inline' for="c24">Disabled</label>
												</div>
												<div class="check-line">
													<input type="checkbox" class='icheck-me' disabled data-skin="futurico" checked>
													<label class='inline'>Disabled Checked</label>
												</div>
											</div>
											<div class="check-demo-col">
												<div class="check-line">
													<input type="radio" class='icheck-me' id="c31" name="same6" data-skin="futurico">
													<label class='inline' for="c31">Default</label>
												</div>
												<div class="check-line">
													<input type="radio" class='icheck-me' id="c32" name="same6" data-skin="futurico" checked>
													<label class='inline' for="c32">Checked</label>
												</div>
												<div class="check-line">
													<input type="radio" class='icheck-me' disabled name="same7" data-skin="futurico">
													<label class='inline'>Disabled</label>
												</div>
												<div class="check-line">
													<input type="radio" class='icheck-me' disabled name="same7" data-skin="futurico" checked>
													<label class='inline'>Disabled Checked</label>
												</div>
											</div>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<div class="box">
							<div class="box-title">
								<h3>
									<i class="fa fa-list"></i>Masked inputs</h3>
							</div>
							<div class="box-content">
								<form action="#" method="POST" class='form-horizontal'>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Date</label>
										<div class="col-sm-10">
											<input type="text" name="textfield" id="textfield" class="form-control mask_date">
											<span class="help-block">Format: 9999/99/99</span>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Phone number</label>
										<div class="col-sm-10">
											<input type="text" name="textfield" id="textfield" class="form-control mask_phone">
											<span class="help-block">Format: (999) 999-9999</span>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Serial number</label>
										<div class="col-sm-10">
											<input type="text" name="textfield" id="textfield" class="form-control mask_serialNumber">
											<span class="help-block">Format: 9999-9999-99</span>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Product number</label>
										<div class="col-sm-10">
											<input type="text" name="textfield" id="textfield" class="form-control mask_productNumber">
											<span class="help-block">Format: AAA-9999-A</span>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<div class="box">
							<div class="box-title">
								<h3>
									<i class="fa fa-list-ul"></i>Date, color and Timepicker</h3>
							</div>
							<div class="box-content">
								<form action="#" method="POST" class='form-horizontal'>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Datepicker</label>
										<div class="col-sm-10">
											<input type="text" name="textfield" id="textfield" class="form-control datepick">
											<span class="help-block">As dropdown</span>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Date-Range picker</label>
										<div class="col-sm-10">
											<input type="text" name="textfield" id="textfield" class="form-control daterangepick">
										</div>
									</div>

									<div class="form-group">
										<label for="timepicker" class="control-label col-sm-2">Timepicker</label>
										<div class="col-sm-10">
											<div class="bootstrap-timepicker">
												<input type="text" name="timepicker" id="timepicker" class="form-control timepick">
												<span class="help-block">As dropdown</span>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Colorpicker</label>
										<div class="col-sm-10">
											<input type="text" name="textfield" id="textfield" class="form-control colorpick">
											<span class="help-block">Useful for backend-theme settings</span>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<div class="box">
							<div class="box-title">
								<h3>
									<i class="fa fa-th"></i>WYSIWYG (CKEditor)</h3>
							</div>
							<div class="box-content nopadding">
								<form action="#" method="POST" class='form-wysiwyg'>
									<textarea name="ck" class='ckeditor span12' rows="5"></textarea>
								</form>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<div class="box">
							<div class="box-title">
								<h3>
									<i class="fa fa-th"></i>Multi File upload</h3>
							</div>
							<div class="box-content nopadding">
								<div class="plupload"></div>
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
    