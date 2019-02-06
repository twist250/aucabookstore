package com.webpro.bookstore2.service.impl;

import com.webpro.bookstore2.domain.UserShipping;
import com.webpro.bookstore2.repository.UserShippingRepository;
import com.webpro.bookstore2.service.UserShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserShippingServiceImpl implements UserShippingService {
	
	@Autowired
	private UserShippingRepository userShippingRepository;
	
	
	public UserShipping findById(Long id) {
		return userShippingRepository.findOne(id);
	}
	
	public void removeById(Long id) {
		userShippingRepository.delete(id);
	}

}
