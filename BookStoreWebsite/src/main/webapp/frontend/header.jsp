<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div align="center">
	<div>
		<img alt="BookStoreLogo" src="images/BookStoreLogo.png" height="90" width="60%"/> <br/><br/>
	</div>
	<div>
		<input type="text" size="50" name="keyword"/> &nbsp;
		<input type="button" value="Search"/>
		
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="login">Sign In</a>	|
		<a href="register">Register</a>	|	
		<a href="view_cart">Cart</a>				
	</div>
	<div>&nbsp;</div>
	<div>
		<c:forEach var="category" items="${listCategory}" varStatus="status">
			<a href="view_category?id=${category.categoryId}">
				<font size="+1"><b><c:out value="${category.name}" /></b></font> 
			</a>
			<c:if test="${not status.last}">
				&nbsp; | &nbsp;
			</c:if>
		</c:forEach>
	</div>
</div>