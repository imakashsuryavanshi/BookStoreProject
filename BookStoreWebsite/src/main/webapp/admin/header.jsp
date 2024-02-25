<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div align="center">
	<div>
		<img alt="BookStoreAdminLogo" src="../images/BookStoreAdminLogo.png" height="90" width="60%">
	</div> <br/> 
	<div>
		Welcome, <c:out value="${sessionScope.useremail}"/> | <a href="logout">Logout</a>
	</div> <br/> 
	<div id="headermenu">
		<div>
			<a href="list_users">
				<img height="70" alt="Users" src="../images/user.png"> <br>Users
			</a> 
		</div>
		<div>
			<a href="list_category">
				<img height="70" alt="Categories" src="../images/category.png"> <br>Categories
			</a> 
		</div>
		<div>
			<a href="list_books">
				<img height="70" alt="Books" src="../images/book.png"> <br>Books
			</a> 
		</div>
		<div>
			<a href="customers">
				<img height="70" alt="Customers" src="../images/customer.png"> <br>Customers
			</a> 
		</div>
		<div>
			<a href="reviews">
				<img height="70" alt="Reviews" src="../images/review.png"> <br>Reviews
			</a> 
		</div>
		<div>
			<a href="orders">
				<img height="70" alt="Orders" src="../images/order.png"> <br>Orders
			</a> 
		</div>
	</div>
	
</div>