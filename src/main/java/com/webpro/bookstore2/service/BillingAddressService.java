package com.webpro.bookstore2.service;


import com.webpro.bookstore2.domain.BillingAddress;
import com.webpro.bookstore2.domain.UserBilling;

public interface BillingAddressService {
	BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress);
}
