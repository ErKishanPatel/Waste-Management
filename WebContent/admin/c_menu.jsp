<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<div id="left" class="ui-sortable ui-resizable">
	<form class="search-form" method="GET" action="search-results.jsp">
		<div class="search-pane">
			<input type="text" placeholder="Search here..." name="search">
			<button type="submit">
				<i class="fa fa-search"></i>
			</button>
		</div>
	</form>
	<div class="subnav">
		<div class="subnav-title ui-sortable-handle">
			<a class="toggle-subnav" href="#"> <i class="fa fa-angle-down"></i>
				<span>Content</span>
			</a>
		</div>
		<ul class="subnav-menu">

			<!-- <li class="dropdown"><a href="admin/c_reg.jsp">Company
					Registration</a></li>
			 --><li class="dropdown"><a data-toggle="dropdown" href="#">Manage
					Staff</a>
				<ul class="dropdown-menu">
					<li><a
						href="<%=request.getContextPath()%>/admin/c_manage_staff.jsp">Add
							Staff</a></li>
					<li><a
						href="<%=request.getContextPath()%>/C_Staff_Controller?flag=search">Search
							Staff</a></li>
				</ul></li>
			<li class="dropdown"><a data-toggle="dropdown" href="#">Manage
					Assign Area</a>
				<ul class="dropdown-menu">
					<li><a
						href="<%=request.getContextPath()%>/C_Assign_Area_Controller?flag=load">Assign
							Area to Staff</a></li>
					<li><a
						href="<%=request.getContextPath()%>/C_Assign_Area_Controller?flag=search">Search
							Located Area</a></li>


				</ul></li>


			<li class="dropdown"><a data-toggle="dropdown" href="#">Manage
					Complaint</a>
				<ul class="dropdown-menu">
					<li><a
						href="<%=request.getContextPath()%>/U_Complaint_Controller?flag=search2">View
							Complaint</a></li>

				</ul></li>
			<%-- <li class="dropdown"><a data-toggle="dropdown" href="#">Notification</a>
				<ul class="dropdown-menu">
					<li><a href="notification.jsp">Manage Notification</a></li>
					<li><a
						href="<%=request.getContextPath()%>/Noti_Controller?flag=search">Search
							Notification</a></li>
				</ul></li> --%>
		</ul>
	</div>
	 <div class="subnav subnav-hidden">

		<ul class="subnav-menu" style="display: none;">
			<li><a href="#">Menu</a></li>
			<li class="dropdown"><a data-toggle="dropdown" href="#">With
					submenu</a>
				<ul class="dropdown-menu">
					<li><a href="#">Action #1</a></li>
					<li><a href="#">Antoher Link</a></li>
					<li class="dropdown-submenu"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">More stuff</a>
						<ul class="dropdown-menu">
							<li><a href="#">This is level 3</a></li>
							<li><a href="#">Easy to use</a></li>
						</ul></li>
				</ul></li>
			<li><a href="#">Security settings</a></li>
		</ul>
	</div>
	<div class="ui-resizable-handle ui-resizable-e"
		style="z-index: 90; height: 342px;"></div>
</div> 