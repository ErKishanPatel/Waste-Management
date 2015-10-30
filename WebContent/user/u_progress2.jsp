<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Schedule</title>
<meta name="description" content="Place your description here">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<script type="text/javascript">
//<![CDATA[
try{if (!window.CloudFlare) {var CloudFlare=[{verbose:0,p:0,byc:0,owlid:"cf",bag2:1,mirage2:0,oracle:0,paths:{cloudflare:"/cdn-cgi/nexp/dok3v=1613a3a185/"},atok:"72c4cf8fdab30920768768106553caef",petok:"c711af821a2c59e68102d17e38fbcae1b0926805-1427956717-1800",zone:"crunchpress.com",rocket:"0",apps:{}}];CloudFlare.push({"apps":{"ape":"28ebf57f5913081a707f59771d93962e"}});!function(a,b){a=document.createElement("script"),b=document.getElementsByTagName("script")[0],a.async=!0,a.src="//ajax.cloudflare.com/cdn-cgi/nexp/dok3v=7e13c32551/cloudflare.min.js",b.parentNode.insertBefore(a,b)}()}}catch(e){};
//]]>
</script>
<link rel="stylesheet" href="css/style.css" type="text/css" media="all">
 
<link rel="stylesheet" href="css/flexslid.css" type="text/css" media="screen">
 
<link rel="stylesheet" href="css/bootstrap.css" type="text/css" media="screen">
 
<link rel="stylesheet" type="text/css" href="css/elastislide.css"/>
 
<link rel="stylesheet" href="css/switcher.css">
 
<link rel="stylesheet" name="skins" href="css/default.css" type="text/css" media="all">
<!--[if lt IE 7]>

            <script type="text/javascript" src="js/ie6_script_other.js"></script>

        <![endif]-->
<!--[if lt IE 9]>

            <script type="text/javascript" src="js/html5.js"></script>

        <![endif]-->
 
</head>
<body>
<div class="wrapper">
 
<jsp:include page="u_header.jsp"></jsp:include> 
<section id="banner" class="inner-b"> <img src="images/404_01.png" alt=""/> </section>
 
<section class="content-holder1 inner-pages">
<section class="container">
<section class="help-holder">
<article class="left">
<h3>Progress</h3>

										
				<table class="table table-hover table-nomargin table-bordered dataTable" border="1">
					<thead>
					<tr>
						<th>Area</th>
					
						
						<!-- <th class='hidden-480'>Options</th> -->
					</tr>
					</thead>
					<tbody>
					     <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
					 <c:forEach items="${sessionScope.areaProgress}" var="x">
					<tr>
						
						 
				<td>${x.areaName}</td> 
				
					</tr>
					 </c:forEach> 
										</tbody>
				</table>
				<h4>Progress Of Your Area..</h4>
	<div class="progress progress-success progress-striped active">
<div class="bar" style="width: 40%"></div>
</div>
</article>
</section>
</section>
</section>
 <jsp:include page="footer_21.jsp"></jsp:include> 
<jsp:include page="footer_1.jsp"></jsp:include></div>

 
<script type="text/javascript" src="js/jquery00.js"></script>
<script src="js/modernizr.custom.17475.js"></script>
 
<script type="text/javascript" src="js/focus.js"></script>
 
<script type="text/javascript" src="js/bootstrap.js"></script>
 
<script type="text/javascript" src="js/jquery.elastislide.js"></script>
<script type="text/javascript">

$( '#carousel' ).elastislide();

</script>
 
<script type="text/javascript" src="js/slider.js"></script>
<script src="js/cockies.js"></script>
 
<script src="js/styleswi.js"></script>
 
</body>
</html>
    