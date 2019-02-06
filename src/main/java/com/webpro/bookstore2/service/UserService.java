package com.webpro.bookstore2.service;

import com.webpro.bookstore2.domain.User;
import com.webpro.bookstore2.domain.UserBilling;
import com.webpro.bookstore2.domain.UserPayment;
import com.webpro.bookstore2.domain.UserShipping;
import com.webpro.bookstore2.domain.security.PasswordResetToken;
import com.webpro.bookstore2.domain.security.UserRole;

import java.util.Set;


public interface UserService {
	PasswordResetToken getPasswordResetToken(final String token);
	
	void createPasswordResetTokenForUser(final User user, final String token);
	
	User findByUsername(String username);
	
	User findByEmail(String email);
	
	User findById(Long id);
	
	User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	User save(User user);
	
	void updateUserBilling(UserBilling userBilling, UserPayment userPayment, User user);
	
	void updateUserShipping(UserShipping userShipping, User user);
	
	void setUserDefaultPayment(Long userPaymentId, User user);
	
	void setUserDefaultShipping(Long userShippingId, User user);
}
