<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Post Complaint</title>
<meta name="description" content="Place your description here">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<script type="text/javascript">
//<![CDATA[
try{if (!window.CloudFlare) {var CloudFlare=[{verbose:0,p:0,byc:0,owlid:"cf",bag2:1,mirage2:0,oracle:0,paths:{cloudflare:"/cdn-cgi/nexp/dok3v=1613a3a185/"},atok:"72c4cf8fdab30920768768106553caef",petok:"c711af821a2c59e68102d17e38fbcae1b0926805-1427956717-1800",zone:"crunchpress.com",rocket:"0",apps:{}}];CloudFlare.push({"apps":{"ape":"28ebf57f5913081a707f59771d93962e"}});!function(a,b){a=document.createElement("script"),b=document.getElementsByTagName("script")[0],a.async=!0,a.src="//ajax.cloudflare.com/cdn-cgi/nexp/dok3v=7e13c32551/cloudflare.min.js",b.parentNode.insertBefore(a,b)}()}}catch(e){};
//]]>
</script>
<link rel="stylesheet" href="${pageContext.request.contextPath }/user/css/style.css" type="text/css" media="all">
 
<link rel="stylesheet" href="${pageContext.request.contextPath }/user/css/flexslid.css" type="text/css" media="screen">
 
<link rel="stylesheet" href="${pageContext.request.contextPath }/user/css/bootstrap.css" type="text/css" media="screen">
 
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/user/css/elastislide.css"/>
 
<link rel="stylesheet" href="${pageContext.request.contextPath }/user/css/switcher.css">
 
<link rel="stylesheet" name="skins" href="${pageContext.request.contextPath }/user/css/default.css" type="text/css" media="all">
<!--[if lt IE 7]>

            <script type="text/javascript" src="${pageContext.request.contextPath }/user/js/ie6_script_other.js"></script>

        <![endif]-->
<!--[if lt IE 9]>

            <script type="text/javascript" src="${pageContext.request.contextPath }/user/js/html5.js"></script>

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
<h3>Post Your Complaint Here..</h3>

<form action="<%=request.getContextPath()%>/U_Complaint_Controller" method="post">
<ul class="comm-list">
<li>
<label>Complain</label>
<input name="comp" id="name" type="text" class="comm-field">
</li>
<li>

<li>
<label>Description</label>
<textarea name="comp_des" id="comments" cols="4" rows="20" class="comm-area"></textarea>
</li>
<li>
<input type="hidden" name="flag" value="insert">
<input name="" type="submit" class="send-btn" value="Submit">

</li>
</ul>
</form>
</article>
</section>
</section>
</section>
 <jsp:include page="footer_21.jsp"></jsp:include> 
<footer id="footer">
<section class="container">
<figure class="copy-right">
<p>Copyright � 2012. All rights reserved. Designed by <a href="http://crunchpress.com/">CrunchPress.com</a></p>
</figure>
<ul class="f-icons">
<li class="fb"><a href="#">Facebook</a> </li>
<li class="flicker"><a href="#">Flicker</a> </li>
<li class="tweeter"><a href="#">Tweeter</a> </li>
<li class="skype"><a href="#">Skype</a> </li>
<li class="linkdin"><a href="#">LinkdIn</a> </li>
</ul>
</section>
</footer>
</div>

 
<script type="text/javascript" src="${pageContext.request.contextPath }/user/js/jquery00.js"></script>
<script src="${pageContext.request.contextPath }/user/js/modernizr.custom.17475.js"></script>
 
<script type="text/javascript" src="${pageContext.request.contextPath }/user/js/focus.js"></script>
 
<script type="text/javascript" src="${pageContext.request.contextPath }/user/js/bootstrap.js"></script>
 
<script type="text/javascript" src="${pageContext.request.contextPath }/user/js/jquery.elastislide.js"></script>
<script type="text/javascript">

$( '#carousel' ).elastislide();

</script>
 
<script type="text/javascript" src="${pageContext.request.contextPath }/user/js/slider.js"></script>
<script src="${pageContext.request.contextPath }/user/js/cockies.js"></script>
 
<script src="${pageContext.request.contextPath }/user/js/styleswi.js"></script>
 
</body>
</html>
    