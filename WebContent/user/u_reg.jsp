<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>User Registration</title>
<meta name="description" content="Place your description here">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<script type="text/javascript">
//<![CDATA[
try{if (!window.CloudFlare) {var CloudFlare=[{verbose:0,p:0,byc:0,owlid:"cf",bag2:1,mirage2:0,oracle:0,paths:{cloudflare:"/cdn-cgi/nexp/dok3v=1613a3a185/"},atok:"72c4cf8fdab30920768768106553caef",petok:"c711af821a2c59e68102d17e38fbcae1b0926805-1427956717-1800",zone:"crunchpress.com",rocket:"0",apps:{}}];CloudFlare.push({"apps":{"ape":"28ebf57f5913081a707f59771d93962e"}});!function(a,b){a=document.createElement("script"),b=document.getElementsByTagName("script")[0],a.async=!0,a.src="//ajax.cloudflare.com/cdn-cgi/nexp/dok3v=7e13c32551/cloudflare.min.js",b.parentNode.insertBefore(a,b)}()}}catch(e){};
//]]>
function validate()
{
	var categoryName=document.getElementById("userName");
	var span1=document.getElementById("span1");
	
	var xmlhttp;
	if (window.XMLHttpRequest)
	{// code for IE7+, Firefox, Chrome, Opera, Safari
		xmlhttp=new XMLHttpRequest();
	}
	else
	{// code for IE6, IE5
		xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
	}
	
	xmlhttp.onreadystatechange = function() {
		if (xmlhttp.readyState == 4) {
			
			var jsonObj = JSON.parse(xmlhttp.responseText);
			var returnObj = jsonObj[0].returnFlag;
			
			if(returnObj == "true")
			{
				span1.style.display="none";
				temp="true";
			}
			else if(returnObj == "false")
			{
				span1.style.display="";
			}
		}
	}
	xmlhttp.open("get", "${pageContext.request.contextPath}/U_Reg_Controller?flag=validate&userName="+userName.value, true);
	xmlhttp.send();	
}

function returnValidate()
{
	if(temp != "true")
	{
		return false;
	}
	else
	{
		return true;
	}
}

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
 
<section id="banner" class="inner-b"> <img src="images/404_01.png" alt=""/> </section>
 
 
 
 
<section class="content-holder1 inner-pages">
<section class="container">
<section class="help-holder">
<article class="left">
<div class="form">
      
     
      
      <div class="tab-content">
        <div id="signup" style="margin-left: 450px">   
          <h1>Sign Up</h1>
          
          <form action="<%=request.getContextPath()%>/U_Reg_Controller" onsubmit="return returnValidate()" method="post">
          
          <div class="top-row">
            <div class="field-wrap">
              <label>
                First Name<span class="req">*</span>
              </label>
              <input type="text" name="fname" required autocomplete="off" required/>
            </div>
        
            <div class="field-wrap">
              <label>
                Last Name<span class="req">*</span>
              </label>
              <input type="text"  name="lname"required autocomplete="off" required/>
            </div>
          </div>

		<div class="field-wrap" >
              <label>
                Address<span class="req">*</span>
              </label>
              <input type="text"  name="ad"required autocomplete="off" required/>
            </div>  
          <div class="field-wrap">
              <label>
                City<span class="req">*</span>
              </label>
              <input type="text"  name="city"required autocomplete="off" required/>
            </div>
          </div>          
          <div class="field-wrap" style="margin-left: 450px">
              <label>
                Contact No<span class="req">*</span>
              </label>
              <input type="text"  name="c_no"required autocomplete="off" required/>
            </div>
          </div>
          </div>
          <div class="field-wrap" style="margin-left: 450px">
            <label>
              Email Address<span class="req">*</span>
            </label>
            <input type="email"name="userName" id="userName" onblur="return validate()"required autocomplete="off" required/>
          </div>          
          <div class="field-wrap" style="margin-left: 450px">
            <label>
              Set A Password<span class="req">*</span>
            </label>
            <input type="password" name="userPassword"required autocomplete="off" required/>
          </div>        
          <input type="hidden" name="flag" value="insert">
            
          <button type="submit"  class="button button-block" style="margin-left: 450px" >Submit</button>
            
          </form>

</div>
 



        </div>
        
                
      </div><!-- tab-content -->
      
</div> <!-- /form -->


</article>
</section>
</section>
</section>
 
<footer id="footer">
<section class="container">
<figure class="copy-right">
<p>Copyright ? 2012. All rights reserved. Designed by <a href="http://crunchpress.com/">CrunchPress.com</a></p>
</figure>
<ul class="f-icons">
<li class="fb"><a href="https://www.facebook.com/">Facebook</a> </li>
<li class="flicker"><a href="https://www.flickr.com/">Flicker</a> </li>
<li class="tweeter"><a href="https://twitter.com/?lang=en">Tweeter</a> </li>
<li class="skype"><a href="http://www.skype.com/en/">Skype</a> </li>
<li class="linkdin"><a href="https://in.linkedin.com/">LinkdIn</a> </li>
</ul>
</section>
</footer>
</div>

 
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
    