<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Order Details - Evergreen Bookstore Administration</title>
	<link rel="stylesheet" href="../css/style.css">
	<script type="text/javascript" src="../js/jquery-3.7.1.min.js"></script>
</head>
<body>
	<jsp:directive.include file="header.jsp" /><br>
	<div align="center">
		<h2 class="pageheading">Details of Order ID: ${order.orderId}</h2>
	</div>

	<c:if test="${message != null}">
	<div align="center">
		<h4 class="message">${message}</h4>
	</div>
	</c:if>
	
	<jsp:directive.include file="../common/common_order_detail.jsp" />
	
	<div align="center">
	<br>
		<a href="edit_order?id=${order.orderId}">Edit this order</a>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="">Delete this order</a>
	</div>
	

	<jsp:directive.include file="footer.jsp" />
	
	<script>
	
	$(document).ready(function(){
		$(".deleteLink").each(function() {
			$(this).on("click", function(){
				reviewId = $(this).attr("id");
				if(confirm('Are you sure you want to delete the review with ID '+reviewId+' ?')){
					window.location = 'delete_review?id='+reviewId;
				}
			});
		});
	});
		
	</script>
</body>
</html>