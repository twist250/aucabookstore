package com.webpro.bookstore2.service.impl;

import com.webpro.bookstore2.domain.UserPayment;
import com.webpro.bookstore2.repository.UserPaymentRepository;
import com.webpro.bookstore2.service.UserPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserPaymentServiceImpl implements UserPaymentService {

	@Autowired
	private UserPaymentRepository userPaymentRepository;
		
	public UserPayment findById(Long id) {
		return userPaymentRepository.findOne(id);
	}
	
	public void removeById(Long id) {
		userPaymentRepository.delete(id);
	}
} 
