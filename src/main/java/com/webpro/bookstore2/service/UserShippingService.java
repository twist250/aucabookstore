package com.webpro.bookstore2.service;


import com.webpro.bookstore2.domain.UserShipping;

public interface UserShippingService {
	UserShipping findById(Long id);
	
	void removeById(Long id);
}
