package com.bookstore.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.bookstore.entity.Customer;

class CustomerDAOTest {
	private static CustomerDAO customerDao;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		customerDao = new CustomerDAO();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		customerDao.close();
	}

	@Test
	void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setEmail("pradeepS@gmail.com");
		customer.setFullname("Pradeep Suryavanshi");
		customer.setCity("Mumbai");
		customer.setCountry("India");
		customer.setAddress("Kisan Nagar");
		customer.setZipcode("400604");
		customer.setPhone("8877556644");
		customer.setPassword("secret");
		
		Customer savedCustomer = customerDao.create(customer);
		
		assertTrue(savedCustomer.getCustomerId() > 0);
	}

	@Test
	void testGet() {
		Integer customerId = 1;
		Customer customer = customerDao.get(customerId);
		
		assertNotNull(customer);
	}

	@Test
	public void testUpdateCustomer() {
		Customer customer = customerDao.get(1);
		String fullName = "Akash S";
		customer.setFullname(fullName);
		
		Customer updatedCustomer = customerDao.update(customer);
		
		assertTrue(updatedCustomer.getFullname().equals(fullName));
	}
	
	@Test
	void testDeleteObject() {
		Integer customerId = 2;
		customerDao.delete(customerId);
		
		Customer customer = customerDao.get(customerId);

		assertNull(customer);
	}
	
	@Test
	public void testListAll() {
		List<Customer> listCustomers = customerDao.listAll();
		for(Customer customer : listCustomers) {
			System.out.println(customer.getFullname());
		}
		
		assertFalse(listCustomers.isEmpty());
	}

	@Test
	public void testCount() {
		long totalCustomers = customerDao.count();
		
		assertEquals(2, totalCustomers);
	}
	
	@Test
	public void testFindByEmail() {
		String email ="akaSurya@gmail.com";
		Customer customer = customerDao.findByEmail(email);
		
		assertNotNull(customer);
	}
	
	@Test
	public void testCheckLoginSuccess() {
		String email = "akasurya@gmail.com";
		String password = "secret";
		
		Customer customer = customerDao.checkLogin(email, password);
		
		assertNotNull(customer);
	}
	
	@Test
	public void testCheckLoginFail() {
		String email = "aka@gmail.com";
		String password = "secret";
		
		Customer customer = customerDao.checkLogin(email, password);
		
		assertNull(customer);
	}
}
