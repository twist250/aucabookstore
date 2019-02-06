package com.webpro.bookstore2.service;


import com.webpro.bookstore2.domain.UserPayment;

public interface UserPaymentService {
	UserPayment findById(Long id);
	
	void removeById(Long id);
}
