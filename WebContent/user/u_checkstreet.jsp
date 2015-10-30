<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="box-content nopadding">
											
			<%-- <jsp:include page="errorNotify.jsp"></jsp:include> --%>
													
				<table class="table table-hover table-nomargin table-bordered dataTable" border="1">
					<thead>
					<tr>
						<th>Street</th>
						<th>Time</th>
						
						 <!-- <th class='hidden-480'>Options</th> -->
					</tr>
					</thead>
					<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
					 <c:forEach items="${sessionScope.checkstreet}" var="x">
					<tr>
						
						<td>${x.streetI.streetName} </td>
						<td>${x.scheduleName.scheduleName}  </td> 
			
					</tr>
					 </c:forEach> 
					
										</tbody>
				</table>
			</div>

</body>
</html>

