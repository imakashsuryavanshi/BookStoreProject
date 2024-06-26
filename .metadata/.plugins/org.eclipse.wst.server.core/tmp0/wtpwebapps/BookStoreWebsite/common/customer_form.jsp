<table class="form">
	<tr>
		<td align="right">Email:</td>
		<td align="left"><input type="text" name="email" id="email"
			size="45" value="${customer.email}" /></td>
	</tr>
	<tr>
		<td align="right">First Name:</td>
		<td align="left"><input type="text" name="firstname"
			id="firstname" size="45" value="${customer.firstname}" /></td>
	</tr>
	<tr>
		<td align="right">Last Name:</td>
		<td align="left"><input type="text" name="lastname" id="lastname"
			size="45" value="${customer.lastname}" /></td>
	</tr>
	<tr>
		<td align="right">Password:</td>
		<td align="left"><input type="password" name="password"
			id="password" size="45" value="${customer.password}" /></td>
	</tr>
	<tr>
		<td align="right">Confirm Password:</td>
		<td align="left"><input type="password" name="confirmPassword"
			id="confirmPassword" size="45" value="${customer.password}" /></td>
	</tr>
	<tr>
		<td align="right">Phone Number:</td>
		<td align="left"><input type="text" name="phone" id="phone"
			size="45" value="${customer.phone}" /></td>
	</tr>
	<tr>
		<td align="right">Address Line 1:</td>
		<td align="left"><input type="text" name="address1" id="address1"
			size="45" value="${customer.addressLine1}" /></td>
	</tr>
	<tr>
		<td align="right">Address Line 2:</td>
		<td align="left"><input type="text" name="address2" id="address2"
			size="45" value="${customer.addressLine2}" /></td>
	</tr>
	<tr>
		<td align="right">City:</td>
		<td align="left"><input type="text" name="city" id="city"
			size="45" value="${customer.city}" /></td>
	</tr>
	<tr>
		<td align="right">State:</td>
		<td align="left"><input type="text" name="state" id="state"
			size="45" value="${customer.state}" /></td>
	</tr>
	<tr>
		<td align="right">Zip Code:</td>
		<td align="left"><input type="text" name="zipCode" id="zipCode"
			size="45" value="${customer.zipcode}" /></td>
	</tr>
	<tr>
		<td align="right">Country:</td>
		<td align="left">
			<select id="country" name="country">
					<c:forEach items="${mapCountries}" var="country">
						<option value="${country.value}"
							<c:if test='${customer.country eq country.value}'> selected='selected'</c:if>>${country.key}</option>
					</c:forEach>
			</select>
		</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<button type="submit">Save</button>&nbsp;&nbsp;&nbsp; 
			<input type="button" value="Cancel" onclick="history.go(-1);"/>
		</td>
	</tr>
</table>