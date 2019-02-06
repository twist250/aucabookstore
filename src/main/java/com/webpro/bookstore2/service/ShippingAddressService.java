package com.webpro.bookstore2.service;


import com.webpro.bookstore2.domain.ShippingAddress;
import com.webpro.bookstore2.domain.UserShipping;

public interface ShippingAddressService {
	ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);
}
