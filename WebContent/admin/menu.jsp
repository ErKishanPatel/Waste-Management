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
					<a class="toggle-subnav" href="#">
						<i class="fa fa-angle-down"></i>
						<span>Content</span>
					</a>
				</div>
				<ul class="subnav-menu">
					<li class="dropdown">					
					<a href="<%=request.getContextPath() %>/C_Reg_Controller?flag=search">Search Company</a>	
					</li>
					<li class="dropdown">
						<a data-toggle="dropdown" href="#">Manage Govt_Staff</a>
						<ul class="dropdown-menu">
							<li>
								<a href="<%=request.getContextPath() %>/admin/s_reg.jsp">Add Govt_Staff</a>
							</li>
							<li>
								<a href="<%=request.getContextPath() %>/S_Reg_Controller?flag=search">Search Govt_Staff</a>
							</li>

							
						</ul>
					</li>
					<li class="dropdown">
						<a href="<%=request.getContextPath() %>/U_Reg_Controller?flag=search">Manage User</a>
					</li>
					
					<li class="dropdown">
						<a data-toggle="dropdown" href="#">Manage Dustbin</a>
						<ul class="dropdown-menu">
							<li>
								<a href="add_dustbin.jsp">Add Dustbin</a>
							</li>
							<li>
								<a href="<%=request.getContextPath() %>/Dust_Controller?flag=search">Search Dustbin</a>
							</li>

							
						</ul>
					</li>
					
					<li class="dropdown">
						<a data-toggle="dropdown" href="#">Manage Category</a>
						<ul class="dropdown-menu">
							<li>
								<a href="manage_category.jsp">Add Category</a>
							</li>
							<li>
								<a href="<%=request.getContextPath() %>/Category_Controller?flag=search">Search Category</a>
							</li>

							
						</ul>
					</li>
					<li class="dropdown">
						<a data-toggle="dropdown" href="#">Manage Subcategory</a>
						<ul class="dropdown-menu">
							<li>
								<a href="<%=request.getContextPath() %>/Subcat_Controller?flag=load">Add Subcategory</a>
							</li>
							<li>
								<a href="<%=request.getContextPath() %>/Subcat_Controller?flag=search">Search Subcategory</a>
							</li>
							
						</ul>
					</li>
					<li class="dropdown">
						<a data-toggle="dropdown" href="#">Manage Zone</a>
						<ul class="dropdown-menu">
							<li>
								<a href="manage_zone.jsp">Add Zone</a>
							</li>
							<li>
								<a href="<%=request.getContextPath() %>/Zone_Controller?flag=search">Search Zone</a>
							</li>

							
						</ul>
					</li>
					<li class="dropdown">
						<a data-toggle="dropdown" href="#">Manage Ward</a>
						<ul class="dropdown-menu">
							<li>
								<a href="<%=request.getContextPath() %>/Ward_Controller?flag=load">Add Ward</a>
							</li>
							<li>
								<a href="<%=request.getContextPath() %>/Ward_Controller?flag=search">Search Ward</a>
							</li>
						</ul>
					</li>
					<li class="dropdown">
						<a data-toggle="dropdown" href="#">Manage Area</a>
						<ul class="dropdown-menu">
							<li>
								<a href="<%=request.getContextPath() %>/Area_Controller?flag=load">Add Area</a>
							</li>
							<li>
								<a href="<%=request.getContextPath() %>/Area_Controller?flag=search">Search Area</a>
							</li>
						</ul>
					</li>
					<li class="dropdown">
						<a data-toggle="dropdown" href="#">Manage Street</a>
						<ul class="dropdown-menu">
							<li>
								<a href="<%=request.getContextPath() %>/Street_Controller?flag=load">Add Street</a>
							</li>
							<li>
							<a href="<%=request.getContextPath() %>/Street_Controller?flag=search">Search Street</a>
							</li>
						</ul>
					</li>
					<li class="dropdown">
						<a data-toggle="dropdown" href="#">Manage Schedule</a>
						<ul class="dropdown-menu">
							<li>
								<a href="<%=request.getContextPath() %>/Schedule_Controller?flag=load">Add Schedule</a>
							</li>
							<li>
								<a href="<%=request.getContextPath() %>/Schedule_Controller?flag=search">Search Schedule</a>
							</li>
						</ul>
					</li>
					<li class="dropdown">
						<a data-toggle="dropdown" href="#">Road Side Unit</a>
						<ul class="dropdown-menu">
							<li>
								<a href="<%=request.getContextPath() %>/Road_Side_Unit_Controller?flag=load">Manage Road Side Unit</a>
							</li>
							<li>
								<a href="<%=request.getContextPath() %>/Road_Side_Unit_Controller?flag=search">Search Road Side Unit </a>
							</li>
						</ul>
					</li>
					
					<li class="dropdown">
						<a data-toggle="dropdown" href="#">Manage Complaint</a>
						<ul class="dropdown-menu">
							<li>
							<a href="<%=request.getContextPath() %>/U_Complaint_Controller?flag=search">View Complaint</a>
								
							</li>
							
						</ul>
					</li>
					<li class="dropdown">
						<a data-toggle="dropdown" href="#">Notification</a>
						<ul class="dropdown-menu">
							<li>
								<a href="<%=request.getContextPath() %>/admin/notification.jsp">Manage Notification</a>
							</li>
							<li>
								<a href="<%=request.getContextPath() %>/Noti_Controller?flag=search">Search Notificaton</a>
								
							</li>
						</ul>
					</li>
					
					
					
				</ul>
			</div>
			<!-- <div class="subnav">
				<div class="subnav-title ui-sortable-handle">
					<a class="toggle-subnav" href="#">
						<i class="fa fa-angle-down"></i>
						<span>Settings</span>
					</a>
				</div>
				<ul class="subnav-menu">
					<li>
						<a href="#">Theme settings</a>
					</li>
					<li class="dropdown">
						<a data-toggle="dropdown" href="#">Page settings</a>
						<ul class="dropdown-menu">
							<li>
								<a href="#">Action #1</a>
							</li>
							<li>
								<a href="#">Antoher Link</a>
							</li>
							<li class="dropdown-submenu">
								<a class="dropdown-toggle" data-toggle="dropdown" href="#">Go to level 3</a>
								<ul class="dropdown-menu">
									<li>
										<a href="#">This is level 3</a>
									</li>
									<li>
										<a href="#">Unlimited levels</a>
									</li>
									<li>
										<a href="#">Easy to use</a>
									</li>
								</ul>
							</li>
						</ul>
					</li>
					<li>
						<a href="#">Security settings</a>
					</li>
				</ul>
			</div>
			 --><div class="subnav subnav-hidden">
				<div class="subnav-title ui-sortable-handle">
					<!-- <a class="toggle-subnav" href="#">
						<i class="fa fa-angle-right"></i>
						<span>Default hidden</span>
					</a> -->
				</div>
				<ul class="subnav-menu" style="display: none;">
					<li>
						<a href="#">Menu</a>
					</li>
					<li class="dropdown">
						<a data-toggle="dropdown" href="#">With submenu</a>
						<ul class="dropdown-menu">
							<li>
								<a href="#">Action #1</a>
							</li>
							<li>
								<a href="#">Antoher Link</a>
							</li>
							<li class="dropdown-submenu">
								<a class="dropdown-toggle" data-toggle="dropdown" href="#">More stuff</a>
								<ul class="dropdown-menu">
									<li>
										<a href="#">This is level 3</a>
									</li>
									<li>
										<a href="#">Easy to use</a>
									</li>
								</ul>
							</li>
						</ul>
					</li>
					<li>
						<a href="#">Security settings</a>
					</li>
				</ul>
			</div>
		<div class="ui-resizable-handle ui-resizable-e" style="z-index: 90; height: 342px;"></div></div>