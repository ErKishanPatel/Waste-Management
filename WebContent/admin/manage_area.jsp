<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html>
	<head>
		<meta charset="utf-8"><meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" /><meta name="apple-mobile-web-app-capable" content="yes" /><meta name="apple-mobile-web-app-status-bar-style" content="black-translucent" /><title>Manage Area</title> <link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/bootstrap.min.css"><link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/jquery-ui.min.css"><link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/style.css"><link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/themes.css"><script src="${pageContext.request.contextPath }/admin/js/jquery.min.js"></script> <!--//--><script src="${pageContext.request.contextPath }/admin/js/jquery.nicescroll.min.js"></script> <!--//--><script src="${pageContext.request.contextPath }/admin/js/jquery.imagesloaded.min.js"></script> <!--//--><script src="${pageContext.request.contextPath }/admin/js/jquery-ui.js"></script> <!--//--><script src="${pageContext.request.contextPath }/admin/js/jquery.touch-punch.min.js"></script> <!--//--><script src="${pageContext.request.contextPath }/admin/js/jquery.slimscroll.min.js"></script> <!--//--><script src="${pageContext.request.contextPath }/admin/js/bootstrap.min.js"></script> <!--//--><script src="${pageContext.request.contextPath }/admin/js/jquery.bootbox.js"></script> <!--//--><script src="${pageContext.request.contextPath }/admin/js/eakroko.min.js"></script> <!--//--><script src="${pageContext.request.contextPath }/admin/js/application.min.js"></script> <!--//--><script src="${pageContext.request.contextPath }/admin/js/demonstration.min.js"></script> <!--[if lte IE 9]><script src="${pageContext.request.contextPath }/admin/js/jquery.placeholder.min.js"></script> <script>
			$(document).ready(function() {
				$('input, textarea').placeholder();
			});
		</script> <![endif]--><!--//--><link rel="shortcut icon" href="${pageContext.request.contextPath }/admin/img/favicon.ico" /><link rel="apple-touch-icon-precomposed" href="${pageContext.request.contextPath }/admin/img/apple-touch-icon-precomposed.png" />
		<script>
  function loadWard()
	{
	  

		var zoneId=document.getElementById("zoneId");
		var xmlhttp;
		//alert("2222");
		if (window.XMLHttpRequest)
		  {// code for IE7+, Firefox, Chrome, Opera, Safari
		  	xmlhttp=new XMLHttpRequest();
		  }
		else
		  {// code for IE6, IE5
		  	xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
		  }
		
				removeAllWard();
		
		xmlhttp.onreadystatechange = function() 
		{
			if (xmlhttp.readyState == 4)
			{
				var jsonObj = JSON.parse(xmlhttp.responseText);
				for(i=0 ; i < jsonObj.length ; i++)
				{
					var createOption=document.createElement("option");
					
					createOption.value=jsonObj[i].wardId;
					createOption.text=jsonObj[i].wardName;
					
					document.areaForm.wardId.options.add(createOption);
					
				}
			}
			else
			{
				loader();
			}
		}
		//alert("zzz is jj");
		xmlhttp.open("get", "${pageContext.request.contextPath}/Area_Controller?flag=loadWard&zoneId="+zoneId.value, true);
		xmlhttp.send();
		/* jQuery(".chosen-select1").chosen({'width':'100%','white-space':'nowrap'}); */
		/* Holds the status of the XMLHttpRequest. Changes from 0 to 4:
			0: request not initialized
			1: server connection established
			2: request received
			3: processing request
			4: request finished and response is ready */
	}
	
  
  function removeAllWard()
	{
	  var removeWard=document.areaForm.wardId.options.length;
		for(i=removeWard ; i>0 ; i-- )
		{
			document.areaForm.wardId.remove(i);
		}
	}

</script>
		
		</head>
			<body><jsp:include page="navigation.jsp"></jsp:include>
	<div 	class="container-fluid" id="content">
			<jsp:include page="menu.jsp"></jsp:include>
			<div id="main">
				<div class="container-fluid">
				
				
				
					<div class="row">
						<div class="col-sm-12">
							<div class="box box-bordered box-color">
								<div class="box-title">
									<h3>
										<i class="fa fa-th-list"></i>Manage Area</h3>
								</div>
							<div class="box-content nopadding">
								<form action=" <%=request.getContextPath()%>/Area_Controller?flag=insert" method="POST" name="areaForm" class='form-horizontal form-bordered'>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Zone Name</label>
										<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
										<div class="col-sm-10">
										<select name="zoneId" id="zoneId"  onchange="loadWard()"data-rule-required="true" class="form-control">
													<option>Choose One</option>
												<c:forEach items="${sessionScope.zone }" var="x">
												<option value="${x.zoneId }">${x.zoneName }</option>
												</c:forEach>
											</select>
											
										</div>
									</div>
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Ward Name</label>
										<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
										<div class="col-sm-10">
										<select name="wardId" id="wardId" data-rule-required="true" class="form-control">
											<option>Choose One</option>
										</select>										
											
										</div>
									</div>
									
									<div class="form-group">
										<label for="textfield" class="control-label col-sm-2">Add Area</label>
										<div class="col-sm-10">
											<input type="text" name="area_name" id="textfield" placeholder="Text input" class="form-control">
										</div>
									</div>
									
									
									<div class="form-group">
										<label for="textarea" class="control-label col-sm-2">Area Description</label>
										<div class="col-sm-10">
											<textarea name="area_des" id="textarea" rows="5" placeholder="Write Your Text Here..." class="form-control"></textarea>
										</div>
									</div>
									<div class="form-actions col-sm-offset-2 col-sm-10">
										<button type="submit" class="btn btn-primary">Submit</button>
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