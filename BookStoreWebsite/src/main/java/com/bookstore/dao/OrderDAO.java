package com.bookstore.dao;

import java.util.Date;
import java.util.List;

import com.bookstore.entity.BookOrder;

public class OrderDAO extends JpaDAO<BookOrder> implements GenericDAO<BookOrder> {

	@Override
	public BookOrder create(BookOrder order) {
		order.setOrderDate(new Date());
		order.setPaymentMethod("Cash On Delivery");
		order.setStatus("Processing");
		
		return super.create(order);
	}

	@Override
	public BookOrder update(BookOrder e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookOrder get(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Object id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BookOrder> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

}