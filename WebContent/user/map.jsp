<!DOCTYPE html>
<%@page import="javax.script.ScriptEngineManager"%>
<%-- <%@page import="sun.security.krb5.SCDynamicStoreConfig"%> --%>
<%@page import="javax.script.ScriptEngine"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
<head>
<title>Google Map</title>
<meta name="viewport" content="initial-scale=1.0, user-scalable=no">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<meta charset="utf-8">

<style>
html,body,#map-canvas {
	height: 100%;
	margin: 0px;
	padding: 0px
}
</style>

<script
	src="https://maps.googleapis.com/maps/api/js?v=3.exp&signed_in=true&language=en">
	
</script>

<script>
	google.maps.event.addDomListener(window, 'load', initialize);
	var staffPincode,patientidSend;
	staffPincode='<%=session.getAttribute("pincode")%>';
	var assignAmbID;
	var map;
	var geocoder;
	var markerss = [];
	var infowindow = new google.maps.InfoWindow();
	geocoder = new google.maps.Geocoder();
	var country, state, city, pinCode, pnc;
	var pin123 = 0;
	function createCORSRequest(method, url) {
		var xhr = new XMLHttpRequest();

		if ("withCredentials" in xhr) {
			// XHR for Chrome/Firefox/Opera/Safari.
			xhr.open(method, url, true);

		} else if (typeof XDomainRequest != "undefined") {
			// XDomainRequest for IE.
			xhr = new XDomainRequest();
			xhr.open(method, url);

		} else {
			// CORS not supported.
			xhr = null;
		}
		return xhr;
	}

	function temp(x, y) {
		return x * y;
	}

	function initialize() {
		var mapOptions = {
			zoom : 8,
			center : new google.maps.LatLng(23.2167, 72.6833)
		};
		map = null;
		map = new google.maps.Map(document.getElementById('map-canvas'),
				mapOptions);

	}

	function loadAmbulance(i, lat, lon) {
		var xmlhttp;
		if (window.XMLHttpRequest) {
			xmlhttp = new XMLHttpRequest();
		} else {
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
		xmlhttp.onreadystatechange = function() {
			if (xmlhttp.readyState == 4) {
				if (xmlhttp.status == 200) {

					alert("marker jj kk ll is" + xmlhttp.responseText);
					data1 = xmlhttp.responseXML.documentElement
							.getElementsByTagName("data1");

					if (data1.length > 0) {
						for (i = 0; i < data1.length; i++) {

							try {

								id = data1[i].childNodes[0].firstChild.nodeValue;
								assignAmbID = id;
								lattitude = data1[i].childNodes[1].firstChild.nodeValue;
								logitude = data1[i].childNodes[2].firstChild.nodeValue;
								no = data1[i].childNodes[3].firstChild.nodeValue;
								status = data1[i].childNodes[4].firstChild.nodeValue;

								fnpincode1(id, lattitude, logitude, no, status);

								//table
								var tmptr = document.createElement("tr");

								var tmptd0 = document.createElement("td");
								tmptd0.innerHTML = id;
								tmptd0.setAttribute("style", "display:none")

								var tmptd1 = document.createElement("td");
								tmptd1.innerHTML = no;

								var tmptd2 = document.createElement("td");
								tmptd2.innerHTML = lattitude;

								var tmptd3 = document.createElement("td");
								tmptd3.innerHTML = logitude;

								var tmptd4 = document.createElement("td");
								tmptd4.innerHTML = status;

								var tmptd5 = document.createElement("td");
								var actionbtn = document.createElement("input");

								actionbtn.setAttribute("type", "button");
								actionbtn.setAttribute("onclick",
										"changeAmbStatus(this)");
								actionbtn.setAttribute("value", "changestatus");

								tmptd5.appendChild(actionbtn);
								tmptr.appendChild(tmptd0);
								tmptr.appendChild(tmptd1);
								tmptr.appendChild(tmptd2);
								tmptr.appendChild(tmptd3);
								tmptr.appendChild(tmptd4);
								tmptr.appendChild(tmptd5);

								tblID.appendChild(tmptr);

							} catch (er) {
								alert(er);
							}
						}
					}

				}
			}
		}
		i = i.replace('pat', '');
		patientidSend = i;
		xmlhttp
				.open(
						"get",
						"${pageContext.request.contextPath}/Manage_ambulance_controller?flag=loadAmb&id="
								+ i + "&lat=" + lat + "&lon=" + lon, true);
		xmlhttp.send();

		/**/

	}

	function rad(x) {
		return x * Math.PI / 180;
	}

	function clearMarkers()
	{
		alert("into clear");
		alert("len is"+ markerss.length);
		  for (var i = 0; i < markerss.length; i++ ) {
			  markerss[i].setMap(null);
			  }
	}
	
	
	function getlatlang() {

		
		
		clearMarkers();
		var dustID = document.getElementById("bbb").value;
		var xmlhttp;
		if (window.XMLHttpRequest) {
			xmlhttp = new XMLHttpRequest();
		} else {
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
		xmlhttp.onreadystatechange = function() {
			if (xmlhttp.readyState == 4) {
				if (xmlhttp.status == 200) {
					alert("text" + xmlhttp.responseText);
					data = xmlhttp.responseXML.documentElement
							.getElementsByTagName("data");
					data1 = xmlhttp.responseXML.documentElement
							.getElementsByTagName("data1");

					if (data.length > 0) {
						for (i = 0; i < data.length; i++) {

							try {
								latitude = data[i].childNodes[0].firstChild.nodeValue;
								longitude = data[i].childNodes[1].firstChild.nodeValue;

								fnpincode(latitude, longitude);

							} catch (er) {
								alert(er);
							}
						}
					}

					//ambulance 4-9-15

				}
			}
		}

		xmlhttp.open("get", "${pageContext.request.contextPath}/MAP?dustID="
				+ dustID, true);
		xmlhttp.send();
	}

	function changeAmbStatus(x) {
		var ambID = x.parentNode.parentNode.childNodes[0].innerHTML;
		var xmlhttp;
		if (window.XMLHttpRequest) {
			xmlhttp = new XMLHttpRequest();
		} else {
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
		xmlhttp.onreadystatechange = function() {
			if (xmlhttp.readyState == 4) {
				if (xmlhttp.status == 200) {

					data = xmlhttp.responseXML.documentElement
							.getElementsByTagName("data");
					data1 = xmlhttp.responseXML.documentElement
							.getElementsByTagName("data1");

				}
			}
		}

		xmlhttp
				.open(
						"get",
						"${pageContext.request.contextPath}/Manage_ambulance_controller?flag=changeStatus&id="
								+ ambID + "&patientidSend=" + patientidSend,
						true);
		xmlhttp.send();

	}

	function fnpincode(latitude, longitude) {

		{

			var myLatlng = new google.maps.LatLng(latitude, longitude);
			var marker = new google.maps.Marker({
				position : myLatlng,

				animation : google.maps.Animation.DROP,

			});
			markerss.push(marker);
			marker.setMap(map);

		}

	}

	function fnpincode1(id, lattitude, logitude, no, status) {
		id = "amb" + id;
		/* if(staffPincode==pnc) */
		for (var i = 0; i < markerss.length; i++) {

			{

				if (markerss[i].get("id") == id) {
					//markerss[i].setMap(null);
					markerss[i].setAnimation(google.maps.Animation.BOUNCE);
					;
				}
			}
		}

	}

	function fnpincode2(id, lattitude, logitude, no, status) {
		if (status == "open") {
			var myLatlng = new google.maps.LatLng(lattitude, logitude);
			var image = 'green.png';
			var marker = new google.maps.Marker({
				position : myLatlng,
				title : "ambulance",
				icon : image,
				animation : google.maps.Animation.DROP,

			});
			marker.set("id", "amb" + id);
			marker.setMap(map);
			markerss.push(marker);

		}

		else {
			var myLatlng = new google.maps.LatLng(lattitude, logitude);
			var image = 'red.png';
			var marker = new google.maps.Marker({
				position : myLatlng,
				title : "ambulance",
				icon : image,
				animation : google.maps.Animation.DROP,

			});
			marker.set("id", "amb" + id);

			marker.setMap(map);
			markerss.push(marker);

		}

	}
</script>
</head>
<body>
	<div class="col-sm-10">
		<select name="area" id="bbb" class="form-control"
			onchange="getlatlang()">
			<!-- <option>Choose One</option> -->
			<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
			<c:forEach items="${sessionScope.area}" var="x">
				<option value="${x.areaId}">${x.areaName}</option>
			</c:forEach>
		</select>
	</div>

	<div id="map-canvas"></div>
	<script type="text/javascript">
		
	</script>

</body>
</html>