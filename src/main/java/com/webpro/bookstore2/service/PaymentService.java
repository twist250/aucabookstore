package com.webpro.bookstore2.service;


import com.webpro.bookstore2.domain.Payment;
import com.webpro.bookstore2.domain.UserPayment;

public interface PaymentService {
	Payment setByUserPayment(UserPayment userPayment, Payment payment);
}
