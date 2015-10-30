<header id="header">
	<section class="container">
		<h1 id="logo">
			<a href="u_index.jsp">E-governance for trash control</a>
		</h1>
		<nav id="nav">
			<div class="navbar navbar-inverse">
				<div class="navbar-inner">

					<button type="button" class="btn btn-navbar" data-toggle="collapse"
						data-target=".nav-collapse">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>

					<div class="nav-collapse collapse">

						<div class="grid_16 drop clearfix">

							<div class="action-links" id="action-links">
								<ul class="links clearfix">
									<li class="last-child last"
										style='display: block; float: left; font-size: 18px; line-height: 20px; margin-left: 10px;'>
										<a title="Register" href="u_reg.jsp" id="top-nav-register">Register</a>
									</li>

									<li
										style='display: block; float: left; font-size: 18px; line-height: 20px; margin-left: 20px;'><a
										href="login.jsp" id="top-nav-login">Login</a></li>
									<!--  <li style='  display: block;    float: left;    font-size: 18px;    line-height: 20px;    margin-left: 20px;'><a href="login.jsp" id="top-nav-login">Logout</a></li> -->
								</ul>
							</div>

							<div class="mini-cart" id="mini-cart">&nbsp;</div>

						</div>



						<ul class="nav">
							<li class="active"><a href="u_index.jsp">Home</a></li>
							<li class="dropdown"><a class="dropdown-toggle" href="#"
								data-toggle="dropdown">Company <b class="caret"></b>
							</a>
								<ul class="dropdown-menu">

									<li><a href="c_reg.jsp">New Company Registration</a></li>
								</ul></li>

							<!-- <li class="dropdown"> <a class="dropdown-toggle" href="#" data-toggle="dropdown">Blog <b class="caret"></b> </a>
<ul class="dropdown-menu">
<li><a href="blog.jsp">Blog</a></li>
<li><a href="blog-detail.jsp">Blog Detail</a></li>
<li><a href="blog-double-sidebar.jsp">Blog Double Sidebar</a></li>
</ul>
</li> -->
							<li class="dropdown"><a class="dropdown-toggle" href="#"
								data-toggle="dropdown">Features <b class="caret"></b>
							</a>
								<ul class="dropdown-menu">
									<li><a
										href="<%=request.getContextPath()%>/U_Wsate_Info_Controller?flag=load">Post
											Waste Information</a></li>
									<li><a
										href="<%=request.getContextPath()%>/U_Sch_Controller?flag=load"">
											Check Schedule</a></li>




									<li><a
										href="<%=request.getContextPath()%>/U_Garbage_allocate_Controller?flag=load">Request
											For Garbage Allocation</a></li>
									<li><a
										href="<%=request.getContextPath()%>/U_TrackDust_Controller?flag=load"">Track
											Dustbin </a></li>
									<li><a href="post_complain.jsp">Complaint</a></li>

									<li><a
										href="<%=request.getContextPath()%>/U_Progress_Controller?flag=load">Progress
											Line</a></li>
									<li><a href="faq.jsp">FAQ</a></li>
								</ul></li>
							<li>
							<li><a href="feedback.jsp">Feedback</a></li>
							<li><a
								href="<%=request.getContextPath()%>/Noti_Controller?flag=search2">News
									and Events</a></li>



						</ul>



					</div>

				</div>

			</div>

		</nav>
	</section>
</header>

